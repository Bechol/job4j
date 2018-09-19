package bank;
import org.junit.Test;

import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BankTest {

    private Bank bank = new Bank();
    private Client client1 = new Client("Oleg", "4009 456378");
    private Client client2 = new Client("Petr", "3478 634389");
    private Client client3 = new Client("Mikhail", "5477 947398");

    @Test
    public void whenAddClient() {
        bank.addClient(client1);
        assertThat(bank.getTreemap().containsKey(client1), is(true));
    }


    @Test
    public void whenDeleteClient() {
        bank.addClient(client1);
        bank.addClient(client2);
        bank.addClient(client3);
        bank.deleteClient(client2);
        Client[] result = new Client[bank.getTreemap().size()];
        bank.getTreemap().keySet().toArray(result);
        Client[] expect = {client3, client1};
        assertThat(result, arrayContainingInAnyOrder(expect));
    }
}
