package com.example.splash


import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclersActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.output)

        // getting the recyclerview by its id
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerView)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)

        // ArrayList of class ItemsViewModel
//        val list = ArrayList<info>()
        lateinit var list: ArrayList<Info>
        // This loop will create 20 Views containing
        // the image with the count of view
//        for (i in 1..20) {
//            data.add(info(R.drawable.apache, "Item " + i))
//        }

        // ArrayList of class ItemsViewModel
        list = ArrayList()
        list.add(Info(R.drawable.ceylon, "Ceylon"))
        list.add(Info(R.drawable.apache, "Apache"))
        list.add(Info(R.drawable.atom, "Atom"))
        list.add(Info(R.drawable.cakephp, "Cakephp"))
        list.add(Info(R.drawable.django, "Django"))
        list.add(Info(R.drawable.ionic, "Ionic"))
        list.add(Info(R.drawable.linux, "Linux"))
        list.add(Info(R.drawable.pycharm, "Pycharm"))
        list.add(Info(R.drawable.sequelize, "Sequelize"))
        list.add(Info(R.drawable.sketch, "Sketch"))


        // This will pass the ArrayList to our Adapter
        val adapter = Adapter(list)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter

    }
}
