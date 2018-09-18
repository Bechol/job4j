package tracker.start;

import tracker.models.*;

import java.util.*;
/**
 * Класс Tracker.
 * Методы для работы с заявкой:
 * @author Oleg Bech (oleg071984@gmail.com).
 * @since 13.05.2018.
 * @version 1.0.
 */
public class Tracker {
	/**
	* Поле items.
	* Реализация хранилища для заявок.
	*/
	//private Item[] items = new Item[100];
	private List<Item> items = new ArrayList<Item>();
	/**
	* Поле position.
	* Используется для присвоения заявкам уникальных ключей id.
	*/
	private int position = 0;
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
		/*
		item.setId(this.generateId());
		this.items[position++] = item;
		return item;
		*/
	}
	/**
	* Метод delete(String id).
	* Удаление заявки по id.
	* Первый цикл for находит заявку по id и присваивает ей null.
	* Второй цикл for делает сдвиг элементов массива и уменьшает его размер на 1.
	* @param id Уникальный индетификатор заявки.
	*/
	public void delete(String id) {
		for (Item item : items) {
			if (item.getId().equals(id)) {
				items.remove(item);
				break;
			}
		}
		/*
		for (int index = 0; index < this.position; index++) {
			if (id != null && this.items[index].getId().equals(id)) {
				System.arraycopy(this.items, index + 1, this.items, index, this.position - 1 - index);
				this.position--;
			break;
			}
		}
		*/
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
		/*
		if (id != null) {
			for (int i = 0; i < items.length; i++) {
				if (this.items[i] != null && this.items[i].getId().equals(id)) {
					this.items[i].setName(newName);
					this.items[i].setDescription(newDescription);
					break;
				}
			}
		}
		*/
	}
	/**
	* Метод findById(String id).
	* Поиск заявки по ключу id.
	* @param id Уникальный индетификатор заявки.
	* @return заявка.
	*/
	public Item findById(String id) {
		Item result = null;
		for (Item item : items) {
			//if (item != null && item.getId().equals(id)) {
			if (item.getId().equals(id)) {
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
	/*
	public Item[] findByName(String key) {
		Item[] result = new Item[this.position];
		int count = 0;
		if (key != null) {
			for (int i = 0; i < this.position; i++) {
				String name = this.items[i].getName();
				if (name.contains(key)) {
					result[count] = this.items[i];
					count++;
				}
			}
			if (count != 0) {
                result = Arrays.copyOf(result, count);
            } 
		}
		return result;
	}
	*/

	public List<Item> findByName(String key) {
		List<Item> result = new ArrayList<>();
		for (Item item : items) {
			if (item.getName().contains(key)) {
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
	String generateId() {
		return String.valueOf(System.currentTimeMillis() + RN.nextInt());
	}
	/**
	* Метод getAll().
	* Вывод всех существующих заявок.
	* @return массив заявок.
	*/
	/*
	public Item[] getAll() {
		Item[] result = new Item[this.position];
		for (int index = 0; index != this.position; index++) {
			result[index] = this.items[index];
		}
		return result;
	}
	*/
	public List<Item> getAll() {
		List<Item> result = new ArrayList<>(items);
		return result;
	}
}