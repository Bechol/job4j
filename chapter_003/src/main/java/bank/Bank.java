package bank;

import java.util.*;

/**
 * Класс Bank.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @since 19.09.2018
 * @version 1.0
 */
public class Bank implements ClientOperations, AccountOperations {

    private TreeMap<Client, List<Account>> treemap = new TreeMap<Client, List<Account>>();

    @Override
    public String toString() {
        return "Bank{" + "treemap=" + treemap + '}';
    }

    public TreeMap<Client, List<Account>> getTreemap() {
        return this.treemap;
    }

    /**
     * Метод addClient(Client client).
     * Добавление клиента.
     * @param client клиент.
     */
    @Override
    public void addClient(Client client) {
        this.treemap.putIfAbsent(client, new ArrayList<Account>());
    }

    /**
     * Метод deleteClient(Client client).
     * Удаление клиента.
     * @param client клиент.
     */
    @Override
    public void deleteClient(Client client) {
        this.treemap.remove(client);
    }

    /**
     * Метод transferMoney.
     * Перечисление денег с одного счёта на другой счёт.
     * @param senderPassport  паспорт отправителя.
     * @param senderRequisite реквизиты счета отправителя.
     * @param payeePassport   паспорт получателя.
     * @param payeeRequisite  реквизиты счета получателя.
     * @param transferSumm    сумма.
     * @return результат true/false.
     */
    @Override
    public boolean transferMoney(String senderPassport, String senderRequisite,
                                 String payeePassport, String payeeRequisite,
                                 double transferSumm) {
        boolean result = false;
        Account senderAccount = this.getClientAccount(senderPassport, senderRequisite);
        Account payeeAccount = this.getClientAccount(payeePassport, payeeRequisite);
        if (senderAccount != null & payeeAccount != null && senderAccount.getValue() >= transferSumm) {
           senderAccount.setValue(senderAccount.getValue() - transferSumm);
            payeeAccount.setValue(payeeAccount.getValue() + transferSumm);
            result = true;
        }
        return result;
    }

    /**
     * Метод getClientAccount(String passport, String requisite).
     * Поиск счета клиента по паспорту и реквизитам.
     * @param passport  паспорт.
     * @param requisite реквизиты.
     * @return счет.
     */
    @Override
    public Account getClientAccount(String passport, String requisite) {
        Account result = null;
        if (passport != null) {
            for (Account account : this.getClientAccounts(passport)) {
                if (account.getRequisites().equals(requisite)) {
                    result = account;
                    break;
                }
            }
        }
        return result;
    }

    /**
     * Метод addAccountToUser(Client client, Account account)
     * Создание нового счета для клиента.
     * @param passport паспорт.
     * @param account счет.
     */
    @Override
    public void addAccountToClient(String passport, Account account) {
        for (Map.Entry<Client, List<Account>> client : treemap.entrySet()) {
            if (client.getKey().equals(passport)) {
                client.getValue().add(account);
                break;
            }
        }
    }

    /**
     * Метод deleteAccountFromClient(Client client, Account account) {
     * Удаление счета клиента.
     * @param passport паспорт.
     * @param account счет.
     */
    @Override
    public void deleteAccountFromClient(String passport, Account account) {
        for (Map.Entry<Client, List<Account>> client : treemap.entrySet()) {
            if (client.getKey().equals(passport) & account != null) {
                client.getValue().remove(account);
                break;
            }
        }
    }

    /**
     * Метод getClientAccounts(String passport).
     * Вывод списка счетов клиента.
     * @param passport паспорт клиента.
     * @return список счетов клиента.
     */
    @Override
    public List<Account> getClientAccounts(String passport) {
        List<Account> result = null;
        for (Map.Entry<Client, List<Account>> client : treemap.entrySet()) {
            if (client.getKey().equals(passport)) {
                result = client.getValue();
                break;
            }
        }
        return result;
    }
}
