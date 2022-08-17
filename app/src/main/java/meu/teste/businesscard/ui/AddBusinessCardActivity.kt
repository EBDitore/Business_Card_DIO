package meu.teste.businesscard.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import meu.teste.businesscard.databinding.ActivityAddBusinessCardBinding
import meu.teste.businesscard.databinding.ActivityMainBinding

class AddBusinessCardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddBusinessCardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddBusinessCardBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}