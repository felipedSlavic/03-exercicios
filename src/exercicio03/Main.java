package exercicio03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.totalAulas = 40;
        professor.valorHoraAula = 220;

        System.out.println(professor.calcularSalario());



    }
}
