package com.example.affrimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.affrimation.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val textView : TextView =findViewById(R.id.txt_hello_world)
//        textView.text = Datasource().loadAffirmations().size.toString()
    }
}