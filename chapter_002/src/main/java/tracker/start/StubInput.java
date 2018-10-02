package tracker.start;
/**
 * Класс StubInput.
 * Реализует интерфейс Input.
 * @author Oleg Bech (oleg071984@gmail.com).
 * @since 13.05.2018.
 * @version 1.0.
 */
public class StubInput implements Input {
	private String[] answers;
	private int position = 0;
/**
*Конструктор класса.
*/
	public StubInput(String[] answers) {
		this.answers = answers;
	}
/**
* Метод ask.
* Cпрашивает у пользователя данные  и возвращает String.
* @return answers ответ системы.
*/
	public String ask(String question) {
		return answers[position++];
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