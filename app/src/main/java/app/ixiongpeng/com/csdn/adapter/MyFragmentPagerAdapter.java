package app.ixiongpeng.com.csdn.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.ListFragment;

import java.util.ArrayList;
import java.util.List;

import app.ixiongpeng.com.csdn.MainActivity;

/**
 * Created by xiongpeng on 2017/9/1.
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    List<Fragment> fragmentList = null;
    public MyFragmentPagerAdapter(FragmentManager fm, List<Fragment> fragmentList) {
        super(fm);
        this.fragmentList = fragmentList;
    }



    @Override
    public CharSequence getPageTitle(int position) {
        return MainActivity.titleList.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        return this.fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return 0;
    }
}
