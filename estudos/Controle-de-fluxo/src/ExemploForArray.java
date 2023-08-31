public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
        for (int x=0; x<alunos.length; x++) {
		System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        //for com array
        // length significa tamanho //



        // for echo é a forma abreviada do for array//
        //Estrutura de abreviação//
        /*  for(Tipo da variavel e chama a varialve inicial : cada alteração da array VARIAVEL){
            system.out.println();
        */
        }
        for(String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
            
        }
    }
}


