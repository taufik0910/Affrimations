package com.example.affrimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affrimation.adapter.ItemAdapter
import com.example.affrimation.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val textView : TextView =findViewById(R.id.txt_hello_world)
//        textView.text = Datasource().loadAffirmations().size.toString()
//            initialize data
        val myDataset = Datasource().loadAffirmations()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter =  ItemAdapter(this,myDataset)
        recyclerView.setHasFixedSize(true)

    }
}