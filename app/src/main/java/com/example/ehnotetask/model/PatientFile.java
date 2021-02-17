package com.example.ehnotetask.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PatientFile {

    @SerializedName("DocumentID")
    @Expose
    private Integer documentID;
    @SerializedName("TreatmentPlanId")
    @Expose
    private Integer treatmentPlanId;
    @SerializedName("ConsultationId")
    @Expose
    private Integer consultationId;
    @SerializedName("DocURL")
    @Expose
    private String docURL;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("thumbUrl")
    @Expose
    private String thumbUrl;
    @SerializedName("DocName")
    @Expose
    private String docName;
    @SerializedName("FileName")
    @Expose
    private String fileName;
    @SerializedName("FileExt")
    @Expose
    private String fileExt;
    @SerializedName("Remarks")
    @Expose
    private String remarks;
    @SerializedName("FileTypeId")
    @Expose
    private Integer fileTypeId;
    @SerializedName("OrgConsentFormId")
    @Expose
    private Integer orgConsentFormId;
    @SerializedName("SignedDate")
    @Expose
    private String signedDate;
    @SerializedName("ProcedureId")
    @Expose
    private Object procedureId;
    @SerializedName("AppointmentId")
    @Expose
    private Integer appointmentId;
    @SerializedName("IsPartiallyUploaded")
    @Expose
    private Boolean isPartiallyUploaded;
    @SerializedName("SubmitInd")
    @Expose
    private Boolean submitInd;
    @SerializedName("LabTestId")
    @Expose
    private Object labTestId;
    @SerializedName("PatientDisplayId")
    @Expose
    private String patientDisplayId;

    public Integer getDocumentID() {
        return documentID;
    }

    public void setDocumentID(Integer documentID) {
        this.documentID = documentID;
    }

    public Integer getTreatmentPlanId() {
        return treatmentPlanId;
    }

    public void setTreatmentPlanId(Integer treatmentPlanId) {
        this.treatmentPlanId = treatmentPlanId;
    }

    public Integer getConsultationId() {
        return consultationId;
    }

    public void setConsultationId(Integer consultationId) {
        this.consultationId = consultationId;
    }

    public String getDocURL() {
        return docURL;
    }

    public void setDocURL(String docURL) {
        this.docURL = docURL;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileExt() {
        return fileExt;
    }

    public void setFileExt(String fileExt) {
        this.fileExt = fileExt;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getFileTypeId() {
        return fileTypeId;
    }

    public void setFileTypeId(Integer fileTypeId) {
        this.fileTypeId = fileTypeId;
    }

    public Integer getOrgConsentFormId() {
        return orgConsentFormId;
    }

    public void setOrgConsentFormId(Integer orgConsentFormId) {
        this.orgConsentFormId = orgConsentFormId;
    }

    public String getSignedDate() {
        return signedDate;
    }

    public void setSignedDate(String signedDate) {
        this.signedDate = signedDate;
    }

    public Object getProcedureId() {
        return procedureId;
    }

    public void setProcedureId(Object procedureId) {
        this.procedureId = procedureId;
    }

    public Integer getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Integer appointmentId) {
        this.appointmentId = appointmentId;
    }

    public Boolean getIsPartiallyUploaded() {
        return isPartiallyUploaded;
    }

    public void setIsPartiallyUploaded(Boolean isPartiallyUploaded) {
        this.isPartiallyUploaded = isPartiallyUploaded;
    }

    public Boolean getSubmitInd() {
        return submitInd;
    }

    public void setSubmitInd(Boolean submitInd) {
        this.submitInd = submitInd;
    }

    public Object getLabTestId() {
        return labTestId;
    }

    public void setLabTestId(Object labTestId) {
        this.labTestId = labTestId;
    }

    public String getPatientDisplayId() {
        return patientDisplayId;
    }

    public void setPatientDisplayId(String patientDisplayId) {
        this.patientDisplayId = patientDisplayId;
    }

}