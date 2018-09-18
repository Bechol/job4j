package tracker;
import tracker.models.*;
import org.junit.Test;
import tracker.start.Input;
import tracker.start.StartUI;
import tracker.start.StubInput;
import tracker.start.Tracker;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
/**
 * Test.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @version $Id$
 * @since 0.1
 */ 
public class StartUITest {
	private Tracker tracker;
	
	public StartUITest() {
		this.tracker = new Tracker();
	}
	
/**
* Тест создания заявки.
*/
@Test
public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
   Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});
   new StartUI(input, tracker).init();
   assertThat(tracker.getAll().get(0).getName(), is("test name"));
}

/**
* Тест удаления заявки.

@Test
public void whenUserDelItemByIdThenTrackerDontFindThisItemById() {
	Item item = tracker.add(new Item("test1", "desc1", 123L));
	Input input = new StubInput(new String[]{"3", item.getId(), "6"});
	new StartUI(input, tracker).init();
	Item[] allItems = tracker.getAll();
	assertThat(allItems.length, is(0));
}
*/

/**
* Тест поиска заявки по id.
*/
@Test
public void whenUserFindItemByIdThenTrackerFindItemWithSameName() {
	Item item = tracker.add(new Item("test1", "desc1", 123L));
	Input input = new StubInput(new String[]{"4", item.getId(), "6"});
	new StartUI(input, tracker).init();
	assertThat(tracker.findById(item.getId()).getName(), is("test1"));
}
/**
* Тест поиска заявок по имени.
*/
@Test
public void whenUserFindItemByNameThenTrackerFindItemsWithFilter() {
	String filter = "1";
	Input input = new StubInput(new String[]{
		"0", "item1", "desc",
		"0", "item2", "desc",
		"0", "item11", "desc",
		"5", filter, "6"});
	new StartUI(input, tracker).init();
	List<Item> filterItems = tracker.findByName(filter);
	//Item[] filterItems = tracker.findByName(filter);
	assertThat(filterItems.size(), is(2));
}

/**
* Тест изменения имени заявки.
*/
@Test
public void whenUserUpdateItemNameThenTrackerHasItemWithUpdatedName() {
	Item item = tracker.add(new Item("test1", "desc1", 123L));
	Input input = new StubInput(new String[]{"2", item.getId(), "updateTest", "desc1", "6"});
	new StartUI(input, tracker).init();
	assertThat(tracker.findById(item.getId()).getName(), is("updateTest"));
}

/**
* Тест изменения описания заявки.
*/
@Test
public void whenUserUpdateItemDescThenTrackerHasItemWithUpdatedDesc() {
	Item item = tracker.add(new Item("test1", "desc1", 123L));
	Input input = new StubInput(new String[]{"2", item.getId(), "test1", "updatedDesc", "6"});
	new StartUI(input, tracker).init();
	assertThat(tracker.findById(item.getId()).getDescription(), is("updatedDesc"));
}

/**
* Тест вывода списка всех заявок.
*/
@Test
public void whenUserAdd3ItemsThenTrackerShow3Items() {
	Input input = new StubInput(new String[]{
		"0", "item1", "desc",
		"0", "item2", "desc",
		"0", "item3", "desc",
		"1", "6"});
	new StartUI(input, tracker).init();
	List<Item> allItems = tracker.getAll();
	//Item[] allItems = tracker.getAll();
	assertThat(allItems.size(), is(3));
}
}