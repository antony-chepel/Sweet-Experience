package com.alchemist.a.saxczzxz.utydfg

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.alchemist.a.R
import com.alchemist.a.trwwesad.Yowkkwojishuxc
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named



class Dapaalpxkoxkozjihcus : Fragment() {
    private lateinit var nnxjcjnuahaus: Context
    val owowowuishuahuxhcuz by activityViewModel<Yowkkwojishuxc>(named("MainModel"))


    override fun onAttach(context: Context) {
        super.onAttach(context)
        nnxjcjnuahaus=context
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.iwowisjuhxcsa, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        owowowuishuahuxhcuz.fplrlpelppleplokaskodoxzc(nnxjcjnuahaus)

        findNavController().navigate(R.id.dokdjifeuhndfs)

    }

}