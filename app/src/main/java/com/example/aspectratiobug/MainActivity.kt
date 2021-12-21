package com.example.aspectratiobug

import android.graphics.drawable.PictureDrawable
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val requestBuilder = GlideApp.with(this)
            .`as`(PictureDrawable::class.java)
            .transition(withCrossFade())
            .listener(SvgSoftwareLayerSetter())
        requestBuilder.load(Uri.parse("https://upload.wikimedia.org/wikipedia/commons/d/d7/Android_robot.svg")).into(findViewById(R.id.articleHeaderImage))
    }
}