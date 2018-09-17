package tracker.start;
/**
 * Интерфейс Input.
 * @author Oleg Bech (oleg071984@gmail.com).
 * @since 13.05.2018.
 * @version 1.0.
 */
public interface Input {
/**
* Метод ask.
* @param question вопрос пользователю.
*/
	String ask(String question);
	
	int ask(String question, int[] range);
}