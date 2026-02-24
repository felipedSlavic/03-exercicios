package Exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Paciente paciente = new Paciente();
        Scanner sc = new Scanner(System.in);
        double [] alvo;


        System.out.print("NOME DO PACIENTE: ");
        paciente.nome = sc.next();

        System.out.print("IDADE DO PACIENTE: ");
        paciente.idade = sc.nextInt();

        System.out.println("FREQUÊNCIA MÁXIMA DO PACIENTE: " +  paciente.freqMax());

        System.out.println("INTERVALO DE FREQUÊNCIA");
         alvo = paciente.frequenciaAlvo();
        System.out.println("Início da Frequência Alvo : " + alvo[0]);
        System.out.println("Fim da Frequência Alvo : " + alvo[1]);





    }
}
