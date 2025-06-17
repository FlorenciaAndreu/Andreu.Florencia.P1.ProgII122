
package andreuflorencia.p1.pkg122;


import java.util.Objects;

abstract class Nave {
    protected String nombre;
    protected int tripulacion;
    protected int anio;

    public Nave(String nombre, int tripulacion, int anio) {
        this.nombre = nombre;
        this.tripulacion = tripulacion;
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTripulacion() {
        return tripulacion;
    }

    public int getAnio() {
        return anio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nave nave = (Nave) o;
        return anio == nave.anio && Objects.equals(nombre, nave.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, anio);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Tripulacion: " + tripulacion + ", Anio: " + anio;
    }
}
