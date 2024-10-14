package org.example;

import java.util.ArrayList;

public class Data {
    public static ArrayList<Usuario> usuarios;

    static {
        usuarios = new ArrayList<>();
        usuarios.add(new Usuario("alejandro@cesur.com", "España", "DVD"));
        usuarios.add(new Usuario("antonio@cesur.com", "Inglaterra", "VHS"));
        usuarios.add(new Usuario("francisco@cesur.com", "Francia", "Digital"));
    }
}
