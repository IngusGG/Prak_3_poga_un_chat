package com.example.prak_3_poga_un_chat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_chat.*
import kotlinx.android.synthetic.main.activity_chat_second_activty.*

class ChatActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_MESSAGE = "lv.romstr.mobile.practice.MESSAGE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

       // val visible = 0
       // if (visible == 0) {
      //      textReceived.visibility = View.INVISIBLE
       //     textMessage.visibility = View.INVISIBLE
       // }else{
       //     textReceived.visibility = View.VISIBLE
       //     textMessage.visibility = View.VISIBLE
       // }

        ButtonSend.setOnClickListener{
            val message = editTextTextPersonName2.text.toString()
            val intent = Intent(this, ChatSecondActivty::class.java).apply {
                putExtra(EXTRA_MESSAGE, message)
            }
            startActivity(intent)

        }


        val message = intent.getStringExtra(ChatSecondActivty.EXTRA_MESSAGE)
            textMessage.text = message






    }
}