package com.alchemist.a.trwwesad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alchemist.a.databinding.ActivityRuiwjishuxjnzchsdasBinding
import com.alchemist.a.saxczzxz.utydfg.Tiwokqkoosokjixzchus

class Ruiwjishuxjnzchsdas : AppCompatActivity() {
    private lateinit var iwowpwplelpelpeok : ActivityRuiwjishuxjnzchsdasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        iwowpwplelpelpeok = ActivityRuiwjishuxjnzchsdasBinding.inflate(layoutInflater)
        setContentView(iwowpwplelpelpeok.root)
        iwowpwplelpelpeok.swBStrt.setOnClickListener {
            startActivity(Intent(this, Tiwokqkoosokjixzchus::class.java))
        }

        iwowpwplelpelpeok.swExit.setOnClickListener {
            finish()
        }
    }
}