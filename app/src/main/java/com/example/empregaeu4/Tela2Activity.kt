package com.example.empregaeu4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.empregaeu4.databinding.ActivityTela2Binding

private infix fun Nothing?.intent(tela2Activity: Tela2Activity): Any {

}

object new {

}

class Tela2Activity : AppCompatActivity() {

    private lateinit var binding: ActivityTela2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTela2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val usuarioNome = binding.tvUsuarioNome
        val nome = intent.getStringExtra("nome")
        usuarioNome.text = nome
        //setContentView(R.layout.activity_tela2)

    }

    fun chamarAlimentacao(view: View) {

        intent = new intent (this, Activity_tela_3.class);
        startActivity(intent)
    }
}
