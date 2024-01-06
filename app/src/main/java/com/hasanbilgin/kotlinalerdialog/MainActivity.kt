package com.hasanbilgin.kotlinalerdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show()
        Toast.makeText(this@MainActivity, "hello2", Toast.LENGTH_SHORT).show()
        Toast.makeText(applicationContext, "hello3", Toast.LENGTH_SHORT).show()


        var button: Button
        //button = findViewById<Button>(R.id.button)     //aynı
        button = findViewById<Button>(R.id.button)
        //1.yol
//        button.setOnClickListener {
//            Toast.makeText(this, "tıklandı1", Toast.LENGTH_SHORT).show()
//
//        }

        //2.yol
//        button.setOnClickListener(object:View.OnClickListener{
//            override fun onClick(v: View?) {
//                //this olmaz yazarken no name provided yazar
//                Toast.makeText(this@MainActivity, "tıklandı2", Toast.LENGTH_SHORT).show()
//            }
//
//        })





    }
                                                                 

    fun onClick(view: View) {
//        val alert = AlertDialog.Builder(this)  //aynı
        val alert = AlertDialog.Builder(this@MainActivity)
        alert.setTitle("Save")
        alert.setMessage("Are you Sure?")
        alert.setPositiveButton("Yes") { dialog, which ->
            //onClick Listener
            Toast.makeText(applicationContext, "saved", Toast.LENGTH_SHORT).show()
            Toast.makeText(this, "saved2", Toast.LENGTH_SHORT).show()
            Toast.makeText(this@MainActivity, "saved3", Toast.LENGTH_SHORT).show()


        }
        alert.setNegativeButton("No") { dialog, which ->
            //onClick
            Toast.makeText(applicationContext, "no saved", Toast.LENGTH_SHORT).show()


        }
        alert.show()

    }


}