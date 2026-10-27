package com.example.myapplication

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_splash)
        Handler(Looper.getMainLooper()).postDelayed({ showRegister() }, 3000)
    }

    private fun showRegister() {
        setContentView(R.layout.activity_register)
        findViewById<View>(R.id.btnRegister).setOnClickListener { showLogin() }
    }

    private fun showLogin() {
        setContentView(R.layout.activity_login)
        findViewById<View>(R.id.btnLogin).setOnClickListener { showProduct() }
    }

    private fun showProduct() {
        setContentView(R.layout.activity_product_detail)
        findViewById<View>(R.id.btnAddToCart).setOnClickListener { showSettings() }
    }

    private fun showSettings() {
        setContentView(R.layout.activity_settings)
        findViewById<View>(R.id.btnClearCache).setOnClickListener {
            findViewById<ProgressBar>(R.id.pbStorageProgress).progress = 0
            findViewById<TextView>(R.id.txtCacheUsage).text = "Đã sử dụng 0% (0 GB / 2.0 GB)"
            Toast.makeText(this, "Đã xóa bộ nhớ đệm", Toast.LENGTH_SHORT).show()
        }
    }
}