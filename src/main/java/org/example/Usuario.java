package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Usuario {
    private String correo;
    private String pais;
    private String plataforma;
}
