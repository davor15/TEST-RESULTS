import java.util.List;
import java.util.ArrayList;

public class CalculatorTest {

    @Test
    public void testCalculateMethod() {
        // Testiranje jednostavnog izračuna
        Assertions.assertEquals("5.0", Calculator.Run("2+3"));

        // Testiranje prioriteta operacija
        Assertions.assertEquals("14.5", Calculator.Run("2+3*4-5/2"));

        // Testiranje obrade neispravnih izraza
        Assertions.assertEquals("ERROR", Calculator.Run("2+3+"));
        Assertions.assertEquals("ERROR", Calculator.Run("2/0"));
    }


}