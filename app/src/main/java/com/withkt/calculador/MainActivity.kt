package com.withkt.simplegame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.withkt.calculador.Calculo
import com.withkt.calculador.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        var cal = Calculo ()

        var result = ""
        var num1:Double = 0.0
        var case = 0

        binding.showArea.text = result

        binding.button0.setOnClickListener {
            val numero = "0"

            if(result[0] != '0'){
                result +=numero
            }
            binding.showArea.text = result

        }
        binding.button1.setOnClickListener {
            val numero = "1"
            result += numero
            binding.showArea.text = result
        }

        binding.button2.setOnClickListener {
            val numero = "2"
            result +=numero
            binding.showArea.text = result
        }

        binding.button3.setOnClickListener {
            val numero = "3"
            result +=numero
            binding.showArea.text = result
        }

        binding.button4.setOnClickListener {
            val numero = "4"
            result +=numero
            binding.showArea.text = result
        }

        binding.button5.setOnClickListener {
            val numero = "5"
            result +=numero
            binding.showArea.text = result
        }

        binding.button6.setOnClickListener {
            val numero = "6"
            result +=numero
            binding.showArea.text = result
        }

        binding.button7.setOnClickListener {
            val numero = "7"
            result +=numero
            binding.showArea.text = result
        }

        binding.button8.setOnClickListener {
            val numero = "8"
            result +=numero
            binding.showArea.text = result
        }

        binding.button9.setOnClickListener {
            val numero = "9"
            result +=numero
            binding.showArea.text = result
        }

        binding.buttonMut.setOnClickListener {
            if(result.isNotEmpty()){
                num1 = result.toDouble()
                result = ""
                binding.showArea.text = ""
            }
            case = 1
        }

        binding.buttonIcal.setOnClickListener {
            val num2 = result.toDouble()
            result = ""
            binding.showArea.text = ""
            var view_result:Double? = null
            when(case){
                1->view_result =  cal.mut(num1,num2)
            }
            binding.showArea.text = "$view_result"
        }


    }
}

