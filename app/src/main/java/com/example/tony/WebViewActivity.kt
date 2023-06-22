package com.example.tony

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.Toast

class WebViewActivity : AppCompatActivity() {

    lateinit var web: WebView
    lateinit var loc: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        web = findViewById(R.id.web)
        loc = findViewById(R.id.btn_loc)


        loc.setOnClickListener {
            Toast.makeText(applicationContext, "Searching", Toast.LENGTH_LONG).show()
            val scroll = Intent(this, GoogleMapActivity::class.java)
            startActivity(scroll)



            web.webViewClient = WebViewClient()
            web.loadUrl("https://www.google.com/search?q=tourist+attractions&oq=https%3A%2F%2Ftourism+att&aqs=chrome.1.69i57j0i13i457i512j0i13i402i512l2j0i13i512l3j69i58.22050j0j9&sourceid=chrome&ie=UTF-8")
            web.settings.javaScriptEnabled = true
            web.settings.setSupportZoom(true)
        }

    }
}
