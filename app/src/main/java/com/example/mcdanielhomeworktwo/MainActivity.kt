package com.example.mcdanielhomeworktwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*



const val TIRE_SIZE_MIN = 20
const val TIRE_SIZE_MAX = 127
const val HEART_BEAT_MIN = 40
const val HEART_BEAT_MAX = 200

class MainActivity : AppCompatActivity(), View.OnClickListener, TextWatcher {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // metricSwitch.


    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }

    override fun afterTextChanged(s: Editable?) {
        TODO("Not yet implemented")
    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
        TODO("Not yet implemented")
    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        TODO("Not yet implemented")
    }
}