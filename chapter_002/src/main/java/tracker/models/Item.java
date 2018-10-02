package tracker.models;
/**
 * Класс Item.
 * Базовый класс. Описывает заявку.
 * Содержит стандартные методы для работы.
 * @author Oleg Bech (oleg071984@gmail.com).
 * @since 13.05.2018.
 * @version 1.0.
 */
public class Item {
	private String id;
	public String name;
	public String description;
	public long create;
/**
 * Дефолтный конструктор класса.
 */
	public Item() {
	}
/**
 * Конструктор класса.
 */
	public Item(String name, String description, long create) {
		this.name = name;
		this.description = description;
		this.create = create;
	}
	public String getName() {
		return this.name;	
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getCreate() {
		return this.create;
	}
	public void setCreate(long create) {
		this.create = create;
	}
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
}