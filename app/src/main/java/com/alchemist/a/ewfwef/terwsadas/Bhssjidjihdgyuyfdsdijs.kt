package com.alchemist.a.ewfwef.terwsadas
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import com.mvffg.btwolib.BTwoLib
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named


class Bhssjidjihdgyuyfdsdijs : AppCompatActivity() {
    val wopllpqlpkosdko: SharedPreferences by inject(named("SharedPreferences"))
    lateinit var hhcxicjikocxvo: BTwoLib

    override fun onActivityResult(isjdjis: Int, lxlzockzxjisahu: Int, trueujisjiad: Intent?) {
        super.onActivityResult(isjdjis, lxlzockzxjisahu, trueujisjiad)
        if (trueujisjiad != null) {
            hhcxicjikocxvo.onActivityResult(isjdjis, lxlzockzxjisahu, trueujisjiad)
        }
    }

    override fun onBackPressed() {
        if (!hhcxicjikocxvo.onBackPressed()) {
            return
        }
        super.onBackPressed()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        hhcxicjikocxvo = BTwoLib(this@Bhssjidjihdgyuyfdsdijs)
        setContentView(hhcxicjikocxvo)
        hhcxicjikocxvo.profiter(zkkzoxkojisnuizchsuc())
    }

    private fun zkkzoxkojisnuizchsuc(): String {
        val saijdwokkosadko = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
        val kkxcokcvijdjsuhvsd = wopllpqlpkosdko.getString("link", null)
        saijdwokkosadko.edit().putString("SAVED_URL", kkxcokcvijdjsuhvsd).apply()
        return saijdwokkosadko.getString("SAVED_URL", kkxcokcvijdjsuhvsd).toString()
    }


}