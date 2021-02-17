package com.example.ehnotetask.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Patient {

    @SerializedName("PatientFiles")
    @Expose
    private List<PatientFile> patientFiles = null;
    @SerializedName("ForumFiles")
    @Expose
    private List<Object> forumFiles = null;

    public List<PatientFile> getPatientFiles() {
        return patientFiles;
    }

    public void setPatientFiles(List<PatientFile> patientFiles) {
        this.patientFiles = patientFiles;
    }

    public List<Object> getForumFiles() {
        return forumFiles;
    }

    public void setForumFiles(List<Object> forumFiles) {
        this.forumFiles = forumFiles;
    }

}