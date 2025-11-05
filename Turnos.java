/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2.pkg2_ejercicio2_resuelto_carlos_martinez_2damv;

/**
 *
 * @author alumnot
 */
public class Turnos {
    private int turno = 0; 

    public synchronized void esperarTurno(int miTurno) throws InterruptedException {
        while (turno != miTurno) {
            wait();
        }
    }

    public synchronized void siguiente() {
        turno = (turno + 1) % 3;
        notifyAll();
    }     
}

