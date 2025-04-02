package SistemaDeFormasGeometricas;

public class Main {
    public static void main(String[] args) {
        FormaGeometrica circulo = new Circulo("Vermelho", 5.0);
        FormaGeometrica retangulo = new Retangulo("Amarelo", 6.8, 7.9);

        System.out.println("Círculo:");
        circulo.desenhar();
        System.out.println("Área do Círculo: " + circulo.calcularArea());
        System.out.println("Cor do Círculo: " + circulo.getCor());

        System.out.println("\nRetângulo:");
        retangulo.desenhar();
        System.out.println("Área do Retângulo: " + retangulo.calcularArea());
        System.out.println("Cor do Retângulo: " + retangulo.getCor());

    }
}