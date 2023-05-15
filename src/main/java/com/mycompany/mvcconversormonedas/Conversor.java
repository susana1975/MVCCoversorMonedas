/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mvcconversormonedas;

import controllers.Controlador;
import javax.swing.UIManager;
import models.Modelo;
import views.Vista;

/**
 *
 * @author Susana Rosa susana.rosa@murciaeduca.es
 */
public class Conversor {

    public static void main(String arf[]) {
//        try {
//            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//        } catch (UnsupportedLookAndFeelException e) {
//        } catch (ClassNotFoundException e) {
//        } catch (InstantiationException e) {
//        } catch (IllegalAccessException e) {
//        }
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo, vista);
        controlador.iniciarVista();
    }
}
