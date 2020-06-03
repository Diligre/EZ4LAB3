package com.example.ez4lab3.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "student")
public class Student {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String fio;

    private String formEducation;

    private String profcom;

    private String international;

    private String married;

    private String children;

    private String familyCondition;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getFormEducation() {
        return formEducation;
    }

    public void setFormEducation(String formEducation) {
        this.formEducation = formEducation;
    }

    public String getProfcom() {
        return profcom;
    }

    public void setProfcom(String profcom) {
        this.profcom = profcom;
    }

    public String getInternational() {
        return international;
    }

    public void setInternational(String international) {
        this.international = international;
    }

    public String getMarried() {
        return married;
    }

    public void setMarried(String married) {
        this.married = married;
    }

    public String getChildren() {
        return children;
    }

    public void setChildren(String children) {
        this.children = children;
    }

    public String getFamilyCondition() {
        return familyCondition;
    }

    public void setFamilyCondition(String familyCondition) {
        this.familyCondition = familyCondition;
    }

    public Student(int id, String fio, String formEducation, String profcom, String international, String married, String children, String familyCondition) {
        this.id = id;
        this.fio = fio;
        this.formEducation = formEducation;
        this.profcom = profcom;
        this.international = international;
        this.married = married;
        this.children = children;
        this.familyCondition = familyCondition;
    }
}
