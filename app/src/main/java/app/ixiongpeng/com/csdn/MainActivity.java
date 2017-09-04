package app.ixiongpeng.com.csdn;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import app.ixiongpeng.com.csdn.adapter.MyFragmentPagerAdapter;
import app.ixiongpeng.com.csdn.ui.Coder;
import app.ixiongpeng.com.csdn.ui.YanFa;
import app.ixiongpeng.com.csdn.ui.YeJieFragment;
import app.ixiongpeng.com.csdn.ui.YiDong;
import app.ixiongpeng.com.csdn.ui.YunJiSuan;


public class MainActivity extends AppCompatActivity {

    String TAG = "MainActivity";


    TabLayout tab;
    ViewPager viewPager;
    public static List<String> titleList = null;
    public static List<Fragment> fragmentList = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        titleList = new ArrayList<String>();
        fragmentList = new ArrayList<Fragment>();

        titleList = Arrays.asList("业界", "移动", "研发", "程序员", "云计算");
        Fragment yejieFrgment = YeJieFragment.newInstances();
        Fragment yiDong = YiDong.newInstances();
        Fragment yanFa = YanFa.newInstances();
        Fragment coder = Coder.newInstances();
        Fragment yunJiSuan = YunJiSuan.newInstances();

        fragmentList.add(yejieFrgment);
        fragmentList.add(yiDong);
        fragmentList.add(yanFa);
        fragmentList.add(coder);
        fragmentList.add(yunJiSuan);

        tab = (TabLayout)findViewById(R.id.tabLayout);
        viewPager = (ViewPager)findViewById(R.id.viewPger);
        viewPager.setAdapter(new MyFragmentPagerAdapter(getSupportFragmentManager()));

        tab.setupWithViewPager(viewPager);

    }
}
