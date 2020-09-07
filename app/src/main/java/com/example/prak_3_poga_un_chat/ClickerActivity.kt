package com.example.prak_3_poga_un_chat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_clicker.*

class ClickerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clicker)

        var click = 0

        ButtonClickMe.setOnClickListener{

            click ++
            if(click > 40){click = 0}
            TextValue.text = "$click"

            if(click % 10 == 0 ) // Dalīt bez atlikuma ar 10
            {
                Toast.makeText(this, R.string.toast_multiply, Toast.LENGTH_SHORT).show()
            }
        }
    }
}