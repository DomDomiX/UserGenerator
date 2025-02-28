package com.example;
public class Person {
    private String jmeno;
    private String prijmeni;
    private String email;
    private String heslo;
    private int isAdmin;

    public Person(String jmeno, String prijmeni, String email, String heslo, int isAdmin) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.email = email;
        this.heslo = heslo;
        this.isAdmin = isAdmin;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public String getEmail() {
        return email;
    }

    public String getHeslo() {
        return heslo;
    }

    public int isAdmin() {
        return isAdmin;
    }

    /*public void setPrezdivka() {
        this.prezdivka = prezdivka;
    }

    public void setEmail() {
        this.email = email;
    }

    public void setHeslo() {
        this.heslo = heslo;
    }*/
}
