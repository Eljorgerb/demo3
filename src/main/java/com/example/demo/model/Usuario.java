
package com.example.demo.model;

import lombok.Data;
import lombok.ToString;

@Data //getter and setter
@ToString
public class Usuario {
    
    private Integer id;
    private String nombre;
    private String username;
    private String email;
    private String direccion;
    private String telefono;
    private String tipo;
    private String passaword;

    public Usuario() {
    }

    public Usuario(Integer id, String nombre, String username, String email, String direccion, String telefono, String tipo, String passaword) {
        this.id = id;
        this.nombre = nombre;
        this.username = username;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
        this.tipo = tipo;
        this.passaword = passaword;
    }
    
    
   
   
}
