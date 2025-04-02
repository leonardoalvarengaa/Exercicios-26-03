package SistemaDeFormasGeometricas;

public class Retangulo extends FormaGeometrica {
    private double largura;
    private double altura;

    public Retangulo(String cor, double largura, double altura){
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        area = largura * altura;
        return area;
    }

    @Override
    public void desenhar(){
        System.out.println("Desenhando um retângulo de cor" + cor + " com largura " + largura + " e altura " + altura);
    }
}