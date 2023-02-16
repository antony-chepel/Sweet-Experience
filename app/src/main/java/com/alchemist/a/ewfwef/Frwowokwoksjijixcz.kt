package com.alchemist.a.ewfwef

import android.app.Application
import android.content.Context
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level

class Frwowokwoksjijixcz : Application() {

    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId("240783f7-9895-40cb-8579-88f4bee75880")
        MyTracker.initTracker("08718454565594912309", this)

        val ixjcjishu = MyTracker.getTrackerConfig()
        ixjcjishu.isTrackingLaunchEnabled = true
        val vcjxjnjnvduuhsdvdgys = MyTracker.getInstanceId(this)
        val qplqpkoskodko = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        qplqpkoskodko.edit().putString("instId", vcjxjnjnvduuhsdvdgys).apply()

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@Frwowokwoksjijixcz)
            modules(
                listOf(
                    iasjdokasoksd, papalpakosoplxlpzlpckoznx
                )
            )
        }
    }
}