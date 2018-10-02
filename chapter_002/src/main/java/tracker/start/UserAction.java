package tracker.start;
/**
* Интерфейс UserAction.
* Описывает действия пользователя.
* @author Oleg Bech (oleg071984@gmail.com).
* @since 26.05.2018.
* @version 1.0.
*/
public interface UserAction {
	/**
	* Метод key;
	* Ключ, по которому мы будем запрашивать у пользователя действие,
	* которое он хочет выполнить.
	*/
	int key();
	/**
	* Метод execute.
	* Выполняет основные действия с заявками.
	* @param input интерфейс ввода данных от пользователя, для получения данных.
	* @param tracker базовый класс.
	*/ 
	void execute(Input input, Tracker tracker);
	/**
	* Метод info.
	* Сообщает пользователю, что в данный момен происходит.
	*/
	String info();
	
}