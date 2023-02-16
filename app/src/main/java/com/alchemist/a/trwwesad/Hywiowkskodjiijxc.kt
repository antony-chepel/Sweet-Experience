package com.alchemist.a.trwwesad

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
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named

class Hywiowkskodjiijxc : Fragment() {
    val ffpllpcxlpvkoxcokvxko by activityViewModel<Yowkkwojishuxc>(named("MainModel"))

    val jxzjcnjnzxjnushuasc: SharedPreferences by inject(named("SharedPreferences"))

    lateinit var sdowkkodkosoa: String

    private lateinit var ysiadijijxjici: Context

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.oqokqkosijhuxcs, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        ysiadijijxjici = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val iuisjduwkosxckoz = jxzjcnjnzxjnushuasc.getString("apps", null)
        val rwyuwus = jxzjcnjnzxjnushuasc.getString("appCamp", null)

        if (iuisjduwkosxckoz=="1" && rwyuwus == null) {
            ffpllpcxlpvkoxcokvxko.pdllpelpplskoxkozkoc(ysiadijijxjici)
            ffpllpcxlpvkoxcokvxko.wokwdo.observe(viewLifecycleOwner) {
                if (it != null) {
                    sdowkkodkosoa = it.toString()
                    jxzjcnjnzxjnushuasc.edit().putString("appCamp", sdowkkodkosoa).apply()
                    findNavController().navigate(R.id.clxlxlckdsijf)
                }
            }
        } else {
            findNavController().navigate(R.id.clxlxlckdsijf)
        }
    }





}