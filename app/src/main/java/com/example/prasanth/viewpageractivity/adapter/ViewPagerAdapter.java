package com.example.prasanth.viewpageractivity.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.prasanth.viewpageractivity.fragments.FirstFragment;
import com.example.prasanth.viewpageractivity.fragments.SecondFragment;
import com.example.prasanth.viewpageractivity.fragments.ThirdFragment;

/**
 * Created by Prasanth on 11/7/2017.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private int itemCount = 3;
    private String pageTitles[] = {
            "Fragment1",
            "Fragment2",
            "Fragment3"
    };

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FirstFragment();
            case 1:
                return new SecondFragment();
            case 2:
                return new ThirdFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return itemCount;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return pageTitles[position];
    }
}
