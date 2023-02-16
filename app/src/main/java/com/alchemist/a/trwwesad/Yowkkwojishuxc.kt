package com.alchemist.a.trwwesad

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alchemist.a.ewfwef.Toekkowkojijixuhzhuuhcsa
import com.alchemist.a.ewfwef.Opwslcxsjjiasjix
import com.alchemist.a.ewfwef.Uowkowkoijsjidhuhuxc
import com.alchemist.a.ewfwef.Vopxxlcpkosjiixhuz
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.facebook.applinks.AppLinkData
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class Yowkkwojishuxc (private val isuwhwijsdji: Vopxxlcpkosjiixhuz, private val yeowkkookasokdjiadjis: Uowkowkoijsjidhuhuxc, private val bbvcjjcjbijjjdfjib: SharedPreferences, val qopqkowkoskokoadk: Application): ViewModel(){

    init {
        viewModelScope.launch (Dispatchers.IO){
            fplrlplplpaplkokxozcko()
        }
        viewModelScope.launch (Dispatchers.Main){
            ijwjijwijisdok()
        }
    }



    private val kzxkcjnzjnxcjnzxuhs = MutableLiveData<Opwslcxsjjiasjix>()
    val fokrkokosdakof: LiveData<Opwslcxsjjiasjix>
        get() = kzxkcjnzjnxcjnzxuhs


    private val vplclplplpckokocjivd = MutableLiveData<Toekkowkojijixuhzhuuhcsa>()
    val eokwkokosd: LiveData<Toekkowkojijixuhzhuuhcsa>
        get() = vplclplplpckokocjivd

    fun pdllpelpplskoxkozkoc(tplplpldflp: Context) {
        AppsFlyerLib.getInstance()
            .init("CjYeiSUHuv9abLvm5xAjaM", pgpltlplpflpkoxkocvijjixcji, qopqkowkoskokoadk)
        AppsFlyerLib.getInstance().start(tplplpldflp)
    }




    fun fplrlplplpaplkokxozcko() {
        val pepwpllpsakodkoasko = AdvertisingIdClient(qopqkowkoskokoadk)
        pepwpllpsakodkoasko.start()
        val pzpzllpokkocokx = pepwpllpsakodkoasko.info.id.toString()
        lrrkokoekokokoaskod.postValue(pzpzllpokkocokx)
    }

    private val oeiejjisajid = MutableLiveData<String>()
    val nnzxcjjnzij: LiveData<String>
        get() = oeiejjisajid

    suspend fun ijwjijwijisdok() {
        kzxkcjnzjnxcjnzxuhs.postValue(isuwhwijsdji.xooxzicjuhsgyvby().body())
        glptkokokosdjifjixizjc()
    }




    fun fplrlpelppleplokaskodoxzc(pwllps: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            pwllps
        ) { mmxcmkvxijsdi: AppLinkData? ->
            mmxcmkvxijsdi?.let {
                val oppelpplsapdl = mmxcmkvxijsdi.targetUri?.host.toString()
                bbvcjjcjbijjjdfjib.edit().putString("deepSt", oppelpplsapdl).apply()
            }
        }
    }

    private val fokrkokojidsfij = MutableLiveData<String>()
    val wokwdo: LiveData<String>
        get() = fokrkokojidsfij

    suspend fun glptkokokosdjifjixizjc() {
        try {
            vplclplplpckokocjivd.postValue(yeowkkookasokdjiadjis.fokkodduhsokasdkoxjicj().body())
        } catch (e:java.lang.Exception) {
        }
    }

    private val pgpltlplpflpkoxkocvijjixcji  = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(ropellpslpaldp: MutableMap<String, Any>?) {
            val tlplptlplpdfkoocvkkoko = ropellpslpaldp?.get("campaign").toString()
            fokrkokojidsfij.postValue(tlplptlplpdfkoocvkkoko)
        }
        override fun onConversionDataFail(error: String?) {
        }
        override fun onAppOpenAttribution(data: MutableMap<String, String>?) {

        }
        override fun onAttributionFailure(error: String?) {
        }
    }

    private val lrrkokoekokokoaskod = MutableLiveData<String?>()
    val flplprplplasokdkoxcko: LiveData<String?>
        get() = lrrkokoekokokoaskod



}