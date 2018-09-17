package tracker.start;
/**
 * Класс BaseAction.
 * @author Oleg Bech (oleg071984@gmail.com).
 * @since 14.05.2018.
 * @version 1.0.
 */
public abstract class BaseAction implements UserAction {
	private final int key;
	private final String name;
	
	protected BaseAction(final int key, final String name) {
        this.key = key;
        this.name = name;
    }

    @Override
    public int key() {
        return this.key;
    }

    @Override
    public String info() {
        return String.format("%s : %s", this.key, this.name);
    }
}