package app_juego;


import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaResultado extends JFrame {

    JPanel panelResultado = new JPanel();
    JLabel labelResultado = new JLabel("Texto");
    JButton botonResultado = new JButton("Chequear");

    public VentanaResultado() {
        super("Ventana Resultado");
        setSize(200, 200);
        setLocation(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        agregarComponentes();
        dispose();
        setVisible(true);
    }

    public void agregarComponentes() {
        getContentPane().add(panelResultado);
        panelResultado.setLayout(new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints();
        g.gridx = 0;
        g.gridy = 0;
        g.insets = new Insets(10, 10, 10, 10);

        panelResultado.add(labelResultado, g);
        g.gridy = 1;

        panelResultado.add(botonResultado, g);
        botonResultado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (botonResultado.getText() == "Terminar") {
                    System.exit(0);
                } else {
                    dispose();
                }
            }
        });

    }
}
