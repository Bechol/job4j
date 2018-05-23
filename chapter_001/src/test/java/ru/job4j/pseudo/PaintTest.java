package ru.job4j.pseudo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @version 1.0
 * @since 23.05.2018
 */
public class PaintTest {
    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    /**
     * Метод loadOutput().
     * Выполняется до запуска теста.
     */
    @Before
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }
    /**
     * Метод backOutput().
     * Выполняется после запуска теста.
     */
    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("execute after method");
    }

    /**
     * Метод whenDrawSquare().
     * Проверка вывода в консоль квадрата.
     */
    @Test
    public void whenDrawSquare() {
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
    }

    /**
     * Метод whenDrawTriangle().
     * Проверка вывода в консоль треугольника.
     */
    @Test
    public void whenDrawTriangle() {
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
    }
}
