package com.tubesmanpropel.devhouse.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.tubesmanpropel.devhouse.SellerDiskusiFragment;
import com.tubesmanpropel.devhouse.SellerProdukFragment;

public class PagerAdapter extends FragmentPagerAdapter {

    private int numOfTabs;

    public PagerAdapter(FragmentManager fm, int numOfTabs) {

        super(fm);
        this.numOfTabs = numOfTabs;
    }


    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new SellerProdukFragment();
            case 1:
                return new SellerDiskusiFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {

        return numOfTabs;
    }

    //@Override
    //public int getItemPosition(@NonNull Object object) {
    //    return POSITION_NONE;
    //}
}
