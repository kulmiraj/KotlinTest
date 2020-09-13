package com.sobha.kotlintest

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
/*
Mutable : Mutable List or array allow us with various features like add remove data from the list or array
and also features like replace ,replace all, remove all and add new list
 */
/*Author:RK
Date:13/09/2020
Purpose: Defining difference between array and list
*/
/*
<p1>
Suppose we want to store all the courses offered by Pirple.
 To do so, we can either create different variables for different courses or we can make an array or a list of courses
 and add the courses into it. For example

val courses = arrayOf<String>("Android 101", "Android 102" ,"Android 103")
or
val courses = listOf<String>("Android 101", "Android 102" ,"Android 103")

Suppose in future, if we want to change the name of the "Android 101" course to "Android 104".
Then if we are using an Array of courses then we can simply update the array by assigning the new value
 because Arrays are mutable in nature.

  But Lists are immutable in nature. So, you can't update the List<T> values.
  In order to update the values, you need to use MutableList<T>.
</p1>
<p2>
If in future we want to add some more courses that may be a "Android 105,106" course? In this case,
if we are using Arrays, then we can't add any further value to our courses variable because arrays have a fixed size
 and we can't increase or decrease the size of an array.
But if we are using MutableList<T>, then we can add some values by using the add method and remove some values by
 using the remove method.

 For Example

 val courses = mutableListOf<String>("Android Beginners","Android Professionals")
courses.add("React-Native")

</p2>

 */

class Collection : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //example of array which containing fix number of items
        val PirpleCourses = arrayOf<String>("Android", "Python", "Php")

        //example of  non mutable List which containing Values from previous example details of song
        val SongDetails = listOf<String>("Album", "ReleaseYear", "Title", "SingerName")
        // one thing we can understand from this that items cant be added or removed from both the array and list
        //to make it flexible which allow us to add or remove itmes form list we have to use mutablelist for example:
        val MutableCourses = mutableListOf<String>("Android", "Python", "Php")
        //So this will allow us to add items to list and remove and like replace and much more functionalities
        MutableCourses.add("JavaScript")
        MutableCourses.removeAt(0)
        MutableCourses.contains("Php")
        //Like Wise we can make use of different features avilable to mutable list

    }
}