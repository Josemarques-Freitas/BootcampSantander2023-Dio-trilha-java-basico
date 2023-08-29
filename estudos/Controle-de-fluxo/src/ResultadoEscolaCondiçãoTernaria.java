public class ResultadoEscolaCondiçãoTernaria {
    public static void main(String[] args) {
        int nota = 5;
		String resultado = nota >= 7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado);

        /*   variavel >= numero ? "Aprovado" representa o if = Se verdadeiro

         *   : "Reprovado" representa o else = Se não for verdadeiro
         * 
         *   ? "Aprovado" : variavel >=numero && variavel <numeroMedia ? "Recuperação" : "Reprovado";
         *    representa else if = Se por acaso ou entre */
        

         
    }
}
