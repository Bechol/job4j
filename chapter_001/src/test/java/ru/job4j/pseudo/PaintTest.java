package ru.job4j.pseudo;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @version 1.0
 * @since 23.05.2018
 */
public class PaintTest {
    /**
     * Метод whenDrawSquare().
     * Проверка вывода в консоль квадрата.
     */
    @Test
    public void whenDrawSquare() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new Paint().draw(new Square());
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append("#####")
                                .append("#   #")
                                .append("#   #")
                                .append("#   #")
                                .append("#####")
                                .append(System.lineSeparator())
                                .toString()
                )
        );
        System.setOut(stdout);
    }

    /**
     * Метод whenDrawTriangle().
     * Проверка вывода в консоль треугольника.
     */
    @Test
    public void whenDrawTriangle() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new Paint().draw(new Triangle());
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append("    *    ")
                                .append("   ***   ")
                                .append("  *****  ")
                                .append(" ******* ")
                                .append("*********")
                                .append(System.lineSeparator())
                                .toString()
                )
        );
        System.setOut(stdout);
    }
}
