package com.rajeshdonepudi.myapplication;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

class PagerViewAdapter extends FragmentPagerAdapter {

    public PagerViewAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                Users users = new Users();
                return users;

            case 1:
                notifications notifications1 =new notifications();
                return notifications1;

            case 2:
                Profile profile = new Profile();
                return profile;

                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
