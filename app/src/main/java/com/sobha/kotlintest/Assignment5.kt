package com.sobha.kotlintest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class Assignment5 : AppCompatActivity() {

    //Declaring String Global variable name of Song
    var SongName: String = "Tere Chere Se Nazar Nahi Hathti"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_assignment5)
        var SongAlbum = Album(SongName)
        var SingerName = Singer(SongName)
        var ReleaseYear = ReleaseYear(SongName)

        Log.d("Song Details", SongAlbum+" ," +SingerName +" ," + ReleaseYear )

    }

    fun Album(Song: String): String {
        //Declaring String Local variable name of Album
        var Album: String = "Kabhi Kabhi"
        if (Song == "Tere Chere Se Nazar Nahi Hathti") {
            return Album
        } else {
            return "Please Select correct song"
        }
    }

    fun Singer(Song: String): String {
        //Declaring String Local variable name of Singer
        var Singer: String = "Lata Mangeskar,Kishor Kumar"
        if (Song == "Tere Chere Se Nazar Nahi Hathti") {
            return Singer
        } else {
            return "Please Select correct song"
        }
    }

    fun ReleaseYear(Song: String): Int {
        //Declaring String Local variable name of Singer
        var Year: Int = 1976
        if (Song == "Tere Chere Se Nazar Nahi Hathti") {
            return Year
        } else {
            return 0
        }
    }
}