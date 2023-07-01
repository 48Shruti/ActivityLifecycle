package com.shruti.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var btnxt : Button?= null
    var etname : EditText?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    btnxt = findViewById(R.id.btnxt )
        btnxt?.setOnClickListener {
            var intent = Intent(this,NextpageActivity::class.java )
            startActivity(intent)
        }
    }
    override fun   onStart(){
            super.onStart()
            Toast.makeText(this, "start ", Toast.LENGTH_SHORT).show()
        }

    override fun onResume() {
            super.onResume()
            Toast.makeText(this,"Resume", Toast.LENGTH_SHORT).show()
        }

    override fun onPause() {
            super.onPause()
            Toast.makeText(this,"Pause", Toast.LENGTH_SHORT).show()
        }

    override fun onStop() {
            super.onStop()
            Toast.makeText(this, "Stop", Toast. LENGTH_SHORT).show()
        }

    override fun onDestroy() {
            super.onDestroy()
            Toast.makeText(this,"Destroy",Toast.LENGTH_SHORT).show()
        }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this,"Restart", Toast.LENGTH_SHORT).show()
    }

}

