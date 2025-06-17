
package andreuflorencia.p1.pkg122;

public class Main {
    public static void main(String[] args) {
        Agencia agencia = new Agencia();
        
        System.out.println("\n**** Bienvenidos a nuestra Agencia Espacial ****\n");
        
        try {
            agencia.agregarNave(new NaveExploracion("Apolo", 5, 2020, TipoMision.CARTOGRAFIA));
            agencia.agregarNave(new Carguero("Galactica", 10, 2022, 300));
            agencia.agregarNave(new CruceroEstelar("Andromeda", 20, 2021, 500));
            agencia.agregarNave(new NaveExploracion("Mercurio", 4, 2022, TipoMision.INVESTIGACION));
            agencia.agregarNave(new NaveExploracion("Urano", 5, 2021, TipoMision.INVESTIGACION));
            agencia.agregarNave(new NaveExploracion("Marte", 6, 2020, TipoMision.CONTACTO));

            // Probar duplicado
            // agencia.agregarNave(new Carguero("Galactica", 10, 2022, 300));

        } catch (NaveRepetidaExcepcion e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n--- Mostrar todas las naves ---");
        agencia.mostrarNaves();

        System.out.println("\n--- Iniciar exploracion ---");
        agencia.iniciarExploracion();

        System.out.println("\n--- Realizar mantenimiento ---");
        agencia.hacerMantenimiento();
        
        System.out.println("\n--- Filtrar por mision: CARTOGRAFIA ---");
        agencia.filtrarNavesPorTipo(TipoMision.CARTOGRAFIA);
        
        System.out.println("\n--- Filtrar por mision: INVESTIGACION ---");
        agencia.filtrarNavesPorTipo(TipoMision.INVESTIGACION);
        
        System.out.println("\n--- Filtrar por mision: CONTACTO ---");
        agencia.filtrarNavesPorTipo(TipoMision.CONTACTO);
    }
}
