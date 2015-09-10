package com.aptsys.android.fragments;

import android.app.Activity;
import android.app.ListFragment;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import com.aptsys.android.R;
import com.aptsys.android.data.entity.Category;
import com.aptsys.android.data.service.CategoryService;

import java.util.List;

/**
 * Created by David on 7/16/2014.
 */
public class CategoryListFragment extends ListFragment {

    List<Category> categories = null;
    CategoryArrayAdapter songListAdapter = null;
    private ProgressDialog progressDialog = null;
    private Callbacks activity;
    private CategoryService categoryService;
    private LoadTask loadTask;

    public CategoryListFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        loadData();
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.category_list_fragment, container, false);
        return rootView;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Category categoryEntity = categories.get(position);
        activity.onItemSelected(categoryEntity);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.activity = (Callbacks) activity;

        categoryService = new CategoryService();
    }

    private void loadData() {
        loadTask = new LoadTask();
        loadTask.execute();
    }

    public void showProgress(String string) {
        if (progressDialog == null) {
            progressDialog = new ProgressDialog(getActivity());
        }
        progressDialog.setCancelable(false);
        progressDialog.setMessage(string);
        progressDialog.show();
    }

    public void dismissProgress() {
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    private void showToast(String msg) {
        Toast.makeText(getActivity().getApplicationContext(), msg, Toast.LENGTH_LONG).show();
    }

    public interface Callbacks {
        public void onItemSelected(Category categoryEntity);
    }

    private class LoadTask extends AsyncTask<Void, Void, Integer> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showProgress("loading");
        }

        @Override
        protected Integer doInBackground(Void... params) {
            try {
                List<Category> dataList = categoryService.getList("", "");
                categories = dataList;
                return dataList != null ? dataList.size() : 0;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Integer result) {
            super.onPostExecute(result);
            dismissProgress();
            if (result == null || result == 0) {
                showToast("获取列表数据失败！");

            } else {

                songListAdapter = new CategoryArrayAdapter(getActivity(), R.layout.flower_listitem, categories);
                setListAdapter(songListAdapter);
                songListAdapter.notifyDataSetChanged();
            }
        }
    }
}
