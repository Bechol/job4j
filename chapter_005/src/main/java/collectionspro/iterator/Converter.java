package collectionspro.iterator;

import java.util.*;
/**
 * Класс Converter.
 * Итератор итераторов.
 * @author Oleg Bech (oleg071984@gmail.com).
 * @since 27.10.2018.
 * @version 1.0.
 */
public class Converter {
    Iterator<Integer> convert(Iterator<Iterator<Integer>> it) {
        return new Iterator<Integer>() {

            private Iterator<Integer> iterator;

            private void check() {
                if (iterator == null && it.hasNext()) {
                    iterator = it.next();
                }
            }

            @Override
            public boolean hasNext() {
                check();
                if (iterator == null) {
                    return false;
                }
                if (iterator.hasNext()) {
                    return true;
                }
                if (it.hasNext()) {
                    iterator = it.next();
                }
                return iterator.hasNext();
            }

            @Override
            public Integer next() {
                check();
                if (iterator == null) {
                    throw new NoSuchElementException();
                }
                if (!iterator.hasNext() && it.hasNext()) {
                    iterator = it.next();
                }
                return iterator.next();
            }
        };
    }
}
