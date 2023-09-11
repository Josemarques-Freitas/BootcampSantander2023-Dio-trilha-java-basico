public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();

        jeep.ligar();
        jeep.setChassi("574868");

        Moto z400 = new Moto();
        z400.setChassi("12313123");
        z400.ligar();
    }
}
