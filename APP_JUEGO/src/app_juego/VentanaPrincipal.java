package app_juego;


import com.sun.org.apache.bcel.internal.generic.SWITCH;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaPrincipal extends JFrame {

    JPanel panel = new JPanel();
    JLabel label = new JLabel("¿En que numero de la semana estamos?");
    JTextField texto = new JTextField(10);
    JButton boton = new JButton("Chequear");
    VentanaResultado q;
    JComboBox cb;

    public VentanaPrincipal() {
        super("VentanaPrincipal");

        setLocation(300, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        agregarComponentes();
        pack();
    }

    public void agregarComponentes() {
        getContentPane().add(panel);
        panel.setLayout(new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints();
        g.gridx = 0;
        g.gridy = 0;
        g.insets = new Insets(10, 10, 10, 10);
        panel.add(label, g);
        g.gridy = 1;
        panel.add(texto, g);
//Vector sirve para agregar elementos
        Vector v = new Vector(4);
        v.addElement("Numero de la semana");
        v.addElement("dia de año");
        v.addElement("dia del mes");
        v.addElement("Dia de la semana en el mes");
        cb = new JComboBox(v);
        g.gridx = 1;
        panel.add(cb, g);
        g.gridy = 2;
        g.gridx = 0;
        panel.add(boton, g);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                VentanaResultado vr = new VentanaResultado();
                if (!texto.getText().isEmpty()) {
                    chequear();
                } else {
                    JOptionPane.showMessageDialog(null, "Inserte texto para empezar a jugar");
                }
            }
        });
    }

    public void chequear() {
        switch (cb.getSelectedIndex()) {
            case 0:
                try {
                    int text = Integer.parseInt(texto.getText());
                    Calendar c = Calendar.getInstance();
                    int ca = c.get(Calendar.WEEK_OF_YEAR);
                    if (text == ca) {
                        q = new VentanaResultado();
                        q.labelResultado.setText("Correcto");
                        q.labelResultado.setForeground(Color.green);
                        q.botonResultado.setText("Terminar");
                    } else {
                        q = new VentanaResultado();
                        q.labelResultado.setText("Incorrecto");
                        q.labelResultado.setForeground(Color.red);
                        q.botonResultado.setText("Trata de nuevo");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Por favor ingrese numeros enteros para jugar");
                }
                break;
            case 1:
                try {
                    int text = Integer.parseInt(texto.getText());
                    Calendar calendar1 = Calendar.getInstance();
                    int re = calendar1.get(Calendar.DAY_OF_YEAR);
                    if (text == re) {
                        q = new VentanaResultado();
                        q.labelResultado.setText("correcto");
                        q.labelResultado.setForeground(Color.blue);
                        q.botonResultado.setText("Terminar");
                    } else {
                        q = new VentanaResultado();
                        q.labelResultado.setText("Incorrecto");
                        q.labelResultado.setForeground(Color.red);
                        q.botonResultado.setText("Trata de nuevo");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Janaste el juego , felicidades");
                }
                break;
            case 2:
                try {
                    int text = Integer.parseInt(texto.getText());
                    Calendar calendar1 = Calendar.getInstance();
                    int res = calendar1.get(Calendar.DAY_OF_MONTH);
                    if (text == res) {
                        q = new VentanaResultado();
                        q.labelResultado.setText("correcto");
                        q.labelResultado.setForeground(Color.blue);
                        q.botonResultado.setText("Terminar");
                    } else {
                        q = new VentanaResultado();
                        q.labelResultado.setText("Incorrecto");
                        q.labelResultado.setForeground(Color.red);
                        q.botonResultado.setText("Trata de nuevo");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Ok bien hecho , felicidades");
                }
                break;
            case 3:
                try {
                    int text = Integer.parseInt(texto.getText());
                    Calendar calendar1 = Calendar.getInstance();
                    int resul = calendar1.get(Calendar.DAY_OF_WEEK_IN_MONTH);
                    if (text == resul) {
                        q = new VentanaResultado();
                        q.labelResultado.setText("correcto");
                        q.labelResultado.setForeground(Color.blue);
                        q.botonResultado.setText("Terminar");
                    } else {
                        q = new VentanaResultado();
                        q.labelResultado.setText("Incorrecto");
                        q.labelResultado.setForeground(Color.red);
                        q.botonResultado.setText("Trata de nuevo");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Sigue adelante , felicidades");
                }
        }

    }
}
