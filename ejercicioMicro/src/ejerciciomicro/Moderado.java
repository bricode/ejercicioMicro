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
public class Moderado extends Empleado{
    
    int lugaresLibres;

    public Moderado() {
        this.lugaresLibres = (int)(Math.random() * 5);
    }
   
    
    @Override
    public boolean subir(Micro micro) {
        
        return (micro.getLugaresSentados() > this.lugaresLibres) 
                || (micro.getLugaresParados() > this.lugaresLibres);
    }
    
}
