package SistemaDeNotificacao;

public interface Interface {
    void enviarNotificacao(String mensagem, String destinatario);
    void receberNotificacao(String mensagem);

    default void exibirDestinatario(String destinatario){
        System.out.println("Destinatário: " + destinatario);
    }
}
