package collectionspro.generic.store;

/**
 * Класс Base.
 * @author Oleg Bech (oleg071984@gmail.com).
 * @since 05.11.2018.
 * @version 1.0.
 */
public abstract class Base {
    private final String id;

    protected Base(final String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
