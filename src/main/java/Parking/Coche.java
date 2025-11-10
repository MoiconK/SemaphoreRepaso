package Parking;

import java.util.Random;

public class Coche implements Runnable{
    private String coche;
    Aparcamiento aparcamiento;

    //Constructor para indicar el nombre del coche
    public Coche(String coche, Aparcamiento aparcamiento){
        this.coche = coche;
        this.aparcamiento = aparcamiento;
    }

    @Override
    public void run() {
        try{
            aparcamiento.entrar(coche); // Un coche entra al aparcamiento
            Thread.sleep(1000 + new Random().nextInt(4000)); // El coche se mantiene entre 1 o 4 segundos en el aparcamiento
            aparcamiento.salir(coche); //Tras ese tiempo sale
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }

    }
}
