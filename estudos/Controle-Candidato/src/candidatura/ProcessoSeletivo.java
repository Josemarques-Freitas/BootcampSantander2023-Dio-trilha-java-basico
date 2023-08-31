package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        
        
        //(Primeira case analisando candidatos)com essas condiçoes abaixo 👇!  Sem o import, sem o metodo entrandoEmContato, sem o metodo atender, sem o metodo imprimirSelecionados, sem o metodo selecaoCandidatos e sem o metodo valorPretendido
                                                        //  **analisarCandidato(1900.00);**
                                                        //  **anakisarCandidato(2200.00);**
                                                        //  **analisarCandidato(2000.00);**

        //(Segunda case selecionando candidatos) com essa condição abaixo 👇! Sem o metodo entrandoEmContato, sem o metodo atender e sem o metodo imprimirSelecionados
                                                            //  **selecaoCandidatos();**

        //(Terceira case imprimindo lista dos candidatos selecionados) com essa condição abaixo 👇! Metodo imprimirSelecionados com o for ou na forma for each abreviando. Sem o metodo entrandoEmContato, sem o metodo atender.
                                                                                    //imprimirSelecionados();

        //(Quarta case ligando para candidatos selecionados) modelo atual.

        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        for(String candidato: candidatos) {
            entrandoEmContato(candidato);

        }

    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu=false;
        do {
            atendeu= atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
            tentativasRealizadas++;
            else
            System.out.println("CONTATO REALIZADO COM SUCESSO");
            //obs: precisa sofre alterações para não ficar em um loopin infinito

        }while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu)
        System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
        else
        System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADAS");

    }

    static boolean atender() {
		return new Random().nextInt(3)==1;	
	}


    static void imprimirSelecionados() {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        //Forma abreviada com for each
        //System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        //for(String candidato: candidatos ) {
            //System.out.println("O candidato selecionado foi " + candidato);
        //}
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for(int indice=0; indice < candidatos.length;indice++) {
            System.out.println("O candidato de nº " + (indice+1) + " é " + candidatos[indice]);
        }

    }

    static void selecaoCandidatos() {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        int candidatosSelecionados = 0;
        int candidatosAtual=0;
        double salarioBase=2000.00;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salario " + salarioPretendido );
            if(salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
        }
        static double valorPretendido() {
            return ThreadLocalRandom.current().nextDouble(1800, 2200);
       }
    
    static void analizarCandidato(double salarioPretendido){
        double salarioBase = 2000.00;
        if(salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
        }else {
            System.out.println("AGUARDE O RESULTADO DOS DEMAIS CANDIDATOS.");

         }

        }
        
    }

