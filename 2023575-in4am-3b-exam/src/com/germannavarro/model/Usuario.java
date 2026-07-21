/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.germannavarro.model;

/**
 *
 * @author RM20
 */
public class Usuario {

    private int idUsuario;
    private String userName;
    private String email;
    private String password;
    private String nombreCompleto;

    public Usuario() {

    }

    public Usuario(int idUsuario,
                String userName,
                String email,
                String password, String nombreCompleto) {
        
        this.idUsuario = idUsuario;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.nombreCompleto = nombreCompleto;
    }
    
        public Usuario(String userName,
                String email,
                String password, String nombreCompleto) {
        
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.nombreCompleto = nombreCompleto;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    
    
}
