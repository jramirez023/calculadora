import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculadora {

    Calculadora calculadora;
    @BeforeEach
    public void setUp(){
        calculadora = new Calculadora();
    }
    @Test
    public void restoTest(){
        int a = 10, b= 2;
        int resultado = calculadora.resto(a,b);
        int esperado = 0;
        assertEquals(resultado,esperado);

        b=0;
        esperado = - 1;
        resultado = calculadora.resto(a,b);
        assertEquals(resultado,esperado);

    }
}
