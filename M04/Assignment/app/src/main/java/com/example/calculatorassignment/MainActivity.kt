package com.example.calculatorassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainFunction()

    }

    private fun mainFunction(){
        button_squares_add.setOnClickListener {
            val et1 = et_squares_one.text.toString()
            val et2 = et_squares_two.text.toString()
            if (et1.isNotBlank() && et2.isNotBlank()) {
                val num1 = et1.toLong()
                val num2 = et2.toLong()
                tv_squares.text = Math().sumOfSquares(num1, num2).toString()

            }
        }
    }
}
