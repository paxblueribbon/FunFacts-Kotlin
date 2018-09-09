package me.paxana.funfacts

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    private val factbook = Factbook()
    private val colorWheel = ColorWheel()

//    Declare our view variables
    private var factTextView: TextView? = null
    private var showFactsButton: Button? = null
    private var relativeLayout: RelativeLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        assign the views from the layout file to the corresponding variables
        factTextView = findViewById(R.id.factTextView)
        showFactsButton = findViewById(R.id.showFactButton)
        relativeLayout = findViewById(R.id.relativelayout)

        showFactsButton!!.setOnClickListener {
//            the button was clicked, so update the fact text view with a new fact
//            randomly select a fact


            val color = colorWheel.getColor()
            relativeLayout!!.setBackgroundColor(color)
            showFactsButton!!.setTextColor(color)

        val fact = factbook.getFact()

//            update the screen with the new fact
            factTextView!!.text = fact

        }

    Toast.makeText(this, "Yay our activity was created", Toast.LENGTH_SHORT).show()
    }
}
