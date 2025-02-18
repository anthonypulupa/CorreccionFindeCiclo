/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.correccion.modelo;

/**
 *
 * @author anthony
 */
public class GestorProducto {
    
    int tamanoVector = 5;
    Producto[] producto = new Producto[tamanoVector];
    int cont = 0;

    public String agregarTarea(Producto tarea) {
        String msg = "Ingreso exitoso";
        if (producto.length != cont) {
            for (int i = 0; i < producto.length; i++) {
                if (producto[i] == null) {
                    producto[i] = new Producto();
                    producto[i].setId(i);
                    producto[i].setTitulo(tarea.getTitulo());
                    producto[i].setDescripcion(tarea.getDescripcion());
                    producto[i].setEstado(tarea.getEstado());
                    cont++;
                     
                    return msg;
                }
            }
        } else {
                msg = "Ingreso no permitido, el vector esta lleno";
        }
        return msg;
    }

    public Producto[] listarTareas() {

        Producto[] auxTareas = new Producto[tamanoVector];
        for (int i = 0; i < cont; i++) {
            auxTareas[i] = new Producto();
            auxTareas[i].setId(producto[i].getId());
            auxTareas[i].setTitulo(producto[i].getTitulo());
            auxTareas[i].setDescripcion(producto[i].getDescripcion());
            auxTareas[i].setEstado(producto[i].getEstado());
            System.out.println("Modelo-listarTarea" + auxTareas[i].getEstado());
        }
        return auxTareas;
    }
    
}
