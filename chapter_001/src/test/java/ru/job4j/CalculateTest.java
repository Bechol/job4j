package ru.job4j;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Oleg Bech (oleg071984@gmail.com)
* @version $Id$
* @since 0.1
*/
public class CalculateTest {
/**
* Test echo.
*/ @Test
public void whenTakeNameThenTreeEchoPlusName() {
	//Задаем главныый параметр
    String input = "Oleg Bech";
	//Ожидаемый результат работы класса Calculate
    String expect = "Echo, echo, echo : Oleg Bech"; 
	//Создание нового объекта.
    Calculate calc = new Calculate();
	//Выполнение метода echo с параметром input и запись ее в переменную result.
    String result = calc.echo(input);
	//Сравнение значений result и expect
    assertThat(result, is(expect));
}
 
}