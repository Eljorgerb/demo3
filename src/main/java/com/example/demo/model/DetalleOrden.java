
package com.example.demo.model;

import lombok.Data;
import lombok.ToString;


@Data
@ToString
public class DetalleOrden {
    private int id ;
    private String nombre;
    private double Cantidad;
    private double precio;
    private double total;
    
    public DetalleOrden(){
        
    }

    public DetalleOrden(int id, String nombre, double Cantidad, double precio, double total) {
        this.id = id;
        this.nombre = nombre;
        this.Cantidad = Cantidad;
        this.precio = precio;
        this.total = total;
    }
    
   
}
