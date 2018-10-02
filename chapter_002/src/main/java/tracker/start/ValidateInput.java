package tracker.start;
/**
 * Класс ValidateInput.
 * @author Oleg Bech (oleg071984@gmail.com).
 * @since 27.05.2018.
 * @version 1.0.
 */
public class ValidateInput implements Input {
	
	private final Input input;
	
	public ValidateInput(final Input input) {
		this.input = input;
	}
	
	@Override
	public String ask(String question) {
		return this.input.ask(question);
	}
	
	public int ask(String question, int[] range) {
		boolean invalid = true;
		int value = -1;
		do {
			try {
				value = this.input.ask(question, range);
				invalid = false;
			} catch (NumberFormatException nfe) {
				System.out.println("Please enter validate data again.");
			} catch (MenuOutException moe) {
				System.out.println("Please select key from menu.");
			}
		} while (invalid);
		return value;
	}
}