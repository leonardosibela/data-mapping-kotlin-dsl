package com.sibela.datamappingkotlindsl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sibela.datamappingkotlindsl.Student.Companion.student

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val student = student {
            name = "Alex"
            standard = 10
            rollNumber = 720
        }
    }
}