package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.myapplication.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnLogin.setOnClickListener {
            startActivity(Intent(this, DashboardActivity::class.java))
        }
        binding.tvHaventAccount.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}