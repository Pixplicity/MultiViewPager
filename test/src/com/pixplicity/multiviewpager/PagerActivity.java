package com.pixplicity.multiviewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class PagerActivity extends FragmentActivity {

    private MultiViewPager mPager;
    private FragmentStatePagerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pager);

        TextView tvInfo = (TextView) findViewById(R.id.tv_info);
        tvInfo.setMovementMethod(LinkMovementMethod.getInstance());
        tvInfo.setText(Html.fromHtml(getResources().getString(R.string.info_link)));

        mPager = (MultiViewPager) findViewById(R.id.pager);

        mAdapter = new FragmentStatePagerAdapter(getSupportFragmentManager()) {

            @Override
            public int getCount() {
                return 4;
            }

            @Override
            public Fragment getItem(int position) {
                return new PageFragment();
            }
        };
        mPager.setAdapter(mAdapter);
    }

}
