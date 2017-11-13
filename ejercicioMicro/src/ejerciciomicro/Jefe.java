/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomicro;

/**
 *
 * @author edgar
 */
public class Jefe extends Empleado{

    @Override
    public boolean subir(Micro micro) {
       return Math.random()  <   0.5;
    }
    
}
