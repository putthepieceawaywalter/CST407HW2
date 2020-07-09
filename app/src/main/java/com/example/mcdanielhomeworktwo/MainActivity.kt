package com.example.mcdanielhomeworktwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.ToggleButton
import kotlinx.android.synthetic.main.activity_main.*



const val TIRE_SIZE_MIN = 20
const val TIRE_SIZE_MAX = 127
const val HEART_RATE_MIN = 40
const val HEART_RATE_MAX = 200

class MainActivity : AppCompatActivity(), View.OnClickListener, TextWatcher {
    private var distance: Double = 0.0
    private var heartRate = 40
    private var elapsedTime = 1.0
    private var tireSize = 23
    private var result = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // metricSwitch.
        submit.setOnClickListener(this)
        //toggleMetric.
        editTxtDistance.addTextChangedListener(this)




    }


    override fun onClick(button: View?) {
        when (button?.id) {
            R.id.submit -> submit()

        }
    }
    private fun submit()
    {

        distance = editTxtDistance.text.toString().toDouble()
        heartRate = editTxtHeartRate.text.toString().toInt()
        elapsedTime = editTxtTime.text.toString().toDouble()
        tireSize = editTxtTireSize.text.toString().toInt()


        val toggle: ToggleButton = findViewById(R.id.toggleMetric)
//        toggle.setOnCheckedChangeListener { _, isChecked ->
//            if (isChecked) {
//                // it is metric already!
//            } else {
//                distance = HeartCalculator().distanceInMilesToKM(distance)
//            }
//        }

        if (toggle.isChecked) {

        } else {
            distance *= 8
            distance /= 5
            //distance = 1000.0
        }




        if (heartRate > HEART_RATE_MAX) {
            heartRate = HEART_RATE_MAX
        } else if (heartRate < HEART_RATE_MIN) {
            heartRate = HEART_RATE_MIN
        }

        if (tireSize > TIRE_SIZE_MAX) {
            tireSize = TIRE_SIZE_MAX
        } else if (tireSize < TIRE_SIZE_MIN)
        {
            tireSize = TIRE_SIZE_MIN
        }


        result = HeartCalculator().calculateBeatsPerRev(distance, tireSize, heartRate, elapsedTime)
        txtResult.text = result.toString()

    }

    override fun afterTextChanged(s: Editable?) {
    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        if (editTxtDistance.text!!.isNotEmpty() && editTxtHeartRate.text!!.isNotEmpty() &&
                editTxtTime.text!!.isNotEmpty()&& editTxtHeartRate.text!!.isNotEmpty()) {
            submit()
        }

    }
}