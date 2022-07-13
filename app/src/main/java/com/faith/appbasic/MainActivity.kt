package com.faith.appbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var inputOne: EditText = findViewById(R.id.inputOne)
        var inputTwo: EditText = findViewById(R.id.inputTwo)
        var btnAdd: Button = findViewById(R.id.buttonAdd)
        var myResult: TextView = findViewById(R.id.txtResult)


        //listener
        btnAdd.setOnClickListener {
            var total = inputOne.text.toString().toDouble() + inputTwo.text.toString().toDouble()


            //get the text that the user has entered
            var firstText = inputOne.text.toString()
            var secondtext = inputTwo.text.toString()

            if (firstText.isEmpty() || secondtext.isEmpty()) {
                Toast.makeText(applicationContext, "Please enter all values", Toast.LENGTH_SHORT)
                    .show()
                return@setOnClickListener
            }
            try {
                //convert to numbers
                var firstNumber = firstText.toDouble()//99
                var secondNumber = secondtext.toDouble()

                //add the numbers
                var sum = firstNumber + secondNumber

                //display
                myResult.text = "Sum is $sum"
            } catch (e: Exception) {
                Toast.makeText(applicationContext, "Enter valid input", Toast.LENGTH_SHORT).show()
            }

        }
    }
}

//Create an app that will calculate the compound interest
//amount,rate,period
//display the total amount