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
    Producto[] tareas = new Producto[tamanoVector];
    int cont = 0;

    public String agregarTarea(Producto tarea) {
        String msg = "Ingreso exitoso";
        if (tareas.length != cont) {
            for (int i = 0; i < tareas.length; i++) {
                if (tareas[i] == null) {
                    //inicializar el objeto
                    tareas[i] = new Producto();
                    tareas[i].setId(i);
                    tareas[i].setTitulo(tarea.getTitulo());
                    tareas[i].setDescripcion(tarea.getDescripcion());
                    tareas[i].setEstado(tarea.getEstado());
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

            //if (tareas[i].getEstado()) {
            auxTareas[i] = new Producto();
            auxTareas[i].setId(tareas[i].getId());
            auxTareas[i].setTitulo(tareas[i].getTitulo());
            auxTareas[i].setDescripcion(tareas[i].getDescripcion());
            auxTareas[i].setEstado(tareas[i].getEstado());
            System.out.println("Modelo-listarTarea" + auxTareas[i].getEstado());
            // }
        }
        return auxTareas;
    }
    
}
