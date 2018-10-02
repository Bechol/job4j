package tracker.start;
/**
 * Класс StartUI.
 * Точка входа в программу.
 * Обеспечивает полноценную работу всего приложения (трекера).
 * @author Oleg Bech (oleg071984@gmail.com).
 * @since 13.05.2018.
 * @version 1.0.
 */
public class StartUI {
/**Получение данных от пользователя*/
	private final Input input;
/**Хранилище заявок*/
	private final Tracker tracker;
	
/**
* Конструтор инициализирующий поля.
* @param input ввод данных.
* @param tracker хранилище заявок.
 */
	public StartUI(Input input, Tracker tracker) {
		this.input = input;
		this.tracker = tracker;
	}
	
/**
* Метод init.
* Основой цикл программы. Вывод меню пользователя.
*/
	public void init() {
		boolean exit = false;
		MenuTracker menu = new MenuTracker(this.input, tracker);
		menu.fillActions();
		UserAction deleteAction = new UserAction() {
			public int key() {
				return 7;
			}
			public void execute(Input input, Tracker tracker) {
				//todo
			}
			public String info() {
				return "7. New action";
			}
		};
		menu.addAction(deleteAction);
		do {
			//menu.show((result)-> System.out.println(result));
			menu.show(System.out::println);
			menu.select(input.ask("select:", menu.getRanges()));
		} while (!menu.getExit());
	}
	
/**
* Метод showMenu.
* Вывод пользовательского меню в консоли.
*/	
	private void showMenu() {
        System.out.println("<TRACKER PROJECT>");
		System.out.println("Menu");
		System.out.println("0.Add item");
		System.out.println("1.Show all items");
		System.out.println("2.Edit item name and desc");
		System.out.println("3.Delete item");
		System.out.println("4.Find item by id");
		System.out.println("5.Find item by name");
		System.out.println("6.Exit tracker");
    }
	
	public static void main(String[] args) {
		new StartUI(
				new ValidateInput(
						new ConsoleInput()
						), new Tracker()
						).init();
	}
}
