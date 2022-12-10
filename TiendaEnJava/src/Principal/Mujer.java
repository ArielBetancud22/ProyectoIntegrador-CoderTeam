package Principal;

public class Mujer extends Producto {

    // Constructor
    public Mujer() {
    }

    public Mujer(String prenda, double precioUnit, int cantStock,
            boolean disponible) {
        super(prenda, precioUnit, cantStock, disponible);
       
    }

    // Methods
    @Override
    public String toString() {
        return "PRENDA DE MUJER\n" + super.toString();
    }


    
}
