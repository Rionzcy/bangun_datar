package com.example.bangundatar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val panjang: Double = 5.0
        val lebar: Double = 3.0

        val luas = hitungLuas(panjang, lebar)
        val keliling = hitungKeliling(panjang, lebar)

        println("Luas persegi panjang: $luas")
        println("Keliling persegi panjang: $keliling")
    }
}

fun hitungLuas(panjang: Double, lebar: Double): Double {
    return panjang * lebar
}

fun hitungKeliling(panjang: Double, lebar: Double): Double {
    return 2 * (panjang + lebar)
}
