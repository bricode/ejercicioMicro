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
public class Obsecuente extends Empleado{
    
    Empleado jefe;
    public Obsecuente( Empleado jefe) {
        this.jefe = jefe;
    }
    public Obsecuente() {
    }
    
    @Override
    public boolean subir(Micro micro) {
        return jefe.subir(micro);
    }
    
}
