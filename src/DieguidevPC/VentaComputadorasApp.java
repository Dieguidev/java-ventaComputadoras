package DieguidevPC;

import DieguidevPC.modelo.Computadora;
import DieguidevPC.modelo.Monitor;
import DieguidevPC.modelo.Raton;
import DieguidevPC.modelo.Teclado;
import DieguidevPC.servicio.Orden;

public class VentaComputadorasApp {
    public static void main(String[] args) {

        Raton ratonLenovo = new Raton("USB", "Lenovo");
        //System.out.println(ratonLenovo);
        var TecladoLenovo = new Teclado("USB", "Lenovo");
        //System.out.println(TecladoLenovo);
        Monitor  monitorHP = new Monitor("HP", 15.5);
        //System.out.println(monitorHP);

        var computadoraLenovo = new Computadora("Compuitadora Lenovo", monitorHP, TecladoLenovo, ratonLenovo);
        //System.out.println(computadoraLenovo);

        Monitor monitorDell = new Monitor("Dell", 27);
        Teclado tecladoDell = new Teclado("Bluetooth", "Dell");
        Raton ratonDell = new Raton("Bluetooth", "Dell");
        var computadoraDell = new Computadora("Computadora Dell", monitorDell, tecladoDell, ratonDell);

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraLenovo);
        orden1.agregarComputadora(computadoraDell);
        orden1.mostrarOrden();
    }
}