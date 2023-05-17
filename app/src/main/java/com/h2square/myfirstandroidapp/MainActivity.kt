package com.h2square.myfirstandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {

    lateinit var toastBtn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val defaultActionBar =supportActionBar!!
        defaultActionBar.displayOptions= ActionBar.DISPLAY_SHOW_CUSTOM
        defaultActionBar.setCustomView(R.layout.my_custom_action_bar)

        val toolbar =defaultActionBar.customView.parent as Toolbar
        toolbar.setContentInsetsAbsolute(0,0)

        toastBtn =defaultActionBar.customView.findViewById(R.id.toastBtn)

        toastBtn.setOnClickListener {
            Toast.makeText(this,"action",Toast.LENGTH_SHORT).show()
        }

    }
}