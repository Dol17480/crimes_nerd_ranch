package com.example.user.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by user on 13/11/2016.
 */

public class CrimeListActivity extends SingleFragmentActivity{

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
