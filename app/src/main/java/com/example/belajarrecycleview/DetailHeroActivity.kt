package com.example.belajarrecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.bumptech.glide.Glide
import com.example.belajarrecycleview.databinding.ActivityDetailHeroBinding
import com.example.belajarrecycleview.databinding.ActivityMainBinding
import com.example.belajarrecycleview.model.dataHeroes

class DetailHeroActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailHeroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailHeroBinding.inflate(layoutInflater)
        setContentView(binding.root)

    val data = intent.getParcelableExtra<dataHeroes>("DATA")
//            Log.d("DATAKU", data!!.name)

        Glide.with(this)
            .load(data?.image)
            .into(binding.imgProfile)

        binding.tvName.text = data?.name
        binding.tvDescription.text = data?.description
    }
}