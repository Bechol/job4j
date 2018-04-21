package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.assertThat;
/**
 * Test.
 *
 * @author Oleg Bech (oleg071984@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class ArrayDuplicateTest {
    /**
     * Test удаление дубликатов массива.
     */
        @Test
        public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
            String[] inputArr = {"Олег", "Вася", "Дима", "Дима", "Вика", "Олег"};
            String[] checkArr = {"Олег", "Вася", "Дима", "Вика"};
            ArrayDuplicate ad = new ArrayDuplicate();
            String[] resultArr = ad.remove(inputArr);
            assertThat(resultArr, arrayContainingInAnyOrder(checkArr));
        }

}
