package com.jalo.weekendtrust.model

import com.jalo.weekendtrust.R

object DataShoes {
    private val shoesName = arrayOf(
        "Adidas Brussels",
        "Adidas Padiham",
        "Adidas Bermuda (brown)",
        "Adidas Bermuda (red)",
        "Adidas Jeans",
        "Adidas Hochelaga",
        "Adidas SL72 (white)",
        "Adidas Trimstars (brown)",
        "Adidas Koln",
        "Adidas Spezial (maroon)"
    )

    private val shoesPrice = arrayOf(
        "US\$ 134.42",
        "US\$ 120.98",
        "US\$ 100.82",
        "US\$ 100.82",
        "US\$ 110.90",
        "US\$ 141.14",
        "US\$ 100.82",
        "US\$ 134.42",
        "US\$ 154.59",
        "US\$ 117.62"
    )
    private val descriptionShoes = arrayOf(
        "Adidas brussel keluaran edisi MMIX, dengan balutan warna Hitam dan Orange",
        "Adidas Padiham ini banyak diminati dengan balutan Biru dongker dan Biru telor asin",
        "Adidas Bermuda edisi Coklat, full coklat",
        "Adidas Bermuda Full Merah",
        "Adidas Jeans banyak color fullnya , ini salah satu yang diminati",
        "Adidas Hochelaga sangat limit dengan skin pig yang sangat kuat",
        "Adidas Sl 72, ini sangat legend dan ini di reproduksi lagi",
        "Adidas TrimStars sangat menawan dengan balutan coklat dan merah",
        "Adidas Koln, edisi city series yang sangat di sukai",
        "Adidas Spezial Burgundy yang menawan"
    )

    private val sizeShoes = arrayOf(
        "44",
        "42",
        "41",
        "43",
        "40",
        "41",
        "43",
        "42",
        "44",
        "42"
    )

    private val kondisiShoes = arrayOf(
        "99%",
        "98%",
        "97%",
        "98%",
        "96%",
        "97%",
        "98%",
        "99%",
        "98%",
        "99%"
    )

    private val shoesImage = intArrayOf(
        R.drawable.brussel,
        R.drawable.padiham,
        R.drawable.bermuda_brown,
        R.drawable.bermuda_red,
        R.drawable.jeans,
        R.drawable.hochelaga,
        R.drawable.sl72_white,
        R.drawable.trimstar_brown,
        R.drawable.koln,
        R.drawable.spezial_burgundy
    )

    val lisData: ArrayList<Shoes>
    get() {
        val list = arrayListOf<Shoes>()
        for (position in shoesName.indices){
            val shoes = Shoes()
            shoes.name = shoesName[position]
            shoes.price = shoesPrice[position]
            shoes.description = descriptionShoes[position]
            shoes.size = sizeShoes[position]
            shoes.condti = kondisiShoes[position]
            shoes.photo = shoesImage[position]
            list.add(shoes)
        }
        return list
    }
}