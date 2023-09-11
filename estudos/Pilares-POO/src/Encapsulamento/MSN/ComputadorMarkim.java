package Encapsulamento.MSN;

public class ComputadorMarkim {
    public static void main(String[] args) {
        // abrindo MSN Messenger
        MSNMessenger msn = new MSNMessenger();

        msn.enviarMensagem();

        msn.receberMensagem();
    }
}
