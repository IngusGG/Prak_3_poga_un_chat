package com.example.prak_3_poga_un_chat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        ButtonCilcker.setOnClickListener{

            val intent = Intent(this, ClickerActivity::class.java)
            startActivity(intent)

            //Toast.makeText(this,"Cilcker open", Toast.LENGTH_LONG).show()
            Toast.makeText(this,R.string.toast_clicker, Toast.LENGTH_LONG).show()
        }

        ButtonChat.setOnClickListener{

            val intent = Intent(this, ChatActivity::class.java)
            startActivity(intent)

            //Toast.makeText(this,"Chat open", Toast.LENGTH_LONG).show()
            Toast.makeText(this,R.string.toast_chat, Toast.LENGTH_LONG).show()
        }

    }
}