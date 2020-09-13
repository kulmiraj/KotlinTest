package com.sobha.kotlintest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class Assignment4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_assignment4)

        var Number: Int = 100
        var FizzBuzz: String = "FizzBuzz"
        var Buzz: String = "Buzz"
        var Fizz: String = "Fizz"
        // loop for 100 times
        for (i in 1..Number) {


            if (i % 15 == 0)
                Log.d("FizzBuzz", FizzBuzz + " ");
            // number divisible by 5, print 'Buzz'
            // in place of the number
            else if (i % 5 == 0)
                Log.d("Buzz", Buzz + " ");
            // number divisible by 3, print 'Fizz'
            // in place of the number
            else if (i % 3 == 0)
                Log.d("Fizz", Fizz + " ");

            else if (i % 3 == 0)
                Log.d("Prime", Fizz + " ");
            // number divisible by 15(divisible by
            // both 3 & 5), print 'FizzBuzz' in
            // place of the number
            var flag = false
            for (k in 2..i / 2) {
                // condition for nonprime number
                if (i % k == 0) {
                    flag = true
                    break
                }
            }

            if (!flag)
                Log.d("Prime:", i.toString() + " Prime");
            else // print the numbers
                Log.d("Number:", i.toString() + " ");
        }

    }
}