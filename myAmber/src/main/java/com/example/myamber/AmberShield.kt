package com.example.myamber

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import java.math.RoundingMode
import java.text.DecimalFormat

fun Double.amberIsCheck(): String {
    val df = DecimalFormat("#.#")
    df.roundingMode = RoundingMode.DOWN
    return df.format(this)
}


fun loadImagesWithGlide(imageView: ImageView, url: String) {
    Glide.with(imageView)
        .load(url)
        .centerCrop()
        .diskCacheStrategy(DiskCacheStrategy.ALL)
        .into(imageView)
}

