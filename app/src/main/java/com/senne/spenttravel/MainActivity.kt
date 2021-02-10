package com.senne.spenttravel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn : Button = findViewById(R.id.buttonCalculate)
        btn.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        val id = view.id
        if(id == R.id.buttonCalculate) {
            calculate()
        }
    }

    private fun calculate() {

    }
}