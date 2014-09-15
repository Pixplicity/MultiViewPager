MultiViewPager
==============

The MultiViewPager is an extension of the support-v4 library's ViewPager that allows the pages to be wider or narrower than the ViewPager itself. It takes care of aligning the pages next to each other, and always keeping the selected page centered.

![Sample app](http://i.imgur.com/0yGMSyE.gif)

Simply add the MultiViewPager into your layout:

    <com.pixplicity.multiviewpager.MultiViewPager
        android:id="@+id/pager"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_marginTop="16dp"
        android:layout_weight="1"
        app:matchChildWidth="@+id/child_view_to_match" />

Be sure to declare the `app` namespace:  
`xmlns:app="http://schemas.android.com/apk/res-auto"`

Take note of the custom attribute `matchChildWidth`. This attribute should match an ID in the ViewPager's first child view. In the sample project, the layout of the pages is:

	<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
	    xmlns:app="http://schemas.android.com/apk/res-auto"
	    xmlns:tools="http://schemas.android.com/tools"
	    android:layout_width="match_parent"
	    android:layout_height="match_parent"
	    tools:context="${relativePackage}.${activityClass}" >
	
	    <FrameLayout
	        android:id="@+id/vg_cover"
	        android:layout_width="200dp"
	        android:layout_height="match_parent"
	        android:layout_centerInParent="true" >
	
	        <ImageView
	            android:layout_width="match_parent"
	            android:layout_height="match_parent"
	            android:layout_marginLeft="16dp"
	            android:layout_marginRight="16dp"
	            android:background="@drawable/bg_page"
	            android:scaleType="centerInside"
	            android:src="@drawable/im_pixplicity"
	            tools:ignore="ContentDescription" />
	    </FrameLayout>
	
	</RelativeLayout>
	
Therefore, the MultiViewPager matches `@id/vg_cover`:

    <com.pixplicity.multiviewpager.MultiViewPager
        android:id="@+id/pager"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_marginTop="16dp"
        android:layout_weight="1"
        app:matchChildWidth="@+id/vg_cover" />

In this way, it knows to size the pages according to the dimension of that View or ViewGroup.
