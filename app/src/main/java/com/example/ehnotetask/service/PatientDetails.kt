package com.example.ehnotetask.service

import com.example.ehnotetask.model.Patient
import com.example.ehnotetask.model.PatientFile
import retrofit2.Call
import retrofit2.http.GET

interface   PatientDetails {

    @GET("GetPatientNoteFilesbyId?AppointmentId=1557963")
    fun getDetail(): Call<Patient>
}


