package com.jalo.weekendtrust

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jalo.weekendtrust.adapter.ItemShoesAdapater
import com.jalo.weekendtrust.model.DataShoes
import com.jalo.weekendtrust.model.Shoes

class MainActivity : AppCompatActivity(){
    private lateinit var rvShoes: RecyclerView
    private var list: ArrayList<Shoes> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionbar = supportActionBar
        actionbar!!.title= "Weekend Trust"

        // inisialisasi
        rvShoes = findViewById(R.id.rv_shoes)
        rvShoes.setHasFixedSize(true)

        list.addAll(DataShoes.lisData)
        showRecyclerListShoes()

    }
    // show recycler list shoes
    private fun showRecyclerListShoes(){
        rvShoes.layoutManager = LinearLayoutManager(this)
        val itemShoesAdapater = ItemShoesAdapater(list)
        rvShoes.adapter = itemShoesAdapater
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int){
        when(selectedMode){
            R.id.profile -> {
                val cAbout = Intent(this@MainActivity,aboutMe::class.java)
                startActivity(cAbout)
            }
        }
    }
}
