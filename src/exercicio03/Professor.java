package exercicio03;

public class Professor {
    String nome;
    int totalAulas;
    double valorHoraAula;

    public double calcularSalario() {
        double salarioBase;
        double horaAtividade;
        double descansoSemanal;


        salarioBase = totalAulas * valorHoraAula * 4.5;
        horaAtividade = salarioBase * 0.05;
        descansoSemanal = (salarioBase + horaAtividade) / 6;


        return salarioBase + horaAtividade + descansoSemanal;

    }

}
