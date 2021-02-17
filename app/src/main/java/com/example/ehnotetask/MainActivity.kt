package com.example.ehnotetask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ehnotetask.adapter.PatientAdapter
import com.example.ehnotetask.api.BasicAuthClient
import com.example.ehnotetask.model.Patient
import com.example.ehnotetask.model.PatientFile
import com.example.ehnotetask.service.PatientDetails
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {


    lateinit var recyclerView:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView=findViewById(R.id.recycler)
        recyclerView.layoutManager=LinearLayoutManager(this@MainActivity,LinearLayoutManager.VERTICAL,false)





        val call = BasicAuthClient<PatientDetails>().create(PatientDetails::class.java).getDetail()

        call.enqueue(object: Callback<Patient> {
            override fun onFailure(call: Call<Patient>, t: Throwable) {
                Log.e("DemoClass", t.message, t)
            }

            override fun onResponse(call: Call<Patient>, response: Response<Patient>) {
                if (response.isSuccessful) {
                    val patientList = response.body()?.patientFiles as ArrayList<PatientFile>

                    recyclerView.setAdapter(
                        PatientAdapter(
                            this@MainActivity,patientList
                        )
                    )

                } else {
                    Log.e("test", "Error: ${response.code()} ${response.message()}")
                }
            }
        })

    }
}