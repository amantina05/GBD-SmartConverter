package com.example.smartconverter

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val cToF: EditText = findViewById(R.id.editTextNumber)
        val fToC: EditText = findViewById((R.id.editTextNumber2))
        val convert: Button = findViewById(R.id.button)
        val reset: Button = findViewById(R.id.button2)



        convert.setOnClickListener {
            val toast = Toast.makeText(this, "Converting degrees", Toast.LENGTH_SHORT)
            toast.show()

            if (cToF.text.toString().isEmpty()) {
                val temp = (fToC.text.toString().toFloat() - 32) * 5 / 9
                cToF.setText(temp.toString())
            } else {
                var temp = (cToF.text.toString().toFloat() * 9 / 5) + 32
                fToC.setText(temp.toString())
            }
        }


        reset.setOnClickListener {
            val toast = Toast.makeText(this, "Clearing degrees", Toast.LENGTH_SHORT)
            toast.show()
            cToF.setText("")
            fToC.setText("")
        }
    }
}



