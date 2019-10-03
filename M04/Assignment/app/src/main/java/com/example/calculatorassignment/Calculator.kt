package com.example.calculatorassignment

import kotlin.math.absoluteValue


class Math{
    fun sumOfSquares(num1: Long, num2: Long): Long{
        return num1 * num1 + num2 * num2
    }

    fun absoluteDifference(num1: Long, num2: Long): Long{
        val difference = num1 - num2
        return difference.absoluteValue
    }
    fun primeNumber(num: Long): Boolean{
        var flag = true
        for (i in 2..num / 2) {
            if (num % i == 0L) {
                flag = false
                break
            }
        }
        return flag
    }


}

class Calculator(private val math: Math) {

    fun factorial(num1: Long, num2: Long): Long{
        return math.sumOfSquares(num1, num2)
    }

    fun difference(num1: Long, num2: Long): Long{
        return math.absoluteDifference(num1, num2)
    }



}