package com.pixplicity.multiviewpager.sample.test;

import android.test.ActivityInstrumentationTestCase2;
import android.view.View;

import com.pixplicity.multiviewpager.MultiViewPager;
import com.pixplicity.multiviewpager.sample.PagerActivity;
import com.pixplicity.multiviewpager.sample.R;

public class PagerActivityTest extends ActivityInstrumentationTestCase2<PagerActivity> {

    public PagerActivityTest() {
        super(PagerActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        final PagerActivity mPagerTestActivity = getActivity();
        final View view = mPagerTestActivity.findViewById(R.id.pager);
        assertNotNull("View with id:" + String.valueOf(R.id.pager), view);
        assertTrue("view is instance of class MultiViewPager", view instanceof MultiViewPager);
        final MultiViewPager pager = (MultiViewPager) view;
        assertEquals("view pager has number of pages", 4, pager.getChildCount());
    }
}
