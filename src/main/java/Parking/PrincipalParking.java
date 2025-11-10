package Parking;

public class PrincipalParking {
    static void main(String[] args) {
        Aparcamiento aparcamiento = new Aparcamiento(3); //Iniciamos un aparcamiento con 3 plazas disponibles al mismo tiempo
        for (int i = 0; i <= 7; i++){ //Entrarán 7 coches al aparcamiento
            Thread coche = new Thread(new Coche("Parking.Coche-"+i, aparcamiento));
            coche.start();
        }
    }
}
