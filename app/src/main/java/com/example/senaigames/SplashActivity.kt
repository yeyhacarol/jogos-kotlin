package com.example.senaigames

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import kotlin.concurrent.schedule

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        setContentView(R.layout.activity_splash)
        Timer().schedule(3000){abrirProdutos()}
    }

    private fun abrirProdutos() {
        val intent = Intent(this, ProdutosActivity::class.java)
        startActivity(intent)
        finish()
    }
}