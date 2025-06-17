
package andreuflorencia.p1.pkg122;

import java.util.*;

class Agencia {
    private List<Nave> naves;

    public Agencia() {
        naves = new ArrayList<>();
    }

    public void agregarNave(Nave nave) throws NaveRepetidaExcepcion {
        if (naves.contains(nave)) {
            throw new NaveRepetidaExcepcion("Ya existe una nave con ese nombre y anio de lanzamiento.");
        }
        naves.add(nave);
    }

    public void mostrarNaves() {
        for (Nave n : naves) {
            System.out.println(n);
        }
    }

    public void iniciarExploracion() {
        for (Nave n : naves) {
            if (n instanceof Explorable) {
                ((Explorable) n).explorar();
            } else {
                System.out.println("La nave " + n.getNombre() + " no puede explorar, solo transporta pasajeros");
            }
        }
    }

    public void hacerMantenimiento() {
        for (Nave n : naves) {
            if (n instanceof Mantenible) {
                ((Mantenible) n).realizarMantenimiento();
            }
        }
    }

    public List<Nave> filtrarNavesPorTipo(TipoMision tipo) {
        List<Nave> filtradas = new ArrayList<>();
        for (Nave n : naves) {
            if (n instanceof NaveExploracion ne && ne.tipo == tipo) {
                filtradas.add(ne);
                System.out.println(ne);
            }
        }
        return filtradas;
    }
}

