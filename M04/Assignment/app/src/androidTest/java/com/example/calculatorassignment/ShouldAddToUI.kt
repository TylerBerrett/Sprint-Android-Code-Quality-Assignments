package com.example.calculatorassignment

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.FixMethodOrder
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.MethodSorters

@RunWith(AndroidJUnit4::class)
@LargeTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

class ShouldAddToUI {

    @Rule
    @JvmField
    var activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testSquares(){
        onView(withId(R.id.et_squares_one)).perform(typeText("3"))
        onView(withId(R.id.et_squares_two)).perform(typeText("3"))

        onView(withId(R.id.button_squares_add)).perform(click())

        onView(withId(R.id.tv_squares)).check(matches(withText("18")))
    }
}