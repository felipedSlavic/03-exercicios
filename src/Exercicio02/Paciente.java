package Exercicio02;

public class Paciente {
    String nome;
    int idade;


    public int  freqMax(){
       return 220 - idade;
       // Outro jeito :
        // freMax = 220 - idade;
    }

    //CRiação do método pra Intrvalo
    public double[] frequenciaAlvo (){
        double[] alvo = new double[2];
        int fm =freqMax();
        alvo[0]=fm * 0.5;
        alvo[1]=fm * 0.85;

        return alvo;
    }



}

//    public void freqAlvo (){
//       double freqAlvo;
//       boolean intervalo = false;
//
//       if(freqAlvo >  * 0.5 && freqAlvo <  * 0.85){
//           intervalo = true;
//       }
//    }
//



// Chamar o método demrora muito, não faça isso no ponto de vista de desempenho





