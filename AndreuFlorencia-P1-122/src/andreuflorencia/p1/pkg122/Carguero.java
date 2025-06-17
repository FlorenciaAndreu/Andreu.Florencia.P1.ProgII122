
package andreuflorencia.p1.pkg122;

class Carguero extends Nave implements Explorable, Mantenible {
    private static final int CAP_MIN = 100;
    private static final int CAP_MAX = 500;
    private int carga;

    public Carguero(String nombre, int tripulacion, int anio, int carga) {
        super(nombre, tripulacion, anio);
        validarCapacidad(carga);
        this.carga = carga;
        this.nombre = nombre;
    }

    private void validarCapacidad(int carga) {
        if (carga < CAP_MIN || carga > CAP_MAX) {
            throw new IllegalArgumentException("Carga fuera de rango permitido (100-500)");
        }
    }

    @Override
    public void explorar() {
        System.out.println("Carguero " + nombre + " en exploracion con carga de " + carga + " toneladas.");
    }

    @Override
    public void realizarMantenimiento() {
        System.out.println("Mantenimiento realizado al carguero " + nombre + ".");
    }

    @Override
    public String toString() {
        return super.toString() + ", Carga: " + carga + " toneladas";
    }
}

