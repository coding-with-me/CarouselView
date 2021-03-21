package com.codingwithme.carouselview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.synnapps.carouselview.CarouselView
import com.synnapps.carouselview.ImageListener

class MainActivity : AppCompatActivity() {

    var imageArray:ArrayList<Int> = ArrayList()
    var carouselView:CarouselView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageArray.add(R.drawable.one)
        imageArray.add(R.drawable.two)
        imageArray.add(R.drawable.three)
        imageArray.add(R.drawable.four)

        carouselView = findViewById(R.id.carouselView)

        carouselView!!.pageCount = imageArray.size

        carouselView!!.setImageListener(imageListener)

    }

    var imageListener = ImageListener { position, imageView -> imageView.setImageResource(imageArray[position]) }
}