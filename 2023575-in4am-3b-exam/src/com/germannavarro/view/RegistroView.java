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

public class RegistroView {
    private VBox root;
    private TextField txtNombre;
    private TextField txtUsername;
    private TextField txtEmail;
    private PasswordField txtPassword;
    private PasswordField txtConfirmPassword;
    private Button btnRegistrar;
    private Hyperlink linkLogin;

    public RegistroView() {
        root = new VBox(12);
        root.setPadding(new Insets(25));
        root.setAlignment(Pos.CENTER);

        Label lblTitulo = new Label("Formulario de Registro");
        lblTitulo.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");

        // Requerimientos mínimos de campos
        txtNombre = new TextField(); 
        txtNombre.setPromptText("Nombre Completo");

        txtUsername = new TextField(); 
        txtUsername.setPromptText("Nombre de Usuario");

        txtEmail = new TextField(); 
        txtEmail.setPromptText("Correo Electrónico");

        txtPassword = new PasswordField(); 
        txtPassword.setPromptText("Contraseña");

        txtConfirmPassword = new PasswordField(); 
        txtConfirmPassword.setPromptText("Confirmar Contraseña");

        btnRegistrar = new Button("Registrar");
        btnRegistrar.setMaxWidth(Double.MAX_VALUE);

        // Requerimiento: Enlace para volver al Login
        linkLogin = new Hyperlink("¿Ya tienes cuenta? Inicia sesión aquí");

        root.getChildren().addAll(
            lblTitulo, txtNombre, txtUsername, txtEmail, 
            txtPassword, txtConfirmPassword, btnRegistrar, linkLogin
        );
    }

    // Getters para que el controlador lea los datos
    public Parent getView() { return root; }
    public TextField getTxtNombre() { return txtNombre; }
    public TextField getTxtUsername() { return txtUsername; }
    public TextField getTxtEmail() { return txtEmail; }
    public PasswordField getTxtPassword() { return txtPassword; }
    public PasswordField getTxtConfirmPassword() { return txtConfirmPassword; }
    public Button getBtnRegistrar() { return btnRegistrar; }
    public Hyperlink getLinkLogin() { return linkLogin; }
}