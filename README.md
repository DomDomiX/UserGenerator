# User Generator

Tento projekt je jednoduchá Java aplikace pro generování náhodných uživatelů a jejich ukládání do MySQL databáze.

## 📌 Funkcionalita
- Náhodné generování jména a příjmení (podle pohlaví)
- Generování přezdívky, emailu a hesla
- Ukládání vygenerovaných uživatelů do MySQL databáze

## 🛠️ Technologie
- Java
- MySQL
- JDBC

## 📦 Struktura projektu
```
UserGenerator/
│-- src/main/java/com/example/
│   ├── Main.java             # Hlavní spouštěcí třída
│   ├── RandomGenerator.java  # Generování jmen, příjmení, emailů, hesel
│   ├── DatabaseHelper.java   # Práce s databází
│   ├── Person.java           # Reprezentace osoby
│-- README.md                 # Tento soubor
```

## 🚀 Instalace a spuštění

1. **Naklonuj repozitář:**
```sh
git clone https://github.com/tvoje-jmeno/user-generator.git
cd user-generator
```

2. **Nastav MySQL databázi:**
   - Vytvoř databázi `users`
   - Vytvoř tabulku `people` pomocí SQL dotazu:
```sql
CREATE TABLE people (
    id INT AUTO_INCREMENT PRIMARY KEY,
    jmeno VARCHAR(50),
    prijmeni VARCHAR(50),
    email VARCHAR(100),
    heslo VARCHAR(100),
    isAdmin INT
);
```

3. **Změň přihlašovací údaje k databázi:**
   - V souboru `DatabaseHelper.java` uprav řádky:
```java
String url = "jdbc:mysql://localhost:3306/users";
String username = "root";  // Změň podle svého MySQL uživatele
String password = "";       // Změň podle svého MySQL hesla
```

4. **Spusť aplikaci:**
   - Použij IDE jako IntelliJ IDEA nebo VS Code
   - Nebo spusť přímo z příkazového řádku:
```sh
javac -d bin src/main/java/com/example/*.java
java -cp bin com.example.Main
```

## 🗑️ Jak smazat záznamy z databáze?
Pokud chceš smazat všechny uživatele:
```sql
DELETE FROM people;
```

Pokud chceš smazat konkrétního uživatele podle ID:
```sql
DELETE FROM people WHERE id = 1;
```

## 📌 Poznámky
- Ujisti se, že máš nainstalovaný MySQL server
- Pokud narazíš na chybu `No suitable driver found`, stáhni **MySQL JDBC driver** a přidej ho do projektu
- Pokud chceš generovat více uživatelů, změň hodnotu `n` v `Main.java`
