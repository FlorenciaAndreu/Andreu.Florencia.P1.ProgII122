
package andreuflorencia.p1.pkg122;


class NaveExploracion extends Nave implements Explorable {
    TipoMision tipo;

    public NaveExploracion(String nombre, int tripulacion, int anio, TipoMision tipo) {
        super(nombre, tripulacion, anio);
        this.tipo = tipo;
        this.nombre = nombre;
    }

    @Override
    public void explorar() {
        System.out.println("Nave de exploracion " + nombre + " iniciando mision: " + tipo);
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo de mision: " + tipo;
    }
}

