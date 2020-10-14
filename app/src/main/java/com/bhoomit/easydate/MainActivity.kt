package com.bhoomit.easydate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bhoomit.dateasy.Dateasy

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this,Dateasy().getCurrentDate(),Toast.LENGTH_SHORT).show()
    }
}
