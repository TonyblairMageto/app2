package com.example.tony

import android.app.AlertDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.coroutines.NonCancellable.cancel

class AlertDialogActivity : AppCompatActivity() {

    lateinit var alert:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog)


        alert=findViewById(R.id.btnalert)
        alert.setOnClickListener {
            var box= AlertDialog.Builder(this)

            box.setMessage("Do you want to close the app?")
            box.setPositiveButton("Proceed", DialogInterface.OnClickListener { dialog, id -> finish() })
            box.setNegativeButton("Proceed", DialogInterface.OnClickListener { dialog, id -> cancel() })

            var btn=box.create()
            btn.setTitle("Tony")
            btn.show()

        }

    }
}