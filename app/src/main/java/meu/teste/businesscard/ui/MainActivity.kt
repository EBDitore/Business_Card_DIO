package meu.teste.businesscard.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
// import meu.teste.businesscard.R
import meu.teste.businesscard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    
    // private val binding by Lazy {ActivityMainBinding.inflate(layoutInflater)}
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) // Adicionei por ter tirado a de cima
        setContentView(binding.root)
    }
}