package com.nmp.advexc160421002

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlin.math.log

class phoneViewModel (application: Application): AndroidViewModel(application){
    val TAG = "volleyTag"
    private var queue: RequestQueue? = null
    val smartphoneLD = MutableLiveData<Array<Smartphone>>()
    fun refresh(){
        Log.d("CEKMASUK", "masukvolley")
        queue = Volley.newRequestQueue(getApplication())
        val url ="http://114.4.217.241/anmp/smartphone.json"
        val stringRequest = StringRequest(
            Request.Method.GET, url,
            {
                val sType = object : TypeToken<List<Smartphone>>() {}.type
                val result = Gson().fromJson<List<Smartphone>>(it,sType)
                smartphoneLD.value = result as Array<Smartphone>?
                Log.d("showvolley", it.toString())
            },
            {
                Log.d("showvoley", it.toString())
            })
    stringRequest.tag = TAG
    queue?.add(stringRequest)
    }

}