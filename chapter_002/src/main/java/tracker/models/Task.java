package tracker.models;
/**
* Класс Task.
* Дочерний от суперкласса Item().
* @author Oleg Bech (oleg071984@gmail.com).
* @since 13.05.2018.
* @version 1.0.
*/
public class Task extends Item {
	/**
	* Конструктор класса.
	*/
	public Task(String name, String desc) {
		this.name = name;
		this.description = desc;
	}
}