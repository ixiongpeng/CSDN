package app.ixiongpeng.com.csdn;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import app.ixiongpeng.com.csdn.adapter.MyFragmentPagerAdapter;
import app.ixiongpeng.com.csdn.ui.YeJieFragment;

public class MainActivity extends AppCompatActivity {

    String TAG = "MainActivity";

    TableLayout tableLayout;
    ViewPager viewPager;
    List<String> titleList = null;
    List<Fragment> fragmentList = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        titleList = new ArrayList<String>();
        fragmentList = new ArrayList<Fragment>();


        Fragment yejieFrgment = YeJieFragment.instantiate(this, "yejie");
        titleList = Arrays.asList("业界", "移动", "研发", "程序员", "云计算");
        fragmentList.add(yejieFrgment);

        tableLayout = (TableLayout)findViewById(R.id.tabLayout);
        viewPager = (ViewPager)findViewById(R.id.viewPger);

        viewPager.setAdapter(new MyFragmentPagerAdapter(getSupportFragmentManager(),fragmentList, titleList));


    }
}
