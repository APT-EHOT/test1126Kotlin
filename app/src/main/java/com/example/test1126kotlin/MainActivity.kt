package com.example.test1126kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.test1126kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.apply {
            buttonPlus.setOnClickListener {
                count++
                textView.text = count.toString()
            }
        }



        val person = Person("Ivan", "Ivanonv", 24, 'M')

        Log.wtf("MyLog", person.firstName)
    }

}