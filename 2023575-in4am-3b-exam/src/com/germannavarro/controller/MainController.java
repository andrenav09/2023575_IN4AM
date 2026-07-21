/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.germannavarro.controller;

import com.germannavarro.model.Usuario;
import com.germannavarro.model.UsuarioDAO;

import com.germannavarro.view.LoginView;
import com.germannavarro.view.RegistroView;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class MainController {
    private Stage stage;
    private UsuarioDAO usuarioDAO;

    public MainController(Stage stage) {
        this.stage = stage;
        this.usuarioDAO = new UsuarioDAO();
    }

    public void mostrarLogin() {
        LoginView loginView = new LoginView();

        // Acción del botón Ingresar
        loginView.getBtnLogin().setOnAction(e -> {
            String user = loginView.getTxtUsername().getText().trim();
            String pass = loginView.getTxtPassword().getText().trim();

            if (user.isEmpty() || pass.isEmpty()) {
                mostrarAlerta(Alert.AlertType.WARNING, "Campos Vacíos", "Por favor ingresa usuario y contraseña.");
                return;
            }

            if (usuarioDAO.validarLogin(user, pass)) {
                mostrarAlerta(Alert.AlertType.INFORMATION, "Éxito", "¡Inicio de sesión exitoso!");
            } else {
                mostrarAlerta(Alert.AlertType.ERROR, "Error", "Credenciales incorrectas o usuario no encontrado.");
            }
        });

        // Navegación al Registro
        loginView.getLinkRegistro().setOnAction(e -> mostrarRegistro());

        stage.setScene(new Scene(loginView.getView(), 360, 380));
        stage.show();
    }

    public void mostrarRegistro() {
        RegistroView regView = new RegistroView();

        // Acción del botón Registrar
        regView.getBtnRegistrar().setOnAction(e -> {
            String nombre = regView.getTxtNombre().getText().trim();
            String username = regView.getTxtUsername().getText().trim();
            String email = regView.getTxtEmail().getText().trim();
            String pass = regView.getTxtPassword().getText().trim();
            String confirmPass = regView.getTxtConfirmPassword().getText().trim();

            // Regla 1: Campos Vacíos
            if (nombre.isEmpty() || username.isEmpty() || email.isEmpty() || pass.isEmpty() || confirmPass.isEmpty()) {
                mostrarAlerta(Alert.AlertType.WARNING, "Campos Incompletos", "Todos los campos son obligatorios.");
                return;
            }

            // Regla 2: Confirmación de Contraseña
            if (!pass.equals(confirmPass)) {
                mostrarAlerta(Alert.AlertType.WARNING, "Contraseña no coincide", "Las contraseñas no son iguales.");
                return;
            }

            // Regla 3: Unicidad (Comprobar en BD)
            if (usuarioDAO.existeUsuarioOEmail(username, email)) {
                mostrarAlerta(Alert.AlertType.ERROR, "Usuario Duplicado", "El usuario o correo ya se encuentra registrado.");
                return;
            }

            // Guardar si todo está correcto
            Usuario nuevoUsuario = new Usuario(nombre, username, email, pass);
            if (usuarioDAO.registrar(nuevoUsuario)) {
                mostrarAlerta(Alert.AlertType.INFORMATION, "Éxito", "¡Usuario registrado exitosamente!");
                mostrarLogin(); // Redirige al login tras registro exitoso
            } else {
                mostrarAlerta(Alert.AlertType.ERROR, "Error BD", "Ocurrió un error al guardar los datos.");
            }
        });

        // Navegación de regreso al Login
        regView.getLinkLogin().setOnAction(e -> mostrarLogin());

        stage.setScene(new Scene(regView.getView(), 360, 480));
        stage.show();
    }

    private void mostrarAlerta(Alert.AlertType tipo, String titulo, String mensaje) {
        Alert alert = new Alert(tipo);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
