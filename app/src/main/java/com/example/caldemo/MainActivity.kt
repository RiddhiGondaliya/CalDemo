package com.example.caldemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.caldemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //declaration of the viewModel
        lateinit var viewModel: SquareViewModel

        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        // initalization of the viewModel
        viewModel = ViewModelProvider(this).get(SquareViewModel::class.java)

          viewModel.textlivedata.observe(this) {
              binding.result.text = it.toString()
          }
              binding.btn.setOnClickListener{
                 /** for numbers
                  * var input = binding.num1.text.toString()
                   var inputnumber = input.toIntOrNull()
                   inputnumber?.let{number->
                       viewModel.squareNumbers(number)*/
                  // for textdata
                  var input = binding.num1.text.toString()
                  var data = input
                  viewModel.textdiplay(data)

            }

        }
    }

