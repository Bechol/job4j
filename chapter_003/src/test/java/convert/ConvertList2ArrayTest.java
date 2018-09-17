package convert;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Oleg Bech (oleg071984@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class ConvertList2ArrayTest {
    @Test
    public void when7ElementsThen9() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7),
                3
        );
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 0, 0}
        };
        assertThat(result, is(expect));
    }

    @Test
    public void whenConvertArraysToList() {
        ConvertList2Array list = new ConvertList2Array();
        List<Integer> result = list.convert(
                Arrays.asList(new int[] {1, 2}, new int[] {3, 4, 5, 6})
        );
        List<Integer> expect = Arrays.asList(1, 2, 3, 4, 5, 6);
        assertThat(result, is(expect));
    }

    @Test
    public void when3ArraysInListToList() {
        ConvertList2Array list = new ConvertList2Array();
        List<Integer> result = list.convert(
                Arrays.asList(new int[] {1, 2},
                        new int[] {3, 4, 5, 6},
                        new int[] {0, 0})
        );
        List<Integer> expect = Arrays.asList(1, 2, 3, 4, 5, 6, 0, 0);
        assertThat(result, is(expect));
    }
}
