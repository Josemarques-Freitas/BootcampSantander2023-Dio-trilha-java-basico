public class Comentarios {
    public static void main(String[] args) {
        // Olá, eu sou um comentário em uma única linha

        /* Olá,
        * Eu sou um comentario
        * que posso ser mais detalhadod
        * quando necessário
        */

        /** 
         * Estas duas estrelinhas acima
         * é para identificar que você
         * pretende elaborar um comentário
         * a nível de documentação.
         * Que incrível !!!
         */
        
    }
    /*|METODO QUE NÃO CONDIZ COM AS BOAS PRATICAS */
 /*
 * Este método foi elaborado as pressas
 * por isso o nome das variáveis foi abreviada,
 * mas olha, ele tem a finalidade de somar ou  multiplicar
 * dois números?
 * OBS: COMENTARIOS NÃO SERVEM PARA CORRIGIR ERRO DE CODIGOS*/

public int somaMultiplica (int n, int x, String m){
    int r = 0; // r é igual ao resultado
    if (m == "M"){ // M= multiplicação
        r= n * x;
    }else{
        // se não soma mesmo
        r = n + x;
    }
    return r;
}
}
