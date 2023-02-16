package com.alchemist.a.ewfwef
import com.onesignal.OneSignal
import android.view.View
import android.view.ViewGroup

import com.alchemist.a.BuildConfig
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build


import com.alchemist.a.R
import com.alchemist.a.ewfwef.terwsadas.Bhssjidjihdgyuyfdsdijs
import com.alchemist.a.trwwesad.Ruiwjishuxjnzchsdas
import com.appsflyer.AppsFlyerLib
import org.json.JSONException
import org.json.JSONObject

import com.my.tracker.MyTracker
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named
import android.content.Context

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater






class Eoqokqkojisxhucs : Fragment() {
    private lateinit var hcokzxkkoczxji: Context
    val pwklkowkos: SharedPreferences by inject(named("SharedPreferences"))

    override fun onAttach(context: Context) {
        super.onAttach(context)
        hcokzxkkoczxji = context
    }

    private fun gcjixzjixzokkosajiasji(koprkokodkoasfjixc: String) {
        OneSignal.setExternalUserId(
            koprkokodkoasfjixc,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(llxzockiasj: JSONObject) {

                    try {
                        if (llxzockiasj.has("push") && llxzockiasj.getJSONObject("push").has("success")) {
                            val ffijijdjisjif = llxzockiasj.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $ffijijdjisjif"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (llxzockiasj.has("email") && llxzockiasj.getJSONObject("email").has("success")) {
                            val nznxjcijasjiuhhuw =
                                llxzockiasj.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $nznxjcijasjiuhhuw"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (llxzockiasj.has("sms") && llxzockiasj.getJSONObject("sms").has("success")) {
                            val apqokkowkojisajid = llxzockiasj.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $apqokkowkojisajid"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {

                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val wok = pwklkowkos.getString("countryDev", null)
        val nzxci = pwklkowkos.getString("appCamp", null)
        val rokekopw = pwklkowkos.getString("country", null)
        val tsy = "sub_id_1="


        val twiok = pwklkowkos.getString("mainId", null)
        val zxjjzxcjuish: String? = pwklkowkos.getString("instId", null)
        val bokvokjichudf = BuildConfig.APPLICATION_ID


        val ropkplelplpeokasdkoji = "ad_id="
        val plwpllpskod = pwklkowkos.getString("wv", null)
        val xvciijucxhjjd = "sub_id_4="

        val sdjiao = "deviceID="
        val rkokodskofji = Intent(hcokzxkkoczxji, Bhssjidjihdgyuyfdsdijs::class.java)
        val palspaskokojixijcxjczuh = MyTracker.getTrackerParams()
        palspaskokojixijcxjczuh.customUserId = twiok

        val dji = pwklkowkos.getString("apps", null)
        val woke = "deeporg"

        val sidjowkosjix = pwklkowkos.getString("deepSt", null)
        val vvvivicvjcvjicvhuuxc = Intent(hcokzxkkoczxji, Ruiwjishuxjnzchsdas::class.java)
        val odkokasdjixji = "sub_id_6="
        gcjixzjixzokkosajiasji(twiok.toString())
        val sdji = "naming"

        val jdjsdkofjijehudsf = Build.VERSION.RELEASE
        val ogkkofkod = AppsFlyerLib.getInstance().getAppsFlyerUID(hcokzxkkoczxji)
        AppsFlyerLib.getInstance().setCollectAndroidID(true)
        val kdo = "sub_id_5="

        val aplaslpokw = "$plwpllpskod$tsy$nzxci&$sdjiao$ogkkofkod&$ropkplelplpeokasdkoji$twiok&$xvciijucxhjjd$bokvokjichudf&$kdo$jdjsdkofjijehudsf&$odkokasdjixji$sdji"
        val ywiijs = "$plwpllpskod$sdjiao$twiok&$ropkplelplpeokasdkoji$zxjjzxcjuish&$xvciijucxhjjd$bokvokjichudf&$kdo$jdjsdkofjijehudsf&$odkokasdjixji$sdji"
        val lxlxlock = "$plwpllpskod$tsy$sidjowkosjix&$sdjiao$ogkkofkod&$ropkplelplpeokasdkoji$twiok&$xvciijucxhjjd$bokvokjichudf&$kdo$jdjsdkofjijehudsf&$odkokasdjixji$woke"
        val wuuiwwjiwkosjixjc = "$plwpllpskod$tsy$sidjowkosjix&$sdjiao$twiok&$ropkplelplpeokasdkoji$zxjjzxcjuish&$xvciijucxhjjd$bokvokjichudf&$kdo$jdjsdkofjijehudsf&$odkokasdjixji$woke"

        when(dji) {
            "1" ->
                if(nzxci!= "null") {
                    pwklkowkos.edit().putString("link", aplaslpokw).apply()
                    startActivity(rkokodskofji)
                    activity?.finish()
                } else if (sidjowkosjix!=null||wok!!.contains(rokekopw.toString())) {
                    pwklkowkos.edit().putString("link", lxlxlock).apply()
                    startActivity(rkokodskofji)
                    activity?.finish()
                } else {
                    startActivity(vvvivicvjcvjicvhuuxc)
                    activity?.finish()
                }
            "0" ->
                if(sidjowkosjix!=null) {
                    pwklkowkos.edit().putString("link", wuuiwwjiwkosjixjc).apply()
                    startActivity(rkokodskofji)
                    activity?.finish()
                } else if (wok!!.contains(rokekopw.toString())) {
                    pwklkowkos.edit().putString("link", ywiijs).apply()
                    startActivity(rkokodskofji)
                    activity?.finish()
                } else {
                    startActivity(vvvivicvjcvjicvhuuxc)
                    activity?.finish()
                }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.teijiwjihushuczx, container, false)
    }




}