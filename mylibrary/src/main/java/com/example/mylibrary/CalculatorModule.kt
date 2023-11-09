package com.example.mylibrary

import android.content.Context
import android.widget.Toast

class CalculatorModule {
    init {
        System.loadLibrary("native-lib.cpp");
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
    }

    external fun addCmake(a:Double,b:Double):Double
    external fun subCmake(a:Double,b:Double):Double
    external fun mulCmake(a:Double,b:Double):Double
    external fun divideCmake(a:Double,b:Double):Double

//    external fun helloLog(logThis: String)
//    external fun add(a: Double, b: Double): Double
//    external fun sub(a: Double, b: Double): Double
//    external fun mul(a: Double, b: Double): Double
//    external fun divide(a: Double, b: Double): Double
}

