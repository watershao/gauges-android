package com.github.mobile.gauges.test;

import android.test.ActivityInstrumentationTestCase2;

import com.github.mobile.gauges.ui.GaugeListActivity;

/**
 * Tests of displaying a list of gauges
 */
public class GaugeListTest extends
		ActivityInstrumentationTestCase2<GaugeListActivity> {

	public GaugeListTest() {
		super("com.github.mobile.gauges.ui", GaugeListActivity.class);
	}

	public void testActivity() {
		assertNotNull(getActivity());
	}
}