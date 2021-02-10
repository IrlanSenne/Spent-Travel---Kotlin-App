package com.senne.spenttravel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

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
        val distance = findViewById<EditText>(R.id.editDistance).text.toString()
        val price = findViewById<EditText>(R.id.editPrice).text.toString()
        val autonomy = findViewById<EditText>(R.id.editAutonomy).text.toString()

        if(distance != ""  && price != ""  && autonomy != "" ){
            val totalValue = (distance.toFloat() * price.toFloat() / autonomy.toFloat())
            var total = findViewById<TextView>(R.id.finalPrice)
            total.text = "R$ ${"%.2f".format(totalValue)}"
        }
        Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_LONG).show()
    }

}