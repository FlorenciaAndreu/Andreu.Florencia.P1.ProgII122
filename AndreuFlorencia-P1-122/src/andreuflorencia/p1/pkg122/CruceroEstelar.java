
package andreuflorencia.p1.pkg122;


class CruceroEstelar extends Nave implements Mantenible {
    private int pasajeros;

    public CruceroEstelar(String nombre, int tripulacion, int anio, int pasajeros) {
        super(nombre, tripulacion, anio);
        this.pasajeros = pasajeros;
        this.nombre = nombre;
    }

    @Override
    public void realizarMantenimiento() {
        System.out.println("Mantenimiento realizado al crucero estelar " + nombre + ".");
    }

    @Override
    public String toString() {
        return super.toString() + ", Pasajeros: " + pasajeros;
    }
}
