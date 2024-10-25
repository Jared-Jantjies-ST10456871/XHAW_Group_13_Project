package com.example.mast1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.TextView

class CalculationActivity : AppCompatActivity() {

    private lateinit var switch1: Switch
    private lateinit var switch2: Switch
    private lateinit var switch3: Switch
    private lateinit var switch4: Switch
    private lateinit var switch5: Switch
    private lateinit var switch6: Switch
    private lateinit var switch7: Switch
    private lateinit var textViewTotal: TextView
    private var switch1Value = 0
    private var switch2Value = 0
    private var switch3Value = 0
    private var switch4Value = 0
    private var switch5Value = 0
    private var switch6Value = 0
    private var switch7Value = 0
    lateinit var HomeButton: Button
    lateinit var PaymentButton: Button
    lateinit var CourseButton: Button
    lateinit var AboutButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculation)

        HomeButton = findViewById<Button>(R.id.homeButton)
        PaymentButton = findViewById<Button>(R.id.paymentPayment)
        CourseButton = findViewById<Button>(R.id.courseButton)
        AboutButton = findViewById<Button>(R.id.aboutUsButton)

        // Reference the switches and TextView
        switch1 = findViewById(R.id.firstAidSwitch)
        switch2 = findViewById(R.id.cookingSwitch)
        switch3 = findViewById(R.id.gmSwitch)
        switch4 = findViewById(R.id.cmSwitch)
        switch5 = findViewById(R.id.landscapingSwitch)
        switch6 = findViewById(R.id.lsSwitch)
        switch7 = findViewById(R.id.sewingSwitch)
        textViewTotal = findViewById(R.id.totalTextView)

        // Set initial values
        switch1Value = if (switch1.isChecked) 1500 else 0
        switch2Value = if (switch2.isChecked) 750 else 0
        switch3Value = if (switch3.isChecked) 750 else 0
        switch4Value = if (switch4.isChecked) 750 else 0
        switch5Value = if (switch5.isChecked) 1500 else 0
        switch6Value = if (switch6.isChecked) 1500 else 0
        switch7Value = if (switch7.isChecked) 1500 else 0

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

        // Update the sum initially
        updateSum()

        // Set listeners to update sum when switch state changes
        switch1.setOnCheckedChangeListener { _, isChecked ->
            switch1Value = if (isChecked) 1500 else 0
            updateSum()  // Update sum each time the switch state changes
        }

        switch2.setOnCheckedChangeListener { _, isChecked ->
            switch2Value = if (isChecked) 750 else 0
            updateSum()  // Update sum each time the switch state changes
        }

        switch3.setOnCheckedChangeListener { _, isChecked ->
            switch3Value = if (isChecked) 750 else 0
            updateSum()  // Update sum each time the switch state changes
        }

        switch4.setOnCheckedChangeListener { _, isChecked ->
            switch4Value = if (isChecked) 750 else 0
            updateSum()  // Update sum each time the switch state changes
        }

        switch5.setOnCheckedChangeListener { _, isChecked ->
            switch5Value = if (isChecked) 1500 else 0
            updateSum()  // Update sum each time the switch state changes
        }

        switch6.setOnCheckedChangeListener { _, isChecked ->
            switch6Value = if (isChecked) 1500 else 0
            updateSum()  // Update sum each time the switch state changes
        }

        switch7.setOnCheckedChangeListener { _, isChecked ->
            switch7Value = if (isChecked) 1500 else 0
            updateSum()  // Update sum each time the switch state changes
        }
    }

    // Method to update and display the sum in the TextView
    private fun updateSum() {
        val totalSum = switch1Value + switch2Value + switch3Value + switch4Value + switch5Value + switch6Value + switch7Value

        // Count the number of switches that are ON
        val checkedCount = listOf(switch1Value, switch2Value, switch3Value, switch4Value, switch5Value, switch6Value, switch7Value)
            .count { it > 0 }

        // Apply percentage reduction based on how many switches are checked
        val reduction = when (checkedCount) {
            2 -> 0.05 // 5% if 2 switches are checked
            3 -> 0.10 // 10% if 3 switches are checked
            in 4..7 -> 0.15 // 15% if 4 or more switches are checked
            else -> 0.0 // No reduction if less than 2 switches are checked
        }

        // Apply the reduction to the total sum
        val finalSum = totalSum - (totalSum * reduction)

        // Update the TextView with the final sum
        textViewTotal.text = "Sum: %.2f".format(finalSum)
    }
}