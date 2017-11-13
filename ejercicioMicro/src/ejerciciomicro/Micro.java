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
public class Micro {
    
    int lugaresSentados;
    int lugaresParados;
    int pasajerosSentados;
    int pasajerosParados;
    int lugaresDisponibles;
    int volumen;
    int aux = 0;
    Empleado[] pasajeros;
    Empleado primerPasajero = null;
    
    
    public Micro(int lugSentados, int lugParados, int volumen) {
        this.lugaresSentados = lugSentados;
        this.lugaresParados = lugParados;
        this.volumen = volumen;
        this.lugaresDisponibles = lugSentados + lugParados;
        this.pasajeros = new Empleado[this.lugaresDisponibles];
    }
    
    
    public boolean puedeSubir(Empleado empleado) {
        return empleado.subir(this);
    }
    
    public void subirPasajero( Empleado empleado ) {
        if(this.puedeSubir( empleado ) && this.lugaresDisponibles > 0) {
            if(this.primerPasajero == null) {
                this.primerPasajero = empleado;
            }
            if(this.lugaresSentados > 0) {
                this.pasajerosSentados++;
                this.lugaresSentados--;
                this.lugaresDisponibles--;
                this.pasajeros[aux] = empleado;
                aux++;
          
            }
            else {
                this.pasajerosParados++;
                this.lugaresParados--;
                this.lugaresDisponibles--;
                this.pasajeros[aux] = empleado;
                aux++;
            }
        }
        else {
            System.out.println("El micro esta lleno");
        }
    }
    
    public void bajarPasajero() {
        this.lugaresDisponibles++;
        if(this.lugaresDisponibles == 0) {
            System.err.println("El Micro está vacio");
            this.primerPasajero = null;
        }
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
