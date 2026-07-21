/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.germannavarro.system;

import com.germannavarro.controller.MainController;
import javafx.application.Application;
import javafx.stage.Stage;

public class In4am3bExam extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Proyecto Integrador - Kinal");
        
        // Inicializar el controlador y mostrar el Login
        MainController controller = new MainController(primaryStage);
        controller.mostrarLogin();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
