import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
/**
 * Test.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class DepartamentSortTest {
    String[] dept =
            {"K1\\SK1",
            "K1\\SK2",
            "K1\\SK1\\SSK1",
            "K1\\SK1\\SSK2",
            "K2",
            "K2\\SK1\\SSK1",
            "K2\\SK1\\SSK2"};
    /**
     * Тест whenAscendOrderSort().
     * Проверка сортировки по возрастанию.
     */
    @Test
    public void whenAscendOrderSort() {
        String[] expect =
                {"K1",
                "K1\\SK1",
                "K1\\SK1\\SSK1",
                "K1\\SK1\\SSK2",
                "K1\\SK2",
                "K2",
                "K2\\SK1",
                "K2\\SK1\\SSK1",
                "K2\\SK1\\SSK2"};
        String[] result = DepartamentSort.sortAscend(dept);
        assertThat(result, is(expect));
    }
    /**
     * Тест whenDescentOrderSort().
     * Проверка сортировки по убыванию.
     */
    @Test
    public void whenDescentOrderSort() {
        String[] expect =
                {"K2",
                "K2\\SK1",
                "K2\\SK1\\SSK2",
                "K2\\SK1\\SSK1",
                "K1",
                "K1\\SK2",
                "K1\\SK1",
                "K1\\SK1\\SSK2",
                "K1\\SK1\\SSK1"};
        String[] result = DepartamentSort.sortDescend(dept);
        assertThat(result, is(expect));
    }
}
