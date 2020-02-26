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
    
    int cantidadProductos () {
        return listaProductos.size();
    }
    
    Producto buscarProductoXCodigo(int codigo) {
        Producto prodEncontrado = null;
        for (Producto prd : listaProductos) {
            if(prd.codigo == codigo)
                prodEncontrado = prd;
        }
        
        return prodEncontrado;
    }
    
    void mostrarListaProductos() {
        
        System.out.println("----------------------------------");
        for (Producto prd : listaProductos) {
            prd.mostrarProducto();
            System.out.println("----------------------------------");
        }
    }
}
