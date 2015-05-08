package com.bignerdranch.android.criminalintent;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class CrimeActivity extends SingleFragmentActivityActivity implements CrimeFragment.OnFragmentInteractionListener{

    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
