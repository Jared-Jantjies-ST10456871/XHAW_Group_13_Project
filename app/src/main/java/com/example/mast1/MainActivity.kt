package com.example.mast1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var GetStartedButton: Button
    lateinit var HomeButton: Button
    lateinit var PaymentButton: Button
    lateinit var CourseButton: Button
    lateinit var AboutButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GetStartedButton = findViewById<Button>(R.id.getStartedButton)
        HomeButton = findViewById<Button>(R.id.homeButton)
        PaymentButton = findViewById<Button>(R.id.paymentPayment)
        CourseButton = findViewById<Button>(R.id.courseButton)
        AboutButton = findViewById<Button>(R.id.aboutUsButton)

        //App header navigation
        HomeButton.setOnClickListener {
            // create the explicit intent
            val intent = Intent(this, MainActivity::class.java)

            // start your next activity
            startActivity(intent)
        }

            AboutButton.setOnClickListener {
                // create the explicit intent
                val intent = Intent(this, AboutUsActivity::class.java)

                // start your next activity
                startActivity(intent)
            }

                CourseButton.setOnClickListener {
                    // create the explicit intent
                    val intent = Intent(this, MonthCourseOverviewActivity::class.java)

                    // start your next activity
                    startActivity(intent)
                }

                    PaymentButton.setOnClickListener {
                        // create the explicit intent
                        val intent = Intent(this, CalculationActivity::class.java)

                        // start your next activity
                        startActivity(intent)
                    }

        GetStartedButton.setOnClickListener{
            // create the explicit intent
            val intent = Intent(this, MonthCourseOverviewActivity::class.java)

            // start your next activity
            startActivity(intent)
    }
    }
}