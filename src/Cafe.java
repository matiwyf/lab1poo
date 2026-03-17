public class Cafe {
    private String nombre;
    private String tamano;
    private double precio;

    public Cafe (String nombre, String tamano, double precio) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.precio = precio;
    }
    public Cafe() {}

    public String getNombre() {
        return nombre;
    }
    public String setNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
    public double setPrecio() {
        return precio;
    }
    public String getTamano() {
        return tamano;
    }
    public String setTamano() {
        return tamano;
    }
    public void MostrarTicket () {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Tamano: " + this.tamano);
        System.out.println("Precio: " + this.precio);
    }
}
