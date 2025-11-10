package Parking;

import java.util.concurrent.Semaphore;


public class Aparcamiento{
    int capacidad;
    Semaphore semaforo;
    int contador;

    /**
     * @param capacidad
     */
    public Aparcamiento(int capacidad) { //Constructor para establecer la capacidad del aparcamiento y el semaforo
        this.capacidad = capacidad;
        this.semaforo = new Semaphore(capacidad);
    }

    /**
     * @param coche
     */
    public void entrar(String coche){ //Metodo sincronizado para que los coches entren
        try {
            semaforo.acquire(); //El coche entra al semaforo

            if (semaforo.availablePermits() == 0) { //Si no hay plazas disponibles los coches esperan
                System.out.println(coche + " en espera...");
            }

            synchronized (this){ //El coche entra y aumenta el contador
                contador++;
                System.out.println(coche+" Entra-Plazas ocupadas: "+contador);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @param coche
     */
    public void salir(String coche){ //Metodo sincronizado para que los coches salgan
        synchronized (this){ //Se reduce el contador antes de llamar a la salida del hilo del semaforo para evitar errores
            contador--;
            System.out.println(coche+" Saliendo...-Plazas ocupadas: "+contador);
        }
        semaforo.release(); //El coche sale del semaforo
    }
}
