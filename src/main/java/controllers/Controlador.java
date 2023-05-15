/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

/**
 *
 * @author Susana Rosa susana.rosa@murciaeduca.es
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import models.Modelo;
import views.Vista;

public class Controlador implements ActionListener {

    private Modelo modelo;
    private Vista vista;
    private Double cantidad;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;

        this.vista.pesetas.addActionListener(this);
        this.vista.dolares.addActionListener(this);
    }

    public void iniciarVista() {
        vista.setTitle("Conversor");
        vista.pack();
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }

    public void actionPerformed(ActionEvent evento) {
        if (vista.pesetas == evento.getSource()) {
            if (!"".equals(vista.campoTexto.getText())) {
                try {
                    cantidad = Double.parseDouble(vista.campoTexto.getText());
                    modelo.setCantidad(cantidad);
                    modelo.setMoneda(166.3860);
                    modelo.convetirDolarAPesetas();
                    vista.lResultado.setText(modelo.getResultado().toString());
                } catch (NumberFormatException e) {
                    vista.lResultado.setText("Introduzca una cantidad valida...");
                }
            }
        } else if (vista.dolares == evento.getSource()) {
            if (!"".equals(vista.campoTexto.getText())) {
                try {
                    cantidad = Double.parseDouble(vista.campoTexto.getText());
                    modelo.setCantidad(cantidad);
                    modelo.setMoneda(1.085);
                    modelo.convertirPesoADolar();
                    vista.lResultado.setText(modelo.getResultado().toString());
                } catch (NumberFormatException e) {
                    vista.lResultado.setText("Introduzca una cantidad valida...");
                }
            }
        }
    }
}
