package tienda;

// Clase componente base que define la estructura del café
public abstract class Cafe {
    // Variable heredable que describe el café actual
    String descripcion = "Bebida desconocida";

    // Retorna la descripción del café
    public String getDescripcion() {
        return descripcion;
    }

    // Método abstracto que cada subclase concreta debe calcular
    public abstract double costo();
}