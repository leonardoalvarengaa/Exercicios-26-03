package SistemaDeNotificacao;

public class NotificacaoPush implements Interface {
        @Override
        public void enviarNotificacao(String mensagem, String destinatario) {
            System.out.println("Enviando notificação push para: " + destinatario);
            System.out.println("Mensagem: " + mensagem);
        }

        @Override
        public void receberNotificacao(String mensagem) {
            System.out.println("Recebendo notificação push...");
            System.out.println("Mensagem: " + mensagem);
        }
    }

