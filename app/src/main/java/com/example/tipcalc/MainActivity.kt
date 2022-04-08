package com.example.tipcalc


import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.INotificationSideChannel
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        infoTextView.visibility = View.INVISIBLE
        calculateButton.setOnClickListener {

            try {
                val bill = billEditText.text.toString().toDouble()
                val tipPercentage = tipPercentapeEditText.text.toString().toDouble() / 100
                val tip = bill * tipPercentage
                val total = tip + bill
                val deneme : Boolean

                infoTextView.text = "Tip: \$${String.format("%.2f", tip)}Total: \$${String.format("%.2f", total)}"
                infoTextView.visibility = View.VISIBLE
            } catch (e: Exception) {
                infoTextView.text = null
                e.suppressedExceptions


            }


        }



    }
}