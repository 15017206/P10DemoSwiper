package com.example.a15017206.demoswiper;


// Be careful when importing
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import java.util.ArrayList;


import java.util.ArrayList;

/**
 * Created by 15017206 on 27/7/2017.
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    ArrayList<Fragment> fragments;

    public MyFragmentPagerAdapter(FragmentManager fm, ArrayList<Fragment> al){
        super(fm);
        fragments = al;
    }
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

}
