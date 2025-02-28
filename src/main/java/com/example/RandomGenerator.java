package com.example;
import java.util.Random;

public class RandomGenerator {
    private static final String[] JMENAMUZ = {"Jan", "Petr", "Karel", "Dominik", "Filip", "Pavel", "Tomáš", "Josef", "Jakub", "David"};
    private static final String[] JMENAZENA = {"Eva", "Anna", "Markéta", "Marie", "Lenka", "Denisa", "Lucie", "Simona", "Klára", "Aneta"};
    private static final String[] PRIJMENI = {"Novak", "Svobod", "Blažk", "Kučer", "Horak", "Tyč", "Salaj", "Rychtr"};
    private static final String[] EMAIL = {"@gmail.com", "@seznam.cz", "@centrum.com"};
    boolean isZena;

    private static Random rand = new Random();

    //Metoda pro generavání náhodného jména
    public static String generujJmenoMuze() {
        return JMENAMUZ[rand.nextInt(JMENAMUZ.length)];
    } 

    public static String generujJmenoZeny() {
        return JMENAZENA[rand.nextInt(JMENAZENA.length)];
    } 

    //Metoda pro generování náhodného přijmení
    public static String generujPrijmeni(boolean isZena) {
        if (isZena == true)
            return PRIJMENI[rand.nextInt(PRIJMENI.length)] + "ová";
        else
            return PRIJMENI[rand.nextInt(PRIJMENI.length)];
    }

    // Metoda pro generování přezdívky
    public static String generujPrezdivku(String jmeno, String prijmeni) {
        return jmeno.substring(0, 3) + prijmeni.substring(0, 3) + rand.nextInt(100);
    }

    // Metoda pro generování emailu
    public static String generujEmail(String prezdivka) {
        return prezdivka + EMAIL[rand.nextInt(EMAIL.length)];
    }

    // Metoda pro generování hesla
    public static String generujHeslo() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            password.append(chars.charAt(rand.nextInt(chars.length())));
        }
        return password.toString();
    }
}
