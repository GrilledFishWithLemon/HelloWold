package com.example.hellowold

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

// : = extends
class MainActivity : AppCompatActivity() {
    //onCreate = main()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //create the UI
        //R = resources
        setContentView(R.layout.activity_main)
        //Java int x; vs Kotlin val x : Int
        //val = value, var = variable
        //findViewById = link program to UI
        val buttonCig : Button = findViewById(R.id.buttonCig)
        buttonCig.setOnClickListener { showMessage() }
        val buttonReset : Button = findViewById(R.id.buttonReset)
        buttonReset.setOnClickListener { showReset() }
    }

    private fun showReset() {
        val textViewMessage : TextView = findViewById(R.id.textViewMessage)
        textViewMessage.setText(getString(R.string.reset))
    }


    private fun showMessage() {
        val textViewMessage : TextView = findViewById(R.id.textViewMessage)
        textViewMessage.setText(getString(R.string.hello))
    }
}
