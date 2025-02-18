/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.correccion.modelo;

/**
 *
 * @author anthony
 */
public class Producto {
    
    private int id;
    private String nombre;
    private String precio;
    private boolean disponible;

    public Producto(int id, String titulo, String descripcion, boolean estado) {
        this.id = id;
        this.nombre = titulo;
        this.precio = descripcion;
        this.disponible = estado;
    }

    public Producto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return nombre;
    }

    public void setTitulo(String titulo) {
        this.nombre = titulo;
    }

    public String getDescripcion() {
        return precio;
    }

    public void setDescripcion(String descripcion) {
        this.precio = descripcion;
    }

    public boolean getEstado() {
        return disponible;
    }

    public void setEstado(boolean estado) {
        this.disponible = estado;
    }

}
