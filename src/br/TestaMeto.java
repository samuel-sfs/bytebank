package br;

public class TestaMeto {

    public static void main(String[] args) {
        Conta contaSamuel = new Conta(321, 123);
        contaSamuel.deposita(100);

        System.out.println("Saldo original Samuel " +contaSamuel.pegaSaldo());

        contaSamuel.saca(50);
        System.out.println("Saldo Samuel após saque de R$50 "+ contaSamuel.pegaSaldo());

        Conta paulo = new Conta(123,4567);
        System.out.println("Saldo Paulo original" + paulo.pegaSaldo());

        contaSamuel.transfere(50, paulo);
        System.out.println("Saldo Paulo após transferencia" + paulo.pegaSaldo());
        System.out.println("Saldo Samuel após transferencia "+ contaSamuel.pegaSaldo());



    }
    
}
