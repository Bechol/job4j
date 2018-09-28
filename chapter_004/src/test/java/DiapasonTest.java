
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
/**
 * @author Oleg Bech
 * @version 1.0
 * @package PACKAGE_NAME
 * @e-mail oleg071984@gmail.com
 * @timestamp 28.09.2018, 15:55
 */
public class DiapasonTest {
    private List<Double> result;
    private Diapason diapason;
    @Before
    public void initialize() {
        result = new ArrayList<>();
        diapason = new Diapason();
    }
    /**
     * Тест whenLinearFunctionThenListSize10().
     * Проверка правильности вычислений для линейной функции вида 2х+3.
     */
    @Test
    public void whenLinearFunctionThenListOk() {
        result = diapason.calcFunction(0, 5, index -> 2 * index + 3);
        assertThat(result, is(Arrays.asList(3D, 5D, 7D, 9D, 11D)));
    }
    /**
     * Тест whenSquareFunctionThenListSize10().
     * Проверка правильности вычислений для квадратичной функции вида 2x^2 + 3x + 10.
     */
    @Test
    public void whenSquareFunctionThenListOk() {
        result = diapason.calcFunction(0, 5,
                index -> 2 * Math.pow(index, 2) + 3 * index + 10);
        assertThat(result, is(Arrays.asList(10D, 15D, 24D, 37D, 54D)));
    }
    /**
     * Тест whenLogFunctionThenListOk().
     * Проверка правильности вычислений для логарифмической функции.
     * Логарифм из x по основанию 10.
     */
    @Test
    public void whenLogFunctionThenListOk() {
        result = diapason.calcFunction(1, 5, Math::log10);
        assertThat(result, is(Arrays.asList(0.0, 0.3010299956639812, 0.47712125471966244, 0.6020599913279624)));
    }
}
