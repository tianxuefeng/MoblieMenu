package com.aptsys.android.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;

import com.aptsys.android.R;

// This activity is only used in single pane mode.
public class FlowerDetailActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flower_detail);

        getActionBar().setDisplayHomeAsUpEnabled(true);

        if (savedInstanceState == null) {
//          Create the fragment, set its args, add it to the detail container
            FlowerDetailFragment fragment = new FlowerDetailFragment();

            Bundle b = getIntent().getBundleExtra(MainActivity.CATEGORY_BUNDLE);
            fragment.setArguments(b);

            getFragmentManager().beginTransaction()
                    .add(R.id.detailContainer, fragment)
                    .commit();
        }

    }

    //  Returns to the list activity
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return true;
    }

}
