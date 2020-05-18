package com.jalo.weekendtrust.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.jalo.weekendtrust.DetailShoes
import com.jalo.weekendtrust.R
import com.jalo.weekendtrust.model.Shoes

class ItemShoesAdapater(private val listShoes: ArrayList<Shoes>): RecyclerView.Adapter<ItemShoesAdapater.ItemShoesHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ItemShoesHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_shoes,viewGroup,false)
        return ItemShoesHolder(view)
    }
    override fun getItemCount(): Int {
        return listShoes.size
    }
    override fun onBindViewHolder(holder: ItemShoesHolder, position: Int) {
        val (name,price,description,size,conditi,photo) = listShoes[position]

        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions().override(250,250))
            .into(holder.imgPhoto)

        holder.tvName.text = name
        holder.tvPrice.text = price

        // btn buy aksi
        holder.btnBuy.setOnClickListener {
            Toast.makeText(holder.itemView.context,"Congratulations, you buy " + listShoes[position].name,Toast.LENGTH_SHORT).show()
        }
        // btn detail aksi
        holder.btnDetail.setOnClickListener{
//            Toast.makeText(holder.itemView.context,"memilih detail" + listShoes[position].name,Toast.LENGTH_SHORT).show()
            // mengirim data
            val moveDetail = Intent(holder.itemView.context,DetailShoes::class.java)
            moveDetail.putExtra(DetailShoes.EXTRA_PHOTO,photo)
            moveDetail.putExtra(DetailShoes.EXTRA_NAME,name)
            moveDetail.putExtra(DetailShoes.EXTRA_PRICE,price)
            moveDetail.putExtra(DetailShoes.EXTRA_DESC,description)
            moveDetail.putExtra(DetailShoes.EXTRA_SIZE,size)
            moveDetail.putExtra(DetailShoes.EXTRA_CONDITI,conditi)
            holder.itemView.context.startActivity(moveDetail)

        }
    }

    inner class ItemShoesHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_shoes)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvPrice: TextView = itemView.findViewById(R.id.tv_item_price)
        var btnBuy: Button = itemView.findViewById(R.id.btn_buy)
        var btnDetail: Button = itemView.findViewById(R.id.btn_detail)


    }

}
