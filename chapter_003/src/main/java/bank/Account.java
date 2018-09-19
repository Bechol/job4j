package bank;

/**
 * Класс Account.
 * @author Oleg Bech (oleg071984@gmail.com)
 * @since 19.09.2018
 * @version 1.0
 */
class Account {
    private double value;

    /**
     * Геттер getRequisites().
     * Возвращает реквизиты счета.
     * @return реквизиты счета.
     */
    public String getRequisites() {
        return requisites;
    }

    private String requisites;

    /**
     * Конструктор класса.
     * @param value клоичество денег.
     * @param requisites реквизиты счета.
     */
    public Account(double value, String requisites) {
        this.value = value;
        this.requisites = requisites;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setRequisites(String requisites) {
        this.requisites = requisites;
    }
}
