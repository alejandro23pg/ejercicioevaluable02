package org.example;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class Principal extends JFrame {
    private JTable tableUsuarios;
    private JPanel jPanelMain;
    private JButton buttonConfirmar;
    private JButton buttonVolver;
    private JTextField textFieldCorreo;
    private JComboBox comboBoxPais;
    private JComboBox comboBoxPlataforma;
    private DefaultTableModel tableModel = new DefaultTableModel();

    public Principal() {
        String[] cabecera = {"Correo","País","Plataforma"};
        tableModel = new DefaultTableModel(cabecera,0);
        tableUsuarios.setModel(tableModel);

        for(Usuario u : Data.usuarios){
            Object[] row = { u.getCorreo(), u.getPais(), u.getPlataforma() };
            tableModel.addRow(row);
        }

        setContentPane(jPanelMain);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Gestor de películas");
        pack();
        setLocationRelativeTo(null);

        tableUsuarios.setModel(tableModel);


    }
}
