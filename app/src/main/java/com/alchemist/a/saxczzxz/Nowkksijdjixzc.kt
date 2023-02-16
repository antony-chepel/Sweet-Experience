package com.alchemist.a.saxczzxz

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.alchemist.a.R
import com.alchemist.a.trwwesad.Yowkkwojishuxc
import com.mvffg.btwolib.decrypt
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named
import javax.crypto.spec.IvParameterSpec
import javax.crypto.spec.SecretKeySpec


class Nowkksijdjixzc : Fragment() {
    private lateinit var nxzcu: Context

    val wiiwosok = "AES/CBC/PKCS5Padding"
    lateinit var nnjcjvjvdij: String

    lateinit var rokeok: String
    val otkokerkoejijiasdf = SecretKeySpec("cRfUjXn2r5u8x!A%D*G-KaPdSgVkYp3s".toByteArray(), "AES")
    val bkvovbkookdjisjif by activityViewModel<Yowkkwojishuxc>(named("MainModel"))

    lateinit var zxhchuzxhu: String
    val apalsaoksakojijixizxhcu: SharedPreferences by inject(named("SharedPreferences"))
    val aoks = IvParameterSpec(ByteArray(16))



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.cookxijhcusw, container, false)
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        nxzcu = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bkvovbkookdjisjif.flplprplplasokdkoxcko.observe(viewLifecycleOwner) {
            if (it != null) {
                val main = it.toString()
                apalsaoksakojijixizxhcu.edit().putString("mainId", main).apply()
            }
        }

        bkvovbkookdjisjif.eokwkokosd.observe(viewLifecycleOwner) {
            if (it != null) {
                nnjcjvjvdij = it.sw_ex_gtwoosisjx
                zxhchuzxhu = it.sw_ex_auwyiosoxkc
                rokeok = it.sw_ex_vwwwuhusd
                val otokfkg = decrypt(wiiwosok, nnjcjvjvdij, otkokerkoejijiasdf, aoks)
                val wpqlpplqlpskodjiixjc = decrypt(wiiwosok, rokeok, otkokerkoejijiasdf, aoks)

                apalsaoksakojijixizxhcu.edit().putString("countryDev", otokfkg).apply()
                apalsaoksakojijixizxhcu.edit().putString("apps", zxhchuzxhu).apply()
                apalsaoksakojijixizxhcu.edit().putString("wv", wpqlpplqlpskodjiixjc).apply()

                findNavController().navigate(R.id.adpppdokcjivx)
            }
        }
    }


}