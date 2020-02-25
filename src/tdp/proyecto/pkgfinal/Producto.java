/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdp.proyecto.pkgfinal;

/**
 *
 * clase Producto con los atributos necesarios que permita guardar en un 
 * objeto la información de un producto considerando los datos de la siguiente 
 * tabla:
 * 
 *   ____________________________________
 *  | Tipo    |  Precio S/.  |  Desc. %  |
 *  |---------|--------------|-----------|
 *  |   A     |       27.49  |       25  |
 *  |   B     |       16.43  |       20  |
 *  |   C     |       12.28  |       15  |
 *  |_________|______________|___________|
 * 
 * @author wilder
 */
public class Producto {
    int codigo;
    char tipo;
    String nombre;
    double precio;
    double porcDesc;
    double cantidadStock;

    public Producto(int codigo, char tipo, String nombre, double precio, double porcDesc, double cantidadStock) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.nombre = nombre;
        this.precio = precio;
        this.porcDesc = porcDesc;
        this.cantidadStock = cantidadStock;
    }    
}
