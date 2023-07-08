package com.jatin.kotlin_task3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var snackBar:Button
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        snackBar= findViewById(R.id.btn_snack)
        snackBar.setOnClickListener {
            var snackbar = Snackbar.make(it,"Snackbar",Snackbar.LENGTH_SHORT).setAction("intent",
                View.OnClickListener {
                    var intent = Intent(this,MainActivity2::class.java)
                    startActivity(intent)
                })
                .show()

        }
    }
}