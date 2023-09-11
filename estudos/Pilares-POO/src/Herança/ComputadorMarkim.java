package Herança;

public class ComputadorMarkim {
    public static void main(String[] args) {
        System.out.println("MSN");

        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println("Facebook");

        FacebookMessenger fbm = new FacebookMessenger();
        fbm.enviarMensagem();
        fbm.receberMensagem();

        System.out.println("Telegram");

        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();

    }
}
