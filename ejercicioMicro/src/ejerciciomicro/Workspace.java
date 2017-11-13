package ejerciciomicro;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edgar
 */
public class Workspace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Micro micro = new Micro(10,6,130);
        Empleado[] listaDeEmpleados = new Empleado[20];
        Empleado[] tipoDeEmpleados = new Empleado[6];
        tipoDeEmpleados[0] = new Apurado();
        tipoDeEmpleados[1] = new Claustrofobico();
        tipoDeEmpleados[2] = new Fiaca();
        tipoDeEmpleados[3] = new Moderado();
        tipoDeEmpleados[4] = new Jefe();
        tipoDeEmpleados[5] = new Obsecuente();
        
        for (int i = 0; i < listaDeEmpleados.length; i++) {
            listaDeEmpleados[i] = tipoDeEmpleados[(int)(Math.random() * tipoDeEmpleados.length)];
        }
        
        micro.subirPasajero(listaDeEmpleados[0]);
        
        System.err.println(micro.primerPasajero);
        
       
        
    }
    
}
