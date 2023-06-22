package com.example.tony

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView
import kotlinx.coroutines.NonCancellable

class DashBoardActivity : AppCompatActivity() {

    lateinit var home: CardView
    lateinit var chat: CardView
    lateinit var profile: CardView
    lateinit var widget: CardView
    lateinit var settings: CardView
    lateinit var logout: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)

        home=findViewById(R.id.cardHome)
        chat=findViewById(R.id.cardChat)
        profile=findViewById(R.id.cardProfile)
        widget=findViewById(R.id.cardWidgets)
        settings=findViewById(R.id.cardSettings)
        logout=findViewById(R.id.cardLogout)


        home.setOnClickListener {
            Toast.makeText(applicationContext, "You have clicked Home Button", Toast.LENGTH_LONG).show()
        }
        chat.setOnClickListener {
            Toast.makeText(applicationContext, "You have clicked Chat Button", Toast.LENGTH_LONG).show()
            val scroll= Intent(this,ListViewActivity::class.java)
            startActivity(scroll)
        }
        profile.setOnClickListener {
            Toast.makeText(applicationContext, "You have clicked profile Button", Toast.LENGTH_LONG).show()
            val scroll= Intent(this,WebViewActivity::class.java)
            startActivity(scroll)
        }
        widget.setOnClickListener {
            Toast.makeText(applicationContext, "You have clicked widget Button", Toast.LENGTH_LONG).show()
            val scroll= Intent(this,ScrollViewActivity::class.java)
            startActivity(scroll)
        }
        settings.setOnClickListener {
            Toast.makeText(applicationContext, "You have clicked settings Button", Toast.LENGTH_LONG).show()
        }
        logout.setOnClickListener {
            Toast.makeText(applicationContext, "You have logged out", Toast.LENGTH_LONG).show()
            var box= AlertDialog.Builder(this)

            box.setMessage("Do you want to close the app?")
            box.setPositiveButton("Proceed", DialogInterface.OnClickListener { dialog, id -> finish() })
            box.setNegativeButton("Proceed", DialogInterface.OnClickListener { dialog, id -> NonCancellable.cancel() })

            var btn=box.create()
            btn.setTitle("Tony")
            btn.show()
        }

    }
}