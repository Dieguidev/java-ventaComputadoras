package DieguidevPC.modelo;

public class Teclado extends DispositivoEntrada{
    public final int idTeclado;
    private static int contadorTeclado;

    //constructor
    public Teclado(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idTeclado = ++contadorTeclado;
    }

    @Override
    public String toString() {
        return "Teclado{" +
                "idTeclado=" + idTeclado +
                "} " + super.toString();
    }
}
