/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienterest;

import entidades.Alumno;


/**
 *
 * @author lv1822
 */
public class ClienteREST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        clienteMiServicio cliente = new clienteMiServicio();
        //Alumno alumno = new Alumno(0, "Rafael", "ISW", 5);
        //cliente.postJson(alumno);
        cliente.getJson(Alumno.class, "0");
        
    }
    
}
