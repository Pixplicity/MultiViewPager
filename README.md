MultiViewPager
==============
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-MultiViewPager-brightgreen.svg?style=flat)](https://android-arsenal.com/details/1/1489)
[![Build Status](https://travis-ci.org/Pixplicity/MultiViewPager.svg?branch=master)](https://travis-ci.org/Pixplicity/MultiViewPager)

*UPDATE:* This behavior is now included in the RecyclerView for support lib 24.2.0 and later. Please look at using [LinearSnapHelper](https://developer.android.com/reference/android/support/v7/widget/LinearSnapHelper.html).

The MultiViewPager is an extension of the support-v4 library's ViewPager that allows the pages to be wider or narrower than the ViewPager itself. It takes care of aligning the pages next to each other, and always keeping the selected page centered.

![Sample app](http://i.imgur.com/0yGMSyE.gif)

## Sample

Simply add the MultiViewPager into your layout:

    <com.pixplicity.multiviewpager.MultiViewPager
        android:id="@+id/pager"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
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
	            android:padding="16dp"
	            android:background="@drawable/bg_page"
	            android:scaleType="centerInside"
	            android:src="@drawable/im_pixplicity"
	            tools:ignore="ContentDescription" />
	            
	    </FrameLayout>
	
	</RelativeLayout>

The child view with ID `@id/vg_cover` will determine the width of the page. In this example, the width would be 200dp. In order to get this hooked up, we provide MultiViewPager with the reference to the child, `@id/vg_cover`:

    <com.pixplicity.multiviewpager.MultiViewPager
        android:id="@+id/pager"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:matchChildWidth="@+id/vg_cover" />

In this way, it knows to size the pages according to the dimension of that View or ViewGroup.

## Download

Download the latest [AAR](http://search.maven.org/#search|ga|1|g:"com.pixplicity.multiviewpager") or grab via Maven:
```XML
<dependency>
  <groupId>com.pixplicity.multiviewpager</groupId>
  <artifactId>library</artifactId>
  <version>1.0</version>
  <type>aar</type>
</dependency>
```

or Gradle:
```Java
compile 'com.pixplicity.multiviewpager:library:1.0'
```

## License

Licensed under the Apache license.
