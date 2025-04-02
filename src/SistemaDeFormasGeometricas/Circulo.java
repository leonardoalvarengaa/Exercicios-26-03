package SistemaDeFormasGeometricas;

public class Circulo extends FormaGeometrica {
    private double raio;

    public Circulo(String cor, double raio){
        super(cor);
        this.raio = raio;
    }

    @Override
    public double calcularArea(){
        area = Math.PI * raio * raio;
        return area;
    }

    @Override
    public void desenhar(){
        System.out.println("Desenhando um círculo de cor " + cor + "e raio" + raio);
    }
}