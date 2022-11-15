package com.example.a3_mhw_5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import android.widget.Toast.LENGTH_SHORT
import java.lang.Integer.parseInt

class MainActivity : AppCompatActivity() {

   private lateinit var tvZero:TextView
   private var btnOperation: Button? =null
   private var count = 0
    

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
     tvZero = findViewById(R.id.tv_count)
     btnOperation = findViewById(R.id.btn_plus)

     btnOperation?.setOnClickListener {
         if(btnOperation?.text == getString(R.string.plus_one)){
             plus()
         }else {
             minus()
         }
      }
   }
    private fun minus(){
        if (count > 0){count--
            tvZero?.text = count.toString()
        }else {
startActivity(Intent(this,SecondActivity::class.java))
        }

    }


    private fun plus(){
        if(count < 10 ){
            count++
            tvZero?.text = count.toString()

        }else if (count == 10){
            btnOperation?.text =getString(R.string.minus_one)

        }

    }


    }



