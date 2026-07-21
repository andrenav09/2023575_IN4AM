/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.germannavarro.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class LoginView {
    private VBox root;
    private TextField txtUsername;
    private PasswordField txtPassword;
    private Button btnLogin;
    private Hyperlink linkRegistro;

    public LoginView() {
        root = new VBox(12);
        root.setPadding(new Insets(25));
        root.setAlignment(Pos.CENTER);

        Label lblTitulo = new Label("Iniciar Sesión");
        lblTitulo.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");

        txtUsername = new TextField(); 
        txtUsername.setPromptText("Usuario");

        txtPassword = new PasswordField(); 
        txtPassword.setPromptText("Contraseña");

        btnLogin = new Button("Ingresar");
        btnLogin.setMaxWidth(Double.MAX_VALUE);

        // Requerimiento: Etiqueta/Enlace para ir al registro
        linkRegistro = new Hyperlink("¿No tienes cuenta? Regístrate aquí");

        root.getChildren().addAll(lblTitulo, txtUsername, txtPassword, btnLogin, linkRegistro);
    }

    // Getters para que el controlador pueda acceder a los componentes
    public Parent getView() { return root; }
    public TextField getTxtUsername() { return txtUsername; }
    public PasswordField getTxtPassword() { return txtPassword; }
    public Button getBtnLogin() { return btnLogin; }
    public Hyperlink getLinkRegistro() { return linkRegistro; }
