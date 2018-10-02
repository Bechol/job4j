package tracker.start;

import tracker.models.*;
import java.util.*;
import java.util.function.Predicate;

/**
 * Класс Tracker.
 * Методы для работы с заявкой:
 * @author Oleg Bech (oleg071984@gmail.com).
 * @since 13.05.2018.
 * @version 1.0.
 */
public class Tracker {

	/**
	* Список items.
	* Хранилище для заявок.
	*/
	private List<Item> items = new ArrayList<>();

	/**
	* Поле RN.
	* Используется генерации случайных чисел для генерации уникальных ключей.
	*/
	private static final Random RN = new Random();

	/**
	* Метод add(Item item).
	* Создание новой заявки.
	* @param item Заявка, которую хотим добавить.
	* @return новая заявка.
	*/
	public Item add(Item item) {
		item.setId(this.generateId());
		this.items.add(item);
		return item;
	}

	/**
	* Метод delete(String id).
	* Удаление заявки по id.
	* @param id Уникальный индетификатор заявки.
	*/
	public void delete(String id) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId().equals(id)) {
                items.remove(i);
                break;
            }
        }
	}
	
	/**
	* Метод replace(String id, Item item).
	* Редактирование заявки.
	* @param id Уникальный индетификатор заявки.
	* @param newName Новое имя заявки.
	* @param newDescription Новое описание заявки.
	*/
	public void replace(String id, String newName, String newDescription) {
		for (Item item : items) {
			if (item.getId().equals(id)) {
				item.setName(newName);
				item.setDescription(newDescription);
				items.set(this.items.indexOf(item), item);
			}
		}
	}

	/**
	* Метод findById(String id).
	* Поиск заявки по ключу id.
	* @param id Уникальный индетификатор заявки.
	* @return заявка.
	*/
	public Item findById(String id, Predicate<Item> predicate) {
		Item result = null;
		for (Item item : items) {
			if (predicate.test(item)) {
				result = item;
				break;
			}
		}
		return result;
	}

	/**
	* Метод findByName(String key).
	* Получение списка заявок по имени.
	* @param key Строка фильтра.
	* @return список заявок.
	*/
	public List<Item> findByName(String key, Predicate<Item> predicate) {
		List<Item> result = new ArrayList<>();
		for (Item item : items) {
			if (predicate.test(item)) {
				result.add(item);
			}
		}
		return result;
	}

	/**
	* Метод generateId().
	* Генерация уникального ключа.
	* @return уникальный ключ.
	*/
	private String generateId() {
		return String.valueOf(System.currentTimeMillis() + RN.nextInt());
	}

	/**
	* Метод getAll().
	* Вывод всех существующих заявок.
	* @return массив заявок.
	*/
	public List<Item> getAll() {
		return this.items;
	}
}