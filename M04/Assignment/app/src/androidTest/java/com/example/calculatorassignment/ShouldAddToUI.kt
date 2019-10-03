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
        val num1 = 3L
        val num2 = 3L
        onView(withId(R.id.et_squares_one)).perform(typeText(num1.toString()))
        onView(withId(R.id.et_squares_two)).perform(typeText(num2.toString()))

        onView(withId(R.id.button_squares_add)).perform(click())

        onView(withId(R.id.tv_squares)).check(matches(withText(Math().sumOfSquares(num1, num2).toString())))
    }

    @Test
    fun testDifference(){
        val num1 = 3L
        val num2 = 3L
        onView(withId(R.id.et_difference_one)).perform(typeText(num1.toString()))
        onView(withId(R.id.et_difference_two)).perform(typeText(num2.toString()))

        onView(withId(R.id.button_difference_add)).perform(click())

        onView(withId(R.id.tv_difference)).check(matches(withText(Math().absoluteDifference(num1, num2).toString())))
    }

    @Test
    fun prime(){
        val num = 11L
        onView(withId(R.id.et_prime)).perform(typeText(num.toString()))

        onView(withId(R.id.button_prime)).perform(click())

        onView(withId(R.id.tv_prime)).check(matches(withText("$num is a prime number")))
    }
}