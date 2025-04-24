package com.example.demoValidatesPassports;

import java.time.LocalDate;

public class Passports {

    private String name;//  ФИО
    private LocalDate birth;//  дата рождения
    private Integer series;//  серия
    private Integer number;//   номер
    private String code; //  код подразделения
    private LocalDate issued; //  дата выдачи



    public Passports(String name, LocalDate birth, Integer series, Integer number, String code, LocalDate issued) {
        this.name = name;
        this.birth = birth;
        this.series = series;
        this.number = number;
        this.code = code;
        this.issued = issued;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public Integer getSeries() {
        return series;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalDate getIssued() {
        return issued;
    }

    public void setIssued(LocalDate issued) {
        this.issued = issued;
    }



}
