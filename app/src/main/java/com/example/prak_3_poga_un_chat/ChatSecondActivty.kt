package com.example.prak_3_poga_un_chat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_chat.*
import kotlinx.android.synthetic.main.activity_chat.ButtonSend
import kotlinx.android.synthetic.main.activity_chat_second_activty.*

class ChatSecondActivty : AppCompatActivity() {

    companion object {
        const val EXTRA_MESSAGE = "lv.romstr.mobile.practice.MESSAGE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_second_activty)


        //textMessage2.isClickable = false

        ButtonReply.setOnClickListener{
            val message = editTextTextPersonName.text.toString()
            val intent = Intent(this, ChatActivity::class.java).apply {
                putExtra(EXTRA_MESSAGE, message)
            }
            startActivity(intent)
        }


        val message = intent.getStringExtra(EXTRA_MESSAGE)
        textMessage2.text = message

    }
}