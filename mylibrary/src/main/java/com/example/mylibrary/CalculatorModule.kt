package com.example.mylibrary

import android.content.Context
import android.widget.Toast

class CalculatorModule {

    init {
        System.loadLibrary("native.c");
    }

    companion object {

        private var instance: CalculatorModule? = null

        fun getInstance(): CalculatorModule {
            if (instance == null) {
                instance = CalculatorModule()
            }

            return instance as CalculatorModule
        }

        fun showToast(context: Context, toastMsg: String) {
            Toast.makeText(context, toastMsg, Toast.LENGTH_LONG).show();

        }

//        public fun getAdd(num1: Double, num2: Double): Double {
//
//            return add(num1, num2)
//        }
//        public fun getSub(num1: Double, num2: Double): Double {
//            return subtract(num1, num2);
//        }
//        public fun getMul(num1: Double, num2: Double): Double {
//            return multiply(num1, num2);
//        }
//        public fun getDivide(num1: Double, num2: Double): Double {
//            return divide(num1, num2);
//        }
    }


    external fun helloLog(logThis: String)
    external fun add(a: Double, b: Double): Double
    external fun sub(a: Double, b: Double): Double
    external fun mul(a: Double, b: Double): Double
    external fun divide(a: Double, b: Double): Double
}

