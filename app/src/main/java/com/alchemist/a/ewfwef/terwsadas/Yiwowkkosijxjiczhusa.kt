package com.alchemist.a.ewfwef

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.alchemist.a.trwwesad.Yowkkwojishuxc
import com.squareup.moshi.Moshi
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

val iasjdokasoksd = module {
    single<Tppwpwppwlsokkodjijxczuh>(named("HostInter")) {
        get<Retrofit>(named("RetroDev"))
            .create(Tppwpwppwlsokkodjijxczuh::class.java)
    }

    single <Mkoswksijcxhuzhshu> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(Mkoswksijcxhuzhshu::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }
    single<Retrofit>(named("RetroDev")) {
        Retrofit.Builder()
            .baseUrl("http://elitenebula.xyz/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }
    factory(named("DevRep")) {
        Uowkowkoijsjidhuhuxc(get(named("HostInter")))
    }
    factory (named("CountryRep")) {
        Vopxxlcpkosjiixhuz(get(named("ApiInter")))
    }

    single {
        sokskowjisjiamxzmcji()
    }
    single(named("SharedPreferences")) {
        nxcjnijvuhsdhu(androidApplication())
    }

}
fun nxcjnijvuhsdhu(osaodplwoksdaji: Application): SharedPreferences {
    return osaodplwoksdaji.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}

fun sokskowjisjiamxzmcji(): Moshi {
    return Moshi.Builder().build()
}

val papalpakosoplxlpzlpckoznx = module {
    viewModel (named("MainModel")){
        Yowkkwojishuxc(get(named("CountryRep")), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
}