/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.germannavarro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexiondb {
    // Reemplaza db_kinal_login con el nombre de tu BD si usas otro
    private static final String URL = "jdbc:mysql://localhost:3306/db_kinal_login?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root"; // Tu usuario de MySQL
    private static final String PASSWORD = "admin"; // Tu contraseña de MySQL (si no tienes, déjalo "")

    public static Connection getConexion() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}