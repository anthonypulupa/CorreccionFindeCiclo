/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.correccion.tester;

import ec.edu.espoch.correccion.vista.Principal;



/**
 *
 * @author anthony
 */
public class TesterVista {
    
     private Principal principal;

    public TesterVista(Principal principal) {
        this.principal = principal;
    }

    public void prueba() {
        //Principal principal=new Principal();
        try {
            System.out.println("Titulo: " + principal.getTitulo());
            System.out.println("Descripcion: " + principal.getDescripcion());
            System.out.println("Estado: " + principal.getEstado());

        } catch (NumberFormatException e) {
            //vista.mostrarError("Error cambiate a ambiental");
        }

    }
}
