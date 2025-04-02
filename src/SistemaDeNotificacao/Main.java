package SistemaDeNotificacao;

public class Main {
    public static void main(String[] args) {
        NotificacaoPush notificacaoPush = new NotificacaoPush();
        Email email = new Email();
        Sms sms = new Sms();


        notificacaoPush.enviarNotificacao("Promoção de roupas", "João");
        notificacaoPush.receberNotificacao("Promoção de roupas");
        notificacaoPush.exibirDestinatario("João");

        email.enviarNotificacao("Promoção de roupas", "Maria");
        email.receberNotificacao("Promoção de roupas");
        email.exibirDestinatario("Maria");

        sms.enviarNotificacao("Promoção de roupas", "José");
        sms.receberNotificacao("Promoção de roupas");
        sms.exibirDestinatario("José");
    }
}
