package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseHelper {
    public static void ulozDoDatabaze(Person person) {
        String url = "jdbc:mysql://localhost:3306/users";
        String username = "root";
        String password = "";

        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            String sql = "INSERT INTO people (jmeno, prijmeni, email, heslo, isAdmin) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, person.getJmeno());
                stmt.setString(2, person.getPrijmeni());
                stmt.setString(3, person.getEmail());
                stmt.setString(4, person.getHeslo());
                stmt.setInt(5, person.isAdmin());
                stmt.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}