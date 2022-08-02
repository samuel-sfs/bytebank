package br;

public class TestaBanco {

    public static void main(String[] args) {
        Cliente paulo = new Cliente();
        paulo.nome = "Paulo Silveira";
        paulo.cpf = "12345678";
        paulo.profissao = "pedreiro";

        Conta contaDoPaulo = new Conta(123, 4567);
        contaDoPaulo.deposita(100);

        
        

    }
    
}
