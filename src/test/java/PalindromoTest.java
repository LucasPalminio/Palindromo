import static org.junit.Assert.*;
import org.junit.*;
public class PalindromoTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void esPalindromo() {
        String cadena1 = "cbabc";
        boolean esperado1 = true;
        boolean actual1 = Palindromo.esPalindromo(cadena1);
        assertEquals(Palindromo.esPalindromo(cadena1),esperado1);
        String cadena2 = "ébabe";
        boolean esparado2 = false;
        boolean actual2 = Palindromo.esPalindromo(cadena2);
        assertEquals(actual2,esparado2);

    }
}