package com.example.listview;

public class Country {
    private String nombre;
    private String capital;
    private String poblacion;
    private String iso3;
    private String code;

    public Country(String code, String nombre, String poblacion, String capital, String iso3 ){
        this.nombre=nombre;
        this.capital=capital;
        this.poblacion=poblacion;
        this.code=code;
        this.iso3=iso3;
    }

    public String getIso3() {
        return iso3;
    }

    public void setIso3(String iso3) {
        this.iso3 = iso3;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }





}
