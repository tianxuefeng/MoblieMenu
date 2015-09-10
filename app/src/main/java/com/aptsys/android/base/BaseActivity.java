package com.aptsys.android.base;

import com.rockeagle.framework.core.REActivity;

public class BaseActivity extends REActivity {

    @Override
    protected void onResume() {
        super.onResume();
        //MobclickAgent.onResume(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        //MobclickAgent.onPause(this);
    }
}
