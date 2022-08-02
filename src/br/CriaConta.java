
package br;

public class CriaConta {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta(123, 321);
        primeiraConta.deposita(200); 

        System.out.println(primeiraConta.pegaSaldo());

        primeiraConta.deposita(100);
        System.out.println(primeiraConta.pegaSaldo());

        Conta segundaConta = new Conta(123, 4321);
        segundaConta.deposita(50); 

        double pegaSaldo = segundaConta.pegaSaldo();
        System.out.println(pegaSaldo);

        System.out.println(Conta.getTotal());

    
        

        
    }
    
}
