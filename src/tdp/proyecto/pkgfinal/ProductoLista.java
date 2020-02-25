/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdp.proyecto.pkgfinal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wilder
 */
public class ProductoLista {
    List<Producto> listaProductos = new ArrayList<Producto>();
    
    void agregarProducto(Producto prod) {
        listaProductos.add(prod);
    }
    
    void eliminarProducto(Producto prd) {
        listaProductos.remove(prd);
    }
    
    void mnostrarListaProductos() {
        for (Producto prd : listaProductos) {
            System.out.println(
                prd.codigo + "\t |\t" +
                prd.tipo + "\t|\t" +
                prd.nombre + "\t|\t" +
                prd.precio + "\t|\t" +
                prd.porcDesc + "\t|\t" +
                prd.cantidadStock + "\t|\t"
            );
        }
    }
}
