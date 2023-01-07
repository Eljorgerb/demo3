
package com.example.demo.model;

import java.util.Date;
import lombok.Data;
import lombok.ToString;

@Data //getter and setter
@ToString 
public class Orden {
    private Integer id;
    private String numero;
    private Date fechaCreacion;
    private Date fechaRecibido;
    private double total;
    
    public Orden(){
        
    }

    public Orden(Integer id, String numero, Date fechaCreacion, Date fechaRecibido, double total) {
        this.id = id;
        this.numero = numero;
        this.fechaCreacion = fechaCreacion;
        this.fechaRecibido = fechaRecibido;
        this.total = total;
    }
    
    
}
