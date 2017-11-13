package ejerciciomicro;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edgar
 */
public class Micro {
    private int lugaresSentados;
    private int lugaresParados;
    private int pasajerosSentados = 0;
    private int pasajerosParados = 0;
    private int volumen;
    private int aux = 0;
    List<Empleado> pasajeros;
    Empleado primerPasajero = null;
    
    public Micro(int lugSentados, int lugParados, int volumen) {
        this.lugaresSentados = lugSentados;
        this.lugaresParados = lugParados;
        this.volumen = volumen;
        this.pasajeros = new ArrayList<Empleado>(lugSentados + lugParados);
    }    
    
    public boolean puedeSubir(Empleado empleado) {
        return empleado.subir(this) && this.lugaresDisponibles() > 0;
    }
    
    public void subirPasajero( Empleado empleado ) {
        if(this.puedeSubir( empleado )) {
            if(this.primerPasajero == null) {
                this.primerPasajero = empleado;
            }
            if(this.lugaresSentados > 0) {
                this.pasajerosSentados++;
            } else {
                this.pasajerosParados++;
            }            
            this.pasajeros.add(empleado);
        }
        else {
            System.out.println("El micro esta lleno");
        }
        
        this.verCantidadPasajeros();
    }
    
    public Empleado bajarPasajero() {
        if(this.lugaresDisponibles() <= 0) {
            System.err.println("El Micro está vacio");
            this.primerPasajero = null;
            return null;
        }else{
            if(this.pasajerosParados > 0) {
                this.pasajerosSentados--;
            } else {
                this.pasajerosParados--;
            }
            Empleado emp = pasajeros.get(pasajeros.size()-1);
            pasajeros.remove(emp);
            
            return emp;
        }
    }
    
    public void  verCantidadPasajeros() {
        System.out.println("La cantidad de pasajeros es >> " + this.pasajeros.size());
    }
    
    public int lugaresDisponibles(){
        return this.lugaresParados - this.pasajerosParados + this.lugaresSentados - this.pasajerosSentados;
    }
    

    public int getLugaresSentados() {
        return lugaresSentados;
    }

    public void setLugaresSentados(int lugaresSentados) {
        this.lugaresSentados = lugaresSentados;
    }

    public int getLugaresParados() {
        return lugaresParados;
    }

    public void setLugaresParados(int lugaresParados) {
        this.lugaresParados = lugaresParados;
    }

    public int getPasajerosSentados() {
        return pasajerosSentados;
    }

    public void setPasajerosSentados(int pasajerosSentados) {
        this.pasajerosSentados = pasajerosSentados;
    }

    public int getPasajerosParados() {
        return pasajerosParados;
    }

    public void setPasajerosParados(int pasajerosParados) {
        this.pasajerosParados = pasajerosParados;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public Empleado getPrimerPasajero() {
        return primerPasajero;
    }

    public void setPrimerPasajero(Empleado primerPasajero) {
        this.primerPasajero = primerPasajero;
    }
    
    
    
    
}
