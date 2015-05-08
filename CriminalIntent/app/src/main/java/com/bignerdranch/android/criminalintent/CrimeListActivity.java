package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by trung.do on 4/29/2015.
 */
public class CrimeListActivity extends SingleFragmentActivityActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
