package com.example.demo.pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Doc {
    private int id;
    private String docName;
    private String patientName;
    private String patientPhone;
    private String startTime;
    private String describe;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    @Basic
    @Column(name = "doc_name")
    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    @Basic
    @Column(name = "patient_name")
    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    @Basic
    @Column(name = "patient_phone")
    public String getPatientPhone() {
        return patientPhone;
    }

    public void setPatientPhone(String patientPhone) {
        this.patientPhone = patientPhone;
    }

    @Basic
    @Column(name = "start_time")
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "describe")
    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doc doc = (Doc) o;
        return Objects.equals(id, doc.id) && Objects.equals(docName, doc.docName) && Objects.equals(patientName, doc.patientName) && Objects.equals(patientPhone, doc.patientPhone) && Objects.equals(startTime, doc.startTime) && Objects.equals(describe, doc.describe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, docName, patientName, patientPhone, startTime, describe);
    }
}
