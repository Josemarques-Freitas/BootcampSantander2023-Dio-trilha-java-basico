public class ResultadoEscolar {
    public static void main(String[] args) {

        int nota = 8;
        
        if(nota >= 7)
         System.out.println("Aprovado");
 
        else
         System.out.println("Reprovado");

         //Controle de Fluxo Composto if = Se verdadeiro  else = Se não for verdadeiro
         //Outro exemplo de controle composto

         double saldo = 25.0;
         double valorSolicitado = 22.0;

         if(valorSolicitado < saldo){
         
         saldo = saldo - valorSolicitado;
         System.out.println("Novo saldo: " + saldo);

         }else
             System.out.println("Saldo Insuficiente");
     }
}
