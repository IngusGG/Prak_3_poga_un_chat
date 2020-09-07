package com.example.prak_3_poga_un_chat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_chat.*

class ChatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        val visible = 0
        if (visible == 0) {
            textReceived.visibility = View.INVISIBLE
            textMessage.visibility = View.INVISIBLE
        }else{
            textReceived.visibility = View.VISIBLE
            textMessage.visibility = View.VISIBLE
        }

        ButtonSend.setOnClickListener{
            val intent = Intent(this, ChatSecondActivty::class.java)
            startActivity(intent)
        }

    }
}