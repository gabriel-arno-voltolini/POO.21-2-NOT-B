
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste InteiroPositivoTest.
 *
 * @author  (seu nome)
 * @version (um número de versão ou data)
 */
public class InteiroPositivoTest
{
    @Test
    public void test01_Fatorial_10(){
        InteiroPositivo ip = new InteiroPositivo();
        ip.setValor(10);

        assertEquals(3628800,ip.fatorial());
    }

    @Test
    public void test02_Fatorial_20()
    {
        InteiroPositivo inteiroP1 = new InteiroPositivo();
        inteiroP1.setValor(20);
        assertEquals(2432902008176640000L, inteiroP1.fatorial());
    }

    @Test
    public void test03_Divisores_14(){
        InteiroPositivo ip = new InteiroPositivo();
        ip.setValor(14);

        assertEquals("Os divisores são 1, 2, 7, 14 e a quantidade de divisores é 4", ip.divisoresInteiros());
    }

    @Test
    public void test04_Divisores_18(){
        InteiroPositivo ip = new InteiroPositivo();
        ip.setValor(18);

        assertEquals("Os divisores são 1, 2, 3, 6, 9, 18 e a quantidade de divisores é 6", ip.divisoresInteiros());
    }

    @Test
    public void test05_Fibonacci_9() {
        InteiroPositivo ip = new InteiroPositivo();
        ip.setValor(9);

        int[] esperado = {1, 1, 2, 3, 5, 8, 13, 21, 34};
        int[] resultado = ip.fibonacci();
        
        assertArrayEquals(esperado, resultado);
    }

    @Test
    public void test06_Fibonacci_15() {
        InteiroPositivo ip = new InteiroPositivo();
        ip.setValor(15);

        int[] esperado = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};

        assertArrayEquals(esperado, ip.fibonacci());
    }
}

