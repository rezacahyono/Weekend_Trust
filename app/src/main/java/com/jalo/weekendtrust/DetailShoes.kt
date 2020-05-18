package com.jalo.weekendtrust

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailShoes: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_detail)
        val actionbar = supportActionBar
        actionbar!!.title = "Detail"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val imgPhoto: ImageView = findViewById(R.id.img_shoes)
        val tvName: TextView = findViewById(R.id.tv_item_name)
        val tvPrice: TextView = findViewById(R.id.tv_item_price)
        val textDesc: TextView = findViewById(R.id.desc_detail)
        val textSize: TextView = findViewById(R.id.size_detail)
        val textConditi: TextView = findViewById(R.id.conditi_detail)
        val btnBuy: Button = findViewById(R.id.btn_buy)

        // menangkap data yang dikirim
        val tphoto = intent.getIntExtra(EXTRA_PHOTO,0)
        val tName  = intent.getStringExtra(EXTRA_NAME)
        val tPrice  = intent.getStringExtra(EXTRA_PRICE)
        val tDesc  = intent.getStringExtra(EXTRA_DESC)
        val tSize  = intent.getStringExtra(EXTRA_SIZE)
        val tConditi  = intent.getStringExtra(EXTRA_CONDITI)


        Glide.with(this)
            .load(tphoto)
            .apply(RequestOptions())
            .into(imgPhoto)
        tvName.text = tName
        tvPrice.text = tPrice
        textDesc.text = tDesc
        textSize.text = tSize
        textConditi.text = tConditi

        btnBuy.setOnClickListener {
            Toast.makeText(this, "Congratulations, you buy $tName",
                Toast.LENGTH_SHORT).show()
        }


    }

    companion object {
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PRICE = "extra_price"
        const val EXTRA_DESC = "extra_desc"
        const val EXTRA_SIZE = "extra_size"
        const val EXTRA_CONDITI = "extra_conditi"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}