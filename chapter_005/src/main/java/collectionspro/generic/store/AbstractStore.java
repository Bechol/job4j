package collectionspro.generic.store;

import collectionspro.generic.SimpleArray;

/**
 * Класс AbstractStore.
 * Реализация интерфейса Store.
 * @author Oleg Bech (oleg071984@gmail.com).
 * @since 05.11.2018.
 * @version 1.0.
 */
public abstract class AbstractStore implements Store {

    private SimpleArray<Base> storeArray;

    /**
     * Конструктор.
     * @param size размер массива.
     */
    public AbstractStore(int size) {
        this.storeArray = new SimpleArray<>(size);
    }

    /**
     * Метод add().
     * Добавление элемента массива.
     * @param model параметр типа.
     */
    @Override
    public void add(Base model) {
        storeArray.add(model);
    }

    /**
     * Метод replace().
     * Замена элемента в массиве.
     * @param id индетификатор элемента.
     * @param model новый элемент.
     * @return результат замены true/false.
     */
    @Override
    public boolean replace(String id, Base model) {
        boolean result = false;
        if (checkId(id)) {
            storeArray.set(Integer.valueOf(id), model);
            result = true;
        }
        return result;
    }

    /**
     * Метод delete().
     * Удаление элемента массива по индетификатору.
     * @param id индетификатор.
     * @return результат удаления true/false.
     */
    @Override
    public boolean delete(String id) {
        boolean result = false;
        if (checkId(id)) {
            storeArray.delete(Integer.valueOf(id));
            result = true;
        }
        return result;
    }

    /**
     * Метод findById().
     * Поиск элемента в массиве.
     * @param id индетификатор.
     * @return элемент.
     */
    @Override
    public Base findById(String id) {
        return storeArray.get(Integer.valueOf(id));
    }

    /**
     * Метод checkId().
     * Проверка существования id в SimpleList.
     * @param id индетификатор.
     * @return true/false.
     */
    private boolean checkId(String id) {
        return storeArray.get(Integer.valueOf(id)) != null;
    }

}
