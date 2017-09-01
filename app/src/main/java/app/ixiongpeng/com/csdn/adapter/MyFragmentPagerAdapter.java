package app.ixiongpeng.com.csdn.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.ListFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiongpeng on 2017/9/1.
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    List<Fragment> fragmentList = null;
    List<String> titleList = null;
    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public MyFragmentPagerAdapter(FragmentManager fm, List<Fragment> listFragment, List<String> titleList) {
        super(fm);
        this.fragmentList = listFragment;
        this.titleList = titleList;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titleList.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return 0;
    }
}
