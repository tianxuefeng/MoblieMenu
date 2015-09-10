package com.aptsys.android.fragments;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import com.aptsys.android.R;

/**
 * Created by David on 7/21/2014.
 */
public class MyPrefsFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.preferences);

    }
}
