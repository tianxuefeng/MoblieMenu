package com.aptsys.android.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.aptsys.android.R;
import com.aptsys.android.data.entity.Category;
import com.aptsys.android.thread.CategoryRunnable;
import com.aptsys.android.ui.adapter.CategoryListAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity
        implements CategoryListFragment.Callbacks {

    public static final String CATEGORY_BUNDLE = "CATEGORY_BUNDLE";
    public static final String TAG = "MainActivity";
    private static final int REQUEST_CODE = 1001;
    protected boolean isUpdate, isIntent;
    private boolean isTwoPane = false;
    private Button btnBack, btnAdd;
    private List<Category> groups;
    private Category[][] childs;
    private int groupIndex, childIndex;
    private boolean isChilds;
    private Category curEntity;
    private CategoryListAdapter categoryListAdapter;
    private ListView listView;
    private List<Category> list;
    private CategoryRunnable categoryRunnable;
    private Handler handler = new Handler() {
        public void handleMessage(android.os.Message msg) {
//            if(isProgress()) {
//                dismissDialog(DIALOG_LOAD);
//            }
            if (msg.what == 1) if (msg.obj != null) {
                list = (ArrayList<Category>) msg.obj;

                    /*
                    if(list == null || list.size() < 1) {
                        //labNotInfo.setVisibility(View.VISIBLE);
                        listView.setVisibility(View.GONE);
                    } else {
                        //labNotInfo.setVisibility(View.GONE);
                        listView.setVisibility(View.VISIBLE);
                    }
                    if(categoryListAdapter == null) {
                        categoryListAdapter = new CategoryListAdapter(MainActivity.this, list);
                        listView.setAdapter(categoryListAdapter);
                    } else {
                        categoryListAdapter.notifyDataSetChanged();
                    }
                    */

                // Bundle b = new Bundle();
                // b.putStringArrayList("list", list);
                //listFragment.setArguments(b);
                // getFragmentManager().beginTransaction().add(android.R.id.content,listFragment).commit();
                //getFragmentManager().beginTransaction().commit();

            } else if (msg.what == -1) {

                listView.setVisibility(View.GONE);
                //Toast.makeText(SendCategoryActivity.this, R.string.msg_not_net, Toast.LENGTH_SHORT).show();
            } else {
                //labNotInfo.setVisibility(View.VISIBLE);
                listView.setVisibility(View.GONE);
            }
        }

        ;
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        if (findViewById(R.id.detailContainer) != null) {
            isTwoPane = true;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);

        MenuItem item = menu.add(Menu.NONE, Menu.NONE, 103, "Menu Item3");
        item.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Toast.makeText(MainActivity.this,
                        "You chose Menu Item3", Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        return true;
    }

    @Override
    protected void onResume() {
        super.onResume();
        //initData();
    }

    private void initData() {
        if (list == null || list.size() < 1) {
            if (categoryRunnable != null) {
                categoryRunnable.isStop();
                categoryRunnable = null;
            }
            //showDialog(DIALOG_LOAD);
            //String language = SharePreferenceHelper.getSharepreferenceString(SendCategoryActivity.this, Contant.SETTINGSP, Contant.PREF_LANGUAGE, "");
            categoryRunnable = new CategoryRunnable(handler, "0", "en");
            new Thread(categoryRunnable).start();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {

            Intent intent = new Intent();
            intent.setClass(this, MyPrefsActivity.class);
            startActivityForResult(intent, 1002);

            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemSelected(Category Cate) {
        Bundle b = Cate.toBundle();

        if (isTwoPane) {
            FlowerDetailFragment fragment = new FlowerDetailFragment();
            fragment.setArguments(b);
            getFragmentManager().beginTransaction()
                    .replace(R.id.detailContainer, fragment)
                    .commit();
        } else {
            Intent intent = new Intent(this, FlowerDetailActivity.class);
            intent.putExtra(CATEGORY_BUNDLE, b);
            startActivityForResult(intent, REQUEST_CODE);
        }
        Log.d(TAG, "onItemSelected");
    }

    public void menuItem1ClickHandler(MenuItem item) {
//        String imageName = "image_10102";
//        int res = getResources().getIdentifier(imageName, "drawable", getPackageName());
//        ImageView iv = (ImageView) findViewById(R.id.imageCourse);
//        iv.setImageResource(res);
        Toast.makeText(MainActivity.this,
                "You chose menu Item 1", Toast.LENGTH_SHORT).show();
    }

    public void menuItem2ClickHandler(MenuItem item) {
//        String imageName = "image_50101.jpg";
//        ImageView iv = (ImageView) findViewById(R.id.imageCourse);
//
//        try {
//            InputStream stream = getAssets().open(imageName);
//            Drawable drawable = Drawable.createFromStream(stream, null);
//            iv.setImageDrawable(drawable);
//        } catch (Exception e) {
//            Log.e(LOG_TAG, e.getMessage());
//        }
        Toast.makeText(MainActivity.this,
                "You chose menu Item 2", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1002) {
            SharedPreferences myPrefs =
                    PreferenceManager.getDefaultSharedPreferences(this);
            boolean pref1 = myPrefs.getBoolean("pref1", false);
//            Toast.makeText(this, "Preference: " + pref1, Toast.LENGTH_SHORT).show();

            MyDialogFragment dialog = new MyDialogFragment();

            Bundle b = new Bundle();
            b.putString("message", "Preference: " + pref1);
            dialog.setArguments(b);

            dialog.show(getFragmentManager(), "MyDialog");

        }
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        isIntent = true;
    }

    @Override
    protected void onPause() {
        super.onPause();
        //MobclickAgent.onPause(this);
    }
}
