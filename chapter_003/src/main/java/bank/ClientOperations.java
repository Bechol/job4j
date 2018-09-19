package bank;

/**
 * Интерфейс ClientOperations.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @since 19.09.2018
 * @version 1.0
 */
public interface ClientOperations {
    /**
     * Метод addClient(Client client).
     * Добавление клиента.
     * @param client клиент.
     */
    void addClient(Client client);

    /**
     * Метод deleteClient(Client client).
     * Удаление клиента.
     * @param client клиент.
     */
    void deleteClient(Client client);

    /**
     * Метод transferMoney.
     * @param senderPassport паспорт отправителя.
     * @param senderRequisite реквизиты счета отправителя.
     * @param payeePassport паспорт получателя.
     * @param payeeRequisite реквизиты счета получателя.
     * @param transferSumm сумма.
     * @return результат true/false.
     */
    public boolean transferMoney (String senderPassport, String senderRequisite,
                                  String payeePassport, String payeeRequisite,
                                  double transferSumm);

    /**
     * Метод getClientAccount(String passport, String requisite).
     * Поиск счета клиента по паспорту и реквизитам.
     * @param passport паспорт.
     * @param requisite реквизиты.
     * @return счет.
     */
    public Account getClientAccount(String passport, String requisite);
}
