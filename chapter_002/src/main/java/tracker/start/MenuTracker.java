package tracker.start;

import tracker.models.*;
import java.util.*;
import java.util.List;

/**
* Внешний класс EditItem.
* Редактиров0ание заявки по id.
*/
class EditItem extends BaseAction {
		
	EditItem(int key, String name) {
		super(key, name);
	}
		
	@Override
	public void execute(Input input, Tracker tracker) {
		System.out.println("--------------<ITEM EDIT>--------------");
		String id = input.ask("Please, enter the task's id:");
		Item item = tracker.findById(id);
		if (item != null) {
			System.out.println("-------------- Tracker has found item --------------");
			System.out.println(
					String.format("%s. %s, %s", item.getId(), item.getName(), item.getDescription())
				);
			System.out.println("---------------- Etering new data -------------------");
			String newName = input.ask("Please, enter the task's new name: ");
			String newDesc = input.ask("Please, enter the task's new desc: ");
			tracker.replace(id, newName, newDesc);
			System.out.println("--------------<END OF EDITING>--------------");
		} else {
			System.out.println("The task with the specified id ISN'T FOUND!");
		}
	}
}

/** 
* Внешний класс FindItemById.
* Поиск заявки по id.
*/
class FindItemById extends BaseAction {
	
	FindItemById(int key, String name) {
		super(key, name);
	}
	
	@Override
	public void execute(Input input, Tracker tracker) {
		System.out.println("------------<FIND ITEM BY ID>--------------");
		String id = input.ask("Please, enter the task's id:");
		Item item = tracker.findById(id);
		if (item != null) {
			System.out.println("-------------- Tracker has found item --------------");
			System.out.println(
					String.format("%s. %s, %s", item.getId(), item.getName(), item.getDescription())
				);
			System.out.println("---------------------- * * * -----------------------");
		} else {
			System.out.println("The task with the specified id ISN'T FOUND!");
		}
	}
}

/** 
* Внешний класс FindItemByName.
* Поиск заявки по имени.
*/
class FindItemByName extends BaseAction {
	
	FindItemByName(int key, String name) {
		super(key, name);
	}
	
	@Override
	public void execute(Input input, Tracker tracker) {
		System.out.println("------------<FILTERING ITEMS BY NAME>--------------");
		String name = input.ask("Please, enter the task's name:");
		List<Item> allItems = tracker.findByName(name);
		if (allItems.size() != 0) {
			for (Item item : allItems) {
				if (item != null) {
					System.out.println(
							String.format("%s. %s, %s", item.getId(), item.getName(), item.getDescription())
					);
				}
			}
		} else {
			System.out.println("The tasks with the specified name ISN'T FOUND!");
		}
		/*
		Item[] allItems = tracker.findByName(name);
		if (allItems.length != 0) {
			for (Item item: allItems) {
				if (item != null) {
					System.out.println(
						String.format("%s. %s, %s", item.getId(), item.getName(), item.getDescription())
					);
				}
			}
		} else {
			System.out.println("The tasks with the specified name ISN'T FOUND!");
			System.out.println("");
		}
		*/
	}
}

/**
* Класс MenuTracker.
* Отвечает за меню.
* @author Oleg Bech (oleg071984@gmail.com).
* @since 26.05.2018.
* @version 1.0.
*/
class MenuTracker {
	/**Система ввода.*/
	private Input input;
	/**Базовый класс.*/
	private Tracker tracker;
	/**Количество действий пользователя.*/
	private UserAction[] actions = new UserAction[8];
	/**Управление выходом из программы*/
	private boolean exit = false;
	private int position = 0;
	
	/**
	* Конструктор.
	* @param input интерфейс пользователя.
	* @param tracker Tracker.
	*/
	MenuTracker(Input input, Tracker tracker) {
		this.input = input;
		this.tracker = tracker;
	}
	
	/**
	* Метод fillActions.
	* Инициализирует события.
	*/
	void fillActions() {
		this.actions[position++] = new AddItem(0, "Add new item.");
		this.actions[position++] = new ShowItems(1, "Show all items");
		this.actions[position++] = new EditItem(2, "Edit item.");
		this.actions[position++] = new DeleteItem(3, "Delete item.");
		this.actions[position++] = new FindItemById(4, "Find item by id.");
		this.actions[position++] = new FindItemByName(5, "Filter items by name");
		this.actions[position++] = new MenuExit(6, "Exit Tracker.");
	}
	
	/**
	* Метод getRanges.
	* Создание массива с индексами actions.
	* @return result массив с индексами actions.
	*/
	int[] getRanges() {
		int i;
		int[] result = new int[this.actions.length];
		for (i = 0; i < actions.length; i++) {
			if (this.actions[i] != null) {
				result[i] = i + 1;
			} else {
				break;
			}
		}
		result = Arrays.copyOf(result, i + 1);  
		return result;
	}
	
	/**
	* Метод addAction.
	* Добавление действий пользователя.
	* @param action действие пользователя.
	*/
	void addAction(UserAction action) {
		this.actions[position++] = action;
	}
	
	/**
	* Метод select.
	* Выполняет действие, которое выбрал пользователь.
	* @param key ключ выбранного пункта меню.
	*/
	void select(int key) {
		this.actions[key].execute(this.input, this.tracker);
	}
	
	/**
	* Метод getExit.
	* @return exit значение переменной exit.
	*/
	boolean getExit() {
		return exit;
	}
	
	/**
	* Метод show.
	* Показывает меню.
	*/
	void show() {
		for (UserAction action: this.actions) {
			if (action != null) {
				System.out.println(action.info());
			}
		}
	}
	
	/**
	* Внутреннии нестатический класс MenuExit.
	* Выход из программы.
	*/
	class MenuExit extends BaseAction {
		
		MenuExit(int key, String name) {
			super(key, name);
		}
		
		@Override
		public void execute(Input input, Tracker tracker) {
			System.out.println("--------------<EXIT TRACKER>--------------");
			exit = true;
		}
	}
	
	/**
	* Внутреннии нестатический класс AddItem.
	* Создание новой заявки.
	*/
	class AddItem extends BaseAction {
		
		AddItem(int key, String name) {
			super(key, name);
		}
		
		@Override
		public void execute(Input input, Tracker tracker) {
			String name = input.ask("Please, enter the task's name: ");
			String desc = input.ask("Please, enter the task's desc: ");
			tracker.add(new Task(name, desc));
		}
	}
	
	/**
	* Внутреннии статический класс ShowItems.
	* Выводит список всех заявок.
	*/
	class ShowItems extends BaseAction {
		
		ShowItems(int key, String name) {
			super(key, name);
		}
		
		@Override
		public void execute(Input input, Tracker tracker) {
			//Item[] allItems = tracker.getAll();
			List<Item> allItems = tracker.getAll();
			//if (allItems.length != 0) {
			if (allItems.size() != 0) {
				System.out.println("--------------<ITEMS LIST>--------------");
				for (Item item : allItems) {
					if (item != null) {
					System.out.println(
						String.format("%s. %s, %s", item.getId(), item.getName(), item.getDescription())
					);
					} else {
						System.out.println("null");
					}
				}
				System.out.println("--------------<END OF LIST>--------------");
			} else {
				System.out.println("There are no items in the Tracker!");
			}
		}
	}
	
	/**
	* Внутреннии нестатический класс DeleteItem.
	* Удаление заявки.
	*/
	class DeleteItem extends BaseAction {
		
		DeleteItem(int key, String name) {
			super(key, name);
		}
	
		@Override
		public void execute(Input input, Tracker tracker) {
			System.out.println("--------------<DELETE ITEM>--------------");
			String id = input.ask("Please, enter the task's id:");
			Item item = tracker.findById(id);
			if (item != null) {
				System.out.println("-------------- Tracker has found item --------------");
				System.out.println("id: " + item.getId());
				System.out.println("name: " + item.getName());
				System.out.println("description: " + item.getDescription());
				tracker.delete(id);
				System.out.println("-------------- Item has been deleted ---------------");
			} else {
				System.out.println("The task with the specified id ISN'T FOUND!");
			}
		}
	}
}