package com.example.viewpagefragmenttablabyout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerViewAdapter extends FragmentPagerAdapter {


    public PagerViewAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        Fragment fragment=null;
        switch (position)
        {
            case 0:
                fragment= new chatFragment();
                break;



            case 1:
                fragment= new statusFragment();
                break;



            case 2:
                fragment= new callFragment();
                break;
        }










        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
