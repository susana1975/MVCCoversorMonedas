/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author Susana Rosa susana.rosa@murciaeduca.es
 */
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Vista extends JFrame {

    public JButton pesetas, dolares;
    private JPanel panelB, panelR;
    public JLabel lResultado;
    public JTextField campoTexto;

    public Vista() {
        getContentPane().setLayout(new BorderLayout());

        panelB = new JPanel();
        panelB.setLayout(new FlowLayout());

        panelR = new JPanel();
        panelR.setLayout(new FlowLayout());

        pesetas = new JButton("Convertir a Pesetas");
        dolares = new JButton("Convertir a Dólares");

        lResultado = new JLabel("Resultado:");
        campoTexto = new JTextField(20);

        panelB.add(pesetas);
        panelB.add(dolares);

        panelR.add(lResultado);

        add(campoTexto, BorderLayout.NORTH);
        add(panelB, BorderLayout.SOUTH);
        add(panelR, BorderLayout.CENTER);
    }
}
