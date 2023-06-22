package com.example.tony

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ToolBarActivity : AppCompatActivity() {

    lateinit var hme:Button
    lateinit var contact:Button
    lateinit var about:Button
    lateinit var log:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tool_bar)

        hme=findViewById(R.id.home)
        hme.setOnClickListener {
            val home= Intent(this,DashBoardActivity::class.java)
            startActivity(home)
        }

        contact=findViewById(R.id.co)
        contact.setOnClickListener {
            val home= Intent(this,DashBoardActivity::class.java)
            startActivity(home)
        }
        about=findViewById(R.id.ab)
        about.setOnClickListener {
            val home= Intent(this,DashBoardActivity::class.java)
            startActivity(home)
        }
        log=findViewById(R.id.log)
        log.setOnClickListener {
            val home= Intent(this,DashBoardActivity::class.java)
            startActivity(home)
        }
    }
}