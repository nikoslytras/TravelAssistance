package com.example.first_try;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CategoryAdapter_FRA extends FragmentPagerAdapter {
    private Context mContext;

    public CategoryAdapter_FRA(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }


    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Around_Town_FRA();
        } else if (position == 1) {
            return new At_the_Airport_FRA();
        } else if (position == 2) {
            return new Greetings_FRA();
        } else {
            return new Common_Problems_FRA();
        }
    }


    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.sthn_polh_eng);
        } else if (position == 1) {
            return mContext.getString(R.string.aerodromio_eng);
        } else if (position == 2) {
            return mContext.getString(R.string.xeretismoi_eng);
        } else {
            return mContext.getString(R.string.provlimata_eng);
        }
    }
}
