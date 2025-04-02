package SistemaDeNotificacao;

public class Email implements Interface {
    @Override
    public void enviarNotificacao(String mensagem, String destinatario) {
        System.out.println("Enviando e-mail para: " + destinatario);
        System.out.println("Mensagem: " + mensagem);
    }

    @Override
    public void receberNotificacao(String mensagem) {
        System.out.println("Recebendo e-mail...");
        System.out.println("Mensagem: " + mensagem);
    }
}