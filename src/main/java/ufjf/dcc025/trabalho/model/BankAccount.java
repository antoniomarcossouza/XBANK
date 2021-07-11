package ufjf.dcc025.trabalho.model;

import java.util.Random;

/*
  @autores: Ant�nio Marcos Souza Pereira - 202065245A
            Pedro Barbosa Chaves - 202065236A
            Rafaela Fernandes Horta - 202065182A
            Vin�cius de Oliveira Corbelli - 202065093A
 */

public class BankAccount {

    private static Client client;
    private static String branch;
    private static String account;
    private static Double statement;

    public BankAccount(Client client, Double statement) {

        Random rand = new Random();
        String branch = null;
        String account = null;
        for (int i = 0; i < 6; i++) {
            branch += Integer.toString(rand.nextInt(10) + 0);
            account += Integer.toString(rand.nextInt(10) + 0);
        }

        BankAccount.client = client;
        BankAccount.branch = branch;
        BankAccount.account = account;
        BankAccount.statement = statement;
    }

    public static Client getClient() {
        return client;
    }

    public static String getBranch() {
        return branch;
    }

    public static String getAccount() {
        return account;
    }

    public static Double getStatement() {
        return statement;
    }

    public static void addStatement(Double n) {
        statement += n;
    }

    public static void removeStatement(Double n) {
        statement -= n;
    }
}
