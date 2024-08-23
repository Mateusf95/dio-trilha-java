import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        analisarCandidato(1900.0);
//        analisarCandidato(2200.0);
//        analisarCandidato(2000.0);
        List<String> candidatosSelecionados = selecionaCandidatos();
        imprimirOsSelecionados(candidatosSelecionados);
    }



    private static List<String> selecionaCandidatos() {
        String [] candidatos = {"FELLIPE", "MARCIA", "JULIA", "PAULO",
                "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

        int candidatoSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        int count = 0;
        List<String> candidatosSelecionados = new ArrayList<>();
        while (count < 10){
            if (candidatoSelecionados < 5 && candidatoAtual < 10){
                String candidato = candidatos[candidatoAtual];
                double salarioPretendido = valorPretendido();

                System.out.println("O candidato "+ candidato +" solicitou este valor de salário R$"+salarioPretendido);
                if (salarioBase >= salarioPretendido) {
                    System.out.println("O candidato "+ candidato+" foi selecionado para a vaga!");
                    candidatoSelecionados++;
                    candidatosSelecionados.add(candidato);
                }
                candidatoAtual++;
            }
            count++;
        }
        return candidatosSelecionados;
    }

    private static void imprimirOsSelecionados(List<String> candidatos) {
        int count = 0;
        System.out.println("Os candidatos selecionados foram: ");
        for (String candidato : candidatos) {
            count++;
            System.out.println(count + "- "+ candidato);
        }
    }

    private static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    private static  void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if (salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else {
            System.out.println("AGUARDADNO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}