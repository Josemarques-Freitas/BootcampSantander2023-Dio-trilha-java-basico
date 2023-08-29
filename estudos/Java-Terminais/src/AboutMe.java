public class AboutMe {
    public static void main(String[] args) {
        //Dedicado a inserir os dados pelo promt 
        /*Ex: java Josemarques Freitas 35 1.71
         *            [0]       [1]   [2]  [3]    */
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
    
    }
}

