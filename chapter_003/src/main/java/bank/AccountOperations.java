package bank;

import java.util.List;

/**
 * Интерфейс ClientOperations.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @since 19.09.2018
 * @version 1.0
 */
public interface AccountOperations {
    /**
     * Метод addAccountToUser(Client client, Account account)
     * Создание нового счета для клиента.
     * @param client клиент.
     * @param account счет.
     */
    void addAccountToClient(String passport, Account account);

    /**
     * Метод deleteAccountFromClient(Client client, Account account) {
     * Удаление счета клиента.
     * @param client клиент.
     * @param account счет.
     */
    void deleteAccountFromClient(String passport, Account account);

    /**
     * Метод getClientAccounts(String passport).
     * Вывод списка счетов клиента.
     * @param passport паспорт клиента.
     * @return список счетов клиента.
     */
    List<Account> getClientAccounts(String passport);
}
