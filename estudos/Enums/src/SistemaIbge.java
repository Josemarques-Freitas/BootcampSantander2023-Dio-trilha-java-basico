public class SistemaIbge {
    public static void main(String[] args) {
        for (var EstadoBrasileiro : EstadoBrasileiro.values()) {
            // System.out.println(EstadoBrasileiro.getSigla() + " - " +
            // EstadoBrasileiro.getNome());
        }

        EstadoBrasileiro eb = EstadoBrasileiro.PIAUI;

        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.getNomeMaiusculo());
        System.out.println(eb.getIbge());
    }
}
