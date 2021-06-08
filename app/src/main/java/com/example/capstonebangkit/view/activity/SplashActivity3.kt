package com.example.capstonebangkit.view.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import androidx.core.view.get
import androidx.viewpager2.widget.ViewPager2
import com.example.capstonebangkit.R
import com.example.capstonebangkit.adapter.IntroSlideAdapter
import com.example.capstonebangkit.databinding.ActivitySplash3Binding
import com.example.capstonebangkit.model.IntroSlide

class SplashActivity3 : AppCompatActivity() {

    private lateinit var binding: ActivitySplash3Binding
    private val introSlideAdapter = IntroSlideAdapter(
            listOf(
                    IntroSlide(
                            R.drawable.penjelasan1
                    ),
                    IntroSlide(
                            R.drawable.penjelasan2
                    ),
                    IntroSlide(
                            R.drawable.penjelasan3
                    )
            )
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplash3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.introSliderViewPager.adapter = introSlideAdapter
        setupIndicator()
        currentIndicator(0)
        binding.introSliderViewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                currentIndicator(position)
            }
        })
        binding.imgNext.setOnClickListener {
            val introSlideViewPager = binding.introSliderViewPager
            if (introSlideViewPager.currentItem + 1 < introSlideAdapter.itemCount){
                introSlideViewPager.currentItem += 1
            }else{
                Intent(applicationContext,MainActivity::class.java).also {
                    startActivity(it)
                    finish()
                }
            }

        }
    }

    private fun setupIndicator(){
        val indicators = arrayOfNulls<ImageView>(introSlideAdapter.itemCount)
        val layoutParams : LinearLayout.LayoutParams =
                LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT)
        layoutParams.setMargins(8,0,8,0)
        for (i in indicators.indices){
            indicators[i] = ImageView(applicationContext)
            indicators[i].apply {
                this?.setImageDrawable(
                        ContextCompat.getDrawable(
                                applicationContext,
                                R.drawable.indicator_inactive
                        )
                )
                this?.layoutParams = layoutParams
            }
            binding.indicatorContainer.addView(indicators[i])
        }
    }
    private fun currentIndicator(index : Int){
        val childCount = binding.indicatorContainer.childCount
        for (i in 0 until childCount){
            val imageView = binding.indicatorContainer[i] as ImageView
            if(i == index){
                imageView.setImageDrawable(
                        ContextCompat.getDrawable(
                                applicationContext,
                                R.drawable.indicator_active
                        )
                )
            }
            else{
                imageView.setImageDrawable(
                        ContextCompat.getDrawable(
                                applicationContext,
                                R.drawable.indicator_inactive
                        )
                )
            }
        }
    }
}