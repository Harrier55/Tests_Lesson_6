package com.geekbrains.tests.view.search

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import com.geekbrains.tests.R
import org.hamcrest.Matchers.allOf
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun mainActivityTest() {
        onView(
            allOf(withId(R.id.toDetailsActivityButton), isDisplayed())
        ).apply {
            perform(click())
        }

        onView(
            allOf(withId(R.id.incrementButton), isDisplayed())
        ).apply {
            perform(click())
        }

        onView(
            allOf(withId(R.id.totalCountTextView), isDisplayed())
        ).apply {
            check(matches(withText("Number of results: 1")))
        }

    }

}
