package com.company;

public abstract class Uybulo extends Randomy {
    private String jashaganJeri;


    public Uybulo(String jashaganJeri) {
        this.jashaganJeri = jashaganJeri;
    }

    public String getJashaganJeri() {
        return jashaganJeri;
    }

    public void setJashaganJeri(String jashaganJeri) {
        this.jashaganJeri = jashaganJeri;
    }



    @Override
    public String toString() {
        return "Uybulo " +
                "jashaganJeri = " + jashaganJeri ;
    }
}
