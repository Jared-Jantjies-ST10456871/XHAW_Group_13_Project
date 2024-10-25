package com.example.mast1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class WeekCourseOverviewActivity: AppCompatActivity() {

    lateinit var BackButton: Button
    lateinit var LearnMoreButton5: Button
    lateinit var LearnMoreButton6: Button
    lateinit var LearnMoreButton7: Button
    lateinit var HomeButton: Button
    lateinit var PaymentButton: Button
    lateinit var CourseButton: Button
    lateinit var AboutButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_6_week_courses)

        BackButton = findViewById<Button>(R.id.backButton2)
        LearnMoreButton5 = findViewById<Button>(R.id.learnMoreButton5)
        LearnMoreButton6 = findViewById<Button>(R.id.learnMoreButton6)
        LearnMoreButton7 = findViewById<Button>(R.id.learnMoreButton7)
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

        BackButton.setOnClickListener{
            // create the explicit intent
            val intent = Intent(this, MonthCourseOverviewActivity::class.java)

            // start your next activity
            startActivity(intent)
        }
        LearnMoreButton5.setOnClickListener{
            // create the explicit intent
            val intent = Intent(this, ChildMindingActivity::class.java)

            // start your next activity
            startActivity(intent)
        }
        LearnMoreButton6.setOnClickListener{
            // create the explicit intent
            val intent = Intent(this, CookingActivity::class.java)

            // start your next activity
            startActivity(intent)
        }
        LearnMoreButton7.setOnClickListener{
            // create the explicit intent
            val intent = Intent(this, GardenMaintenanceActivity::class.java)

            // start your next activity
            startActivity(intent)
        }
    }

}