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
public class Empresa {
    
    private Micro[] listaMicros;
    private Empleado[] listaEmpleados;
    
    
    public Empresa(int cantMicros, int cantEmpleados) {
        this.listaMicros = new Micro[cantMicros];
        this.listaEmpleados = new Empleado[cantEmpleados];
    }
    
    public void cargarListaEmpleados(Empleado lista[]) {
        for (int i = 0; i < this.listaEmpleados.length; i++) {
            this.listaEmpleados[i] = lista[(int)(Math.random() * lista.length)];
        }
    } 

    public Micro[] getListaMicros() {
        return listaMicros;
    }

    public void setListaMicros(Micro[] listaMicros) {
        this.listaMicros = listaMicros;
    }

    public Empleado[] getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(Empleado[] listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

   
    
   
    
    
  
   
    
    
    
}
