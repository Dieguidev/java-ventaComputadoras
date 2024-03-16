package DieguidevPC.servicio;

import DieguidevPC.modelo.Computadora;

import java.util.ArrayList;
import java.util.List;

public class Orden {
    private final int idOrden;
    private final List<Computadora> computadoras;
    private static int contadorOrdenes;

    public Orden () {
        this.computadoras = new ArrayList<>();
        this.idOrden = ++Orden.contadorOrdenes;
    }

    public void agregarComputadora(Computadora computadora) {

        this.computadoras.add(computadora);
    }

    public void mostrarOrden() {
        System.out.println("Orden: " + this.idOrden);
        System.out.println("Total computadoras: " + computadoras.size());
        System.out.println("Computadoras de la orden: ");
        computadoras.forEach(System.out::println);
    }

}
