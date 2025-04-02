package SistemaDeNotificacao;

public class Sms implements Interface {
    @Override
    public void enviarNotificacao(String mensagem, String destinatario) {
        System.out.println("Enviando SMS para: " + destinatario);
        System.out.println("Mensagem: " + mensagem);
    }

    @Override
    public void receberNotificacao(String mensagem) {
        System.out.println("Recebendo SMS...");
        System.out.println("Mensagem: " + mensagem);
    }
}