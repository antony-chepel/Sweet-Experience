package com.alchemist.a.saxczzxz.utydfg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import androidx.core.content.ContextCompat
import com.alchemist.a.R
import com.alchemist.a.databinding.ActivityTiwokqkoosokjixzchusBinding
import com.alchemist.a.ewfwef.terwsadas.Opwpoksjiihuxuzcasc
import kotlin.random.Random

class Tiwokqkoosokjixzchus : AppCompatActivity() {
    private lateinit var osakodkowji: ActivityTiwokqkoosokjixzchusBinding
    private var zhuxcuhzxchuzchux: CountDownTimer? = null
    var wokqwkoqkodkooakods = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        osakodkowji = ActivityTiwokqkoosokjixzchusBinding.inflate(layoutInflater)
        setContentView(osakodkowji.root)
        asdijdasji()
        osiajdwuh()
    }

    private fun asdijdasji(){
        zhuxcuhzxchuzchux?.cancel()
        zhuxcuhzxchuzchux = object : CountDownTimer(30000,100){
            override fun onTick(millisUntilFinished: Long) {

            }

            override fun onFinish() {
                startActivity(Intent(this@Tiwokqkoosokjixzchus, Opwpoksjiihuxuzcasc::class.java)
                    .putExtra("sw_scrs",wokqwkoqkodkooakods)
                )

            }

        }.start()
    }

    private fun osiajdwuh() = with(osakodkowji) {
        val idjhuauhs = listOf(
            30,
            50,
            100,
            300,
            500,
            80,
            150,
            200,

        )
        val ixjcvjixvcji = idjhuauhs[Random.nextInt(8)]
        val osdkodkdkoas: MutableList<Int> =
            mutableListOf(R.drawable.sw_ex_1, R.drawable.sw_ex_6, R.drawable.sw_ex_3, R.drawable.sw_ex_4, R.drawable.sw_ex_5,
                R.drawable.sw_ex_6, R.drawable.sw_ex_1, R.drawable.sw_ex_3,R.drawable.sw_ex_5,R.drawable.sw_ex_6,R.drawable.sw_ex_4,R.drawable.sw_ex_1,)

        val asidjasjid = arrayOf(button1, button2, button3, button4, button5, button6, button7, button8,
            button9, button10, button11, button12)

        val lxzlxzockkozxjiczxjiscc = R.drawable.sw_ex_back
        var sdajidsa = 0
        var jnzcjnczjnjcnxz = false
        var sijdaijsdsji = -1

        osdkodkdkoas.shuffle()
        for(i in 0..11){
            asidjasjid[i].setImageResource(lxzlxzockkozxjiczxjiscc)
            asidjasjid[i].setOnClickListener {
                if (asidjasjid[i].drawable.constantState == ContextCompat.getDrawable(this@Tiwokqkoosokjixzchus, lxzlxzockkozxjiczxjiscc)?.constantState && !jnzcjnczjnjcnxz) {
                    asidjasjid[i].setImageResource(osdkodkdkoas[i])
                    if (sdajidsa == 0) {
                        sijdaijsdsji = i
                    }
                    sdajidsa++
                } else if (asidjasjid[i].drawable.constantState != ContextCompat.getDrawable(this@Tiwokqkoosokjixzchus, lxzlxzockkozxjiczxjiscc)?.constantState) {
                    asidjasjid[i].setImageResource(lxzlxzockkozxjiczxjiscc)
                    sdajidsa--
                }

                if (sdajidsa == 2) {
                    jnzcjnczjnjcnxz = true
                    if (asidjasjid[i].drawable.constantState == asidjasjid[sijdaijsdsji].drawable.constantState) {
                        asidjasjid[i].isClickable = false
                        asidjasjid[sijdaijsdsji].isClickable = false
                        jnzcjnczjnjcnxz = false
                        wokqwkoqkodkooakods +=ixjcvjixvcji
                        textView.text = "Your sweet scores : $wokqwkoqkodkooakods"
                        sdajidsa = 0
                    }
                } else if (sdajidsa == 0) {
                    jnzcjnczjnjcnxz = false
                }
            }
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        zhuxcuhzxchuzchux?.cancel()
    }

}