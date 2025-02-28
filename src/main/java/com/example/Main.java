package com.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = 10; //Zmenit pocet vygenerovaných uživatelů dle potřeby
        Random rand = new Random();

        for(int i = 0; i < n; i++) {
            boolean isZena = rand.nextBoolean(); //Nahodne vybere jestli bude muz nebo zena
            // Generování náhodných hodnot
            String jmeno = isZena ? RandomGenerator.generujJmenoZeny() : RandomGenerator.generujJmenoMuze();
            String prijmeni = RandomGenerator.generujPrijmeni(isZena);
            String prezdivka = RandomGenerator.generujPrezdivku(jmeno, prijmeni);
            String email = RandomGenerator.generujEmail(prezdivka);
            String heslo = RandomGenerator.generujHeslo();
            int isAdmin = 0;

            // Vytvoření instance Person
            Person person = new Person(jmeno, prijmeni, email, heslo, isAdmin);

            // Vytisknutí informací o osobě
            System.out.println("Generované jméno: " + jmeno + " " + prijmeni);
            System.out.println("Email: " + person.getEmail());
            System.out.println("Heslo: " + person.getHeslo());

            DatabaseHelper.ulozDoDatabaze(person);
        }
    }
}