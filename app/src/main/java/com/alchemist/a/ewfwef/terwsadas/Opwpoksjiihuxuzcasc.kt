package com.alchemist.a.ewfwef.terwsadas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alchemist.a.databinding.ActivityOpwpoksjiihuxuzcascBinding
import com.alchemist.a.trwwesad.Ruiwjishuxjnzchsdas

class Opwpoksjiihuxuzcasc : AppCompatActivity() {
    private lateinit var saiwdjiji : ActivityOpwpoksjiihuxuzcascBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        saiwdjiji = ActivityOpwpoksjiihuxuzcascBinding.inflate(layoutInflater)
        setContentView(saiwdjiji.root)
        wwoskoadko()
    }


    private fun wwoskoadko() = with(saiwdjiji){
        val stda = intent.getIntExtra("sw_scrs",100)


        if(stda<=100){
            sdjiaijasdi.text = "Bad try, should play more !"
        }
        osaokodasko.text = "Sweet scores : $stda"

        zxcjiijzx.setOnClickListener {
            startActivity(Intent(this@Opwpoksjiihuxuzcasc, Ruiwjishuxjnzchsdas::class.java))
        }
    }
}