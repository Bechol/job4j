package tracker.start;
import java.util.*;
/**
 * Класс ConsoleInput.
 * Класс используется для ввода пользовательских данных из консоли.
 * @author Oleg Bech (oleg071984@gmail.com).
 * @since 14.05.2018.
 * @version 1.0.
 */
public class ConsoleInput implements Input {
	private Scanner scanner = new Scanner(System.in);
/**
* Метод ask.
* Cпрашивает у пользователя данные  и возвращает String.
* @return answers ответ системы.
*/
	public String ask(String question) {
		System.out.print(question);
		return scanner.nextLine();
	}
	
	public int ask(String question, int[] range) {
		int key = Integer.valueOf(this.ask(question));
		boolean exist = false;
		for (int value : range) {
			if (value == key) {
				exist = true;
				break;
			}
		}
		if (!exist) {
			throw new MenuOutException("Out of menu range.");	
		}
		return key;
	}
}