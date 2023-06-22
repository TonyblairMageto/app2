package com.example.tony

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class GoogleMapActivity : AppCompatActivity() {

    lateinit var google:WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_google_map)

        google = findViewById(R.id.map)


        google.webViewClient = WebViewClient()
        google.loadUrl("https://www.google.com/maps/@-1.2723647,36.7927116,15z?entry=ttu")
        google.settings.javaScriptEnabled = true
        google.settings.setSupportZoom(true)
    }
}