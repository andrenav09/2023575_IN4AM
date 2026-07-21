/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.germannavarro.model;

import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    // Lista temporal en memoria para probar sin MySQL
    private static List<Usuario> listaUsuarios = new ArrayList<>();

    public boolean registrar(Usuario u) {
        listaUsuarios.add(u);
        return true;
    }

    public boolean validarLogin(String username, String password) {
        for (Usuario u : listaUsuarios) {
            if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public boolean existeUsuarioOEmail(String username, String email) {
        for (Usuario u : listaUsuarios) {
            if (u.getUsername().equalsIgnoreCase(username) || u.getEmail().equalsIgnoreCase(email)) {
                return true;
            }
        }
        return false;
    }
}