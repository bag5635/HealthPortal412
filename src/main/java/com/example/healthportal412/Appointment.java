package com.example.healthportal412;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String date;
    private String time;
    private String doctor;

    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id =id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String newDate){
        this.date = newDate;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String newTime){
        this.time = newTime;
    }
    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String newDoctor){
        this.doctor = newDoctor;
    }
}
