package com.cursojava.curso.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ToString @EqualsAndHashCode
public class Usuario {

    @Getter @Setter
    private Long id;

    @Getter @Setter
    private String nombre;

    @Getter @Setter
    private String apellido;

    @Getter @Setter
    private String email;

    @Getter @Setter
    private String telefono;

    @Getter @Setter
    private String password;


}
