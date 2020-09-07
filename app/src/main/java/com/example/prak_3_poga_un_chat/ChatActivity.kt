package com.example.prak_3_poga_un_chat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_chat.*

class ChatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)


            textReceived.visibility = View.INVISIBLE
            textMessage.visibility = View.INVISIBLE
            textMessage.isClickable = false



    }
}