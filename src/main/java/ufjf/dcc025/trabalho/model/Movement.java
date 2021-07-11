package ufjf.dcc025.trabalho.model;

/*
  @autores: Ant�nio Marcos Souza Pereira - 202065245A
            Pedro Barbosa Chaves - 202065236A
            Rafaela Fernandes Horta - 202065182A
            Vin�cius de Oliveira Corbelli - 202065093A
 */

public class Movement {
    private static BankAccount bankAccount;
    private static MovType type;
    private static Double amount;

    public enum MovType {
        PIX, TRANSFER, DEPOSIT, PAYMENT, DEBIT
    }

    public static BankAccount getBankAccount() {
        return bankAccount;
    }

    public static void setBankAccount(BankAccount bankAccount) {
        Movement.bankAccount = bankAccount;
    }

    public static MovType getType() {
        return type;
    }

    public static void setType(MovType type) {
        Movement.type = type;
    }

    public static Double getAmount() {
        return amount;
    }

    public static void setAmount(Double amount) {
        Movement.amount = amount;
    }
}

