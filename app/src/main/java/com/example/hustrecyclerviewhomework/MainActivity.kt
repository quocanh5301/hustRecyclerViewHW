package com.example.hustrecyclerviewhomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.hustrecyclerviewhomework.DataManage.DataSrc
import com.example.hustrecyclerviewhomework.Models.Affirmation

class MainActivity : AppCompatActivity() {
    lateinit var dataSet : List<Affirmation>;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dataSet = DataSrc().loadAffirmations()

        val adapter = MyAdapter(this, dataSet);
        val recyclerView = findViewById<RecyclerView>(R.id.recycle_view)
        recyclerView.adapter = adapter
    }
}