package com.example.mast1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MonthCourseOverviewActivity: AppCompatActivity() {

    lateinit var NextButton: Button
    lateinit var BackButton: Button
    lateinit var LearnMoreButton1: Button
    lateinit var LearnMoreButton2: Button
    lateinit var LearnMoreButton3: Button
    lateinit var LearnMoreButton4: Button
    lateinit var HomeButton: Button
    lateinit var PaymentButton: Button
    lateinit var CourseButton: Button
    lateinit var AboutButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_6_month_courses)

        BackButton = findViewById<Button>(R.id.backButton1)
        NextButton = findViewById<Button>(R.id.nextButton1)
        LearnMoreButton1 = findViewById<Button>(R.id.learnMoreButton1)
        LearnMoreButton2 = findViewById<Button>(R.id.learnMoreButton2)
        LearnMoreButton3 = findViewById<Button>(R.id.learnMoreButton3)
        LearnMoreButton4 = findViewById<Button>(R.id.learnMoreButton4)
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
            val intent = Intent(this, MainActivity::class.java)

            // start your next activity
            startActivity(intent)
        }

        NextButton.setOnClickListener{
            // create the explicit intent
            val intent = Intent(this, WeekCourseOverviewActivity::class.java)

            // start your next activity
            startActivity(intent)
        }
        LearnMoreButton1.setOnClickListener{
            // create the explicit intent
            val intent = Intent(this, FirstAidActivity::class.java)

            // start your next activity
            startActivity(intent)
        }
        LearnMoreButton2.setOnClickListener{
            // create the explicit intent
            val intent = Intent(this, LandscapingActivity::class.java)

            // start your next activity
            startActivity(intent)
        }
        LearnMoreButton3.setOnClickListener{
            // create the explicit intent
            val intent = Intent(this, SewingActivity::class.java)

            // start your next activity
            startActivity(intent)
        }
        LearnMoreButton4.setOnClickListener{
            // create the explicit intent
            val intent = Intent(this, LifeSkillsActivity::class.java)

            // start your next activity
            startActivity(intent)
        }
    }
}