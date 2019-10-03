package com.example.calculatorassignment

import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock

class CalculatorUnitTest {

    private val math = mock(Math::class.java)
    private val calculator = Calculator(math)

    @Test
    fun factorialTest(){
        val num1 = 3L
        val num2 = 3L
        val expected = 18L

        `when` (math.sumOfSquares(num1, num2)).thenReturn(expected)

        val sumOfSquares = calculator.factorial(num1, num2)

        assertEquals(expected, sumOfSquares)
    }

    @Test
    fun deferenceCheck(){
        val num1 = 4L
        val num2 = -8L
        val expected = 12L


        `when` (math.absoluteDifference(num1, num2)).thenReturn(expected)

        // expected should be the same no matter what order the numbers are in I think, but for some reason the mock data messes it up. Oh because it doesn't flip it in the mock data.
        val absoluteValue = calculator.difference(num2, num1)

        assertEquals(expected, absoluteValue)




    }




}
@RunWith(Parameterized::class)
class PrimeTest{
    @Parameterized.Parameters
    fun prime(){
        
    }


}