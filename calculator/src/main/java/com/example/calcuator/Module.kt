package com.example.calcuator

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class Module : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun showToast(context:Context,toastMsg:String){
        Toast.makeText(context,toastMsg,Toast.LENGTH_LONG).show();
    }

    companion object {
        private fun add(num1: Double, num2: Double): Double {
            return num1 + num2
        }

        private fun subtract(num1: Double, num2: Double): Double {
            return num1 - num2
        }

        private fun multiply(num1: Double, num2: Double): Double {
            return num1 * num2
        }

        private fun divide(num1: Double, num2: Double): Double {
            if (num2 == 0.0) {
                throw ArithmeticException("ERROR")
            }
            return num1 / num2
        }
    }
}
