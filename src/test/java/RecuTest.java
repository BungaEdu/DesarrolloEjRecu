import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RecuTest {


    Examen examen = new Examen();
    EjercicioRecu recu = new EjercicioRecu();
    // TIP:
    // Para obtener la lista de personas:
    //      examen.personas.getResults()
    // Para obtener una persona:
    //      examen.personas.getResults()[0]

    // TODO: (3 puntos) Piensa en que test son necesarios para probar la función "esIrlandes" y realizalos.
    //  Si la persona es null deberá devolver la excepción PersonaNulaException
    //  Si la "nat" no es "IE" pero vive en "Ireland", deberá devolver ErrorEnNacionalidadException
    //  Si la "nat" es "IE" pero no vive en "Ireland", deberá devolver ErrorEnNacionalidadException
    //  Asegurate que el 100% de pasar el test sobre el 100% de las personas disponibles.
    //  esIrlandes deberá devolver "true" si es irlandés. En caso contrario, "false"

    /*@Test
    public void testEsIrlandes_XXX() {
        // TODO 3p
    }*/

    @Test
    public void testEsIrlandes_persNull() {
        Assertions.assertThrows(PersonaNulaException.class, () -> PersonasFun.Companion.esIrlandes(null));
        // TODO 3p
    }

    @Test
    public void testEsIrlandes_Nacionalidad1() {
        Persona p = examen.gestorDePersonas.getPersonas()[1];
        p.setNat("Prueba");
        p.getLocation().setCountry("Ireland");
        Assertions.assertThrows(ErrorEnNacionalidadException.class, () -> PersonasFun.Companion.esIrlandes(p));
    }

    @Test
    public void testEsIrlandes_Nacionalidad2() {
        Persona p = examen.gestorDePersonas.getPersonas()[2];
        p.setNat("IE");
        p.getLocation().setCountry("Norway");
        Assertions.assertThrows(ErrorEnNacionalidadException.class, () -> PersonasFun.Companion.esIrlandes(p));
    }

    @Test
    public void testEsIrlandes_Nacionalidad3() {
        Persona p = examen.gestorDePersonas.getPersonas()[3];
        p.getLocation().setCountry("Ireland");
        Assertions.assertTrue(PersonasFun.Companion.esIrlandes(p));
    }


    @Test
    public void masViejo () {
        Persona esperado = examen.gestorDePersonas.getPersonas()[4];
        Persona actual = recu.personaMasVieja();
        Assertions.assertEquals(esperado,actual);
    }

}
