package com.alchemist.a.ewfwef

import androidx.annotation.Keep
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import retrofit2.Response
import retrofit2.http.GET

@Keep
data class Opwslcxsjjiasjix(
    @JsonClass(generateAdapter = true)
    @field:Json(name = "countryCode")
    val cou: String,
)


data class Toekkowkojijixuhzhuuhcsa(
    @JsonClass(generateAdapter = true)
    @Json(name = "sw_ex_gtwoosisjx")
    val sw_ex_gtwoosisjx: String,
    @Json(name = "sw_ex_vwwwuhusd")
    val sw_ex_vwwwuhusd: String,
    @Json(name = "sw_ex_auwyiosoxkc")
    val sw_ex_auwyiosoxkc: String
)
class Vopxxlcpkosjiixhuz(private val bjvjncijdhuhufdsh: Mkoswksijcxhuzhshu) {
    suspend fun xooxzicjuhsgyvby() = bjvjncijdhuhufdsh.nncixjokzxkocijshudgfy()
}

interface Tppwpwppwlsokkodjijxczuh {
    @GET("go.php?to=1&")
    suspend fun mxxlzocksijisa(): Response<Toekkowkojijixuhzhuuhcsa>
}
interface Mkoswksijcxhuzhshu {
    @GET("json/?key=mFBNVQSnCdDASI9")
    suspend fun nncixjokzxkocijshudgfy(): Response<Opwslcxsjjiasjix>
}

class Uowkowkoijsjidhuhuxc(private val nvcjokdkofjieji: Tppwpwppwlsokkodjijxczuh) {
    suspend fun fokkodduhsokasdkoxjicj() = nvcjokdkofjieji.mxxlzocksijisa()
}









