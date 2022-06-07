import java.util.Arrays;

public class EjercicioRecu {

    // TODO Completa todas las funciones que aparecen en este fichero.
    //  Realiza todos los test que prueben esas funciones
    public GestorDePersonas gestorDePersonas;

    public EjercicioRecu() {
        gestorDePersonas = ObtenerPersonasRequest.Companion.get();
    }

    public Persona[] quitarNulos(Persona[] pers, int i) {
        return Arrays.copyOf(pers, i);
    }


    /**
     * Devuelve todas las personas que viven en España : location - city.
     *
     * @return Devuelve todas las personas que viven en España : location - city.
     */
    public Persona[] personasQueVivenEnSpain() {
        // TODO 1p
        return gestorDePersonas.getPersonas();
    }

    /**
     * @param personas array de personas sobre el que debes buscar
     * @return Devuelve todas las personas que viven en España : location - city.
     */
    public Persona[] personasQueVivenEnSpain(Persona[] personas) {
        // TODO 1p
        return gestorDePersonas.getPersonas();
    }

    /**
     * @return Devuelve a la persona más vieja de todas (age)
     */
    public Persona personaMasVieja() {
        // TODO 1p
        Persona[] pers = new Persona[gestorDePersonas.getPersonas().length];
        long edad = 0, aux = 0;
        int j=0, i=0;
        for (Persona x : gestorDePersonas.getPersonas()) {
            edad = x.getDob().getAge();
            i++;
            if (edad > aux) {
                j = i;
                aux = edad;
            }
        }
        return gestorDePersonas.getPersonas()[j-1];
    }



    /**
     *
     * @return personas array de personas sobre el que debes buscar
     * @throws NoHayViejosException si todas las personas tienen menos de 18 años
     * @throws PersonaNulaException si alguna de las personas fuera null
     */
    public Persona edadDelMasViejo(Persona[] personas) throws NoHayViejosException, PersonaNulaException {
        // TODO 1p
        return gestorDePersonas.getPersonas()[0];
    }

    /**
     *
     * @return Devuelve todas las personas que viven en unas coordenadas comprendidas entre:
     * latitud -4 y 0
     * longitug 50 y 60
     */
    public Persona[] personasQueVivenEnCoordenadaFijas() {
        // TODO 1p
        return gestorDePersonas.getPersonas();
    }

    /**
     *
     * @param personas array de personas sobre el que debes buscar
     * @param latitudMaxima coordenada sobre la que buscar
     * @param latitudMinima coordenada sobre la que buscar
     * @param longitudMaxima coordenada sobre la que buscar
     * @param longitudMinima coordenada sobre la que buscar
     * @return Devuelve todas las personas que viven en unas coordenadas comprendidas entre:
     * latitudMaxima y latitudMinima
     * longitudMaxima y longitudMinima
     * @throws PersonaNulaException si alguna de las personas fuera null
     * @throws CoordenadaIncompatibleException si alguna de las coordenadas tuviera un mínimo superior al máximo
     */
    public Persona[] personasQueVivenEnCoordenadaFijas(Persona[] personas, float latitudMaxima, float latitudMinima, float longitudMaxima, float longitudMinima) throws PersonaNulaException, CoordenadaIncompatibleException{
        // TODO 2p
        return gestorDePersonas.getPersonas();
    }
}
