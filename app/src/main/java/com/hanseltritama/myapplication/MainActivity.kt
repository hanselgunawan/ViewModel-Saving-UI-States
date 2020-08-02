package com.hanseltritama.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mainActivityViewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainActivityViewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        mainActivityViewModel.myInt.observe(this, Observer {
            my_text_view.setText(it.toString())
        })

        add_button.setOnClickListener {
            mainActivityViewModel.plusOrMinusNumber("plus")
            mainActivityViewModel.myInt.observe(this, Observer {
                my_text_view.setText(it.toString())
            })
        }

        subtract_button.setOnClickListener {
            mainActivityViewModel.plusOrMinusNumber("minus")
            mainActivityViewModel.myInt.observe(this, Observer {
                my_text_view.setText(it.toString())
            })
        }
    }
}
