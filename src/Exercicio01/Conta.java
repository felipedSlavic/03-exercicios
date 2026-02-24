package Exercicio01;

public class Conta {
    // atributos ou propriedades ou varíaveis de instância

    String correntista;
    int numero;
    double saldo;


    // MÉTODO DEPOSITAR VALOR NA CONTA
    public void depositar(double valor) {
        saldo += valor;
    }

    // MÉTODO SACAR VALOR DA CONTA
    public void sacar(double valor) {
        saldo -= valor;
    }

}


// O SAQUE E O DEPÓSTIO PERTENCEM A CLASSE CONTA!! E NÃO NO MAIN, N FAZ SENTIDO (LEMBRA DA EXISTÊNCIA)
// static nao se usa, poois os metodos estão dentro do objeto, e o static invalida isso
// TENTE AO MAXIMO, não colocar o obj Scanner em suas classes e metódos, deixe a entrada e saida de dados no MAIN








