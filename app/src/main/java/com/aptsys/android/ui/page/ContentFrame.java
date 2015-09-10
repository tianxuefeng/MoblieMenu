package com.aptsys.android.ui.page;

import android.os.Bundle;
import android.support.v4.app.Fragment;

public class ContentFrame extends Fragment {

    public static final String KEY = "key";
    private Navigation navigation;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    public Navigation getNavigation() {
        return navigation;
    }

    public void setNavigation(Navigation navigation) {
        this.navigation = navigation;
    }

}
