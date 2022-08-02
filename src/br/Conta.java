package br;

public class Conta {
 
       private double saldo;
       private int agencia;
       private int numero;
       private Cliente titular;
       private static int total;


        public Conta (int agencia, int numero){
            Conta.total++;
            System.out.println("o total de contas é: "+ total);
            this.agencia = agencia;
            this.numero = numero;
        }


       public void deposita (double valor){
        this.saldo += valor;
        }

      public boolean saca (double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
       } else {
        return false;
       }
    }

    public boolean transfere (double valor, Conta destino){
        this.saca(valor);
        destino.deposita(valor);
        return true;
    }

    public double pegaSaldo(){
        return this.saldo;
    }

    public static int getTotal(){
        return Conta.total;
    }


    }

    
