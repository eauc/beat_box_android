package com.bignerdranch.android.beatbox;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static org.hamcrest.Matchers.*;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class BeatBoxActivityTest {
    @Rule
    public ActivityTestRule<BeatBoxActivity> mActivityRule =
            new ActivityTestRule(BeatBoxActivity.class);

    @Test
    public void showsFirstFileName() {
        onView(withText("65_cjipie"))
                .check(matches(anything()));
    }
}