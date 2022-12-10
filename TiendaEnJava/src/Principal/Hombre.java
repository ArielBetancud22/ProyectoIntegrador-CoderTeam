package Principal;

public class Hombre extends Producto {

    // Constructor
    public Hombre() {
    }

    public Hombre(String prenda, double precioUnit, int cantStock, boolean disponible) {
        super(prenda, precioUnit, cantStock, disponible);
        
    }

    // Methods
    @Override
    public String toString() {
        return "PRENDA DE HOMBRE\n" + super.toString();
    }


    }
