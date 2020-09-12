package com.sobha.kotlintest

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
/*Author:RK
Date:12/09/2020
Purpose: Declaring All variable of all data types and printing the values to console
*/
//Song : Tere chere se nazar nahi hathti nazare hum ky dekhe
class Song : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//Declaring String variable name of Album
        var Album: String = "Kabhi Kabhi"
//Declaring int variable contaning value in year which song was released
        var Year: Int = 1976
//Declaring String again Singer Name
        var SingerName: String = "Lata Mangeskar,Kishor Kumar"
/*Now Declaring Boolean Type Variable
Which rturm true or false
*/
        var IsEnglishSong: Boolean = false
//Declaring Float variable
        var TotalSales: Float = 155454542.22F
//Declaring Double Variable
        var AmountEarned: Double = 545454545454.55
//Printing value of variables to Console
        Log.d("Album :", Album)
        Log.d("Year:", "" + Year)
        Log.d("SingerName", SingerName)
        Log.d("IsEnglishSong", "" + IsEnglishSong);
        Log.d("TotalSales", TotalSales.toString())
        Log.d("AmountEarned", AmountEarned.toString())
    }
}