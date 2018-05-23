package ru.job4j.pseudo;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class TriangleTest {
    /**
     * Метод whenDrawTriangle().
     * Тестирование отрисовки треугольника.
     */
    @Test
    public void whenDrawTriangle() {
        Triangle triangle = new Triangle();
        assertThat(
                triangle.draw(),
                is(
                        new StringBuilder()
                                .append("    *    ")
                                .append("   ***   ")
                                .append("  *****  ")
                                .append(" ******* ")
                                .append("*********")
                                .toString()
                )
        );
    }
}
