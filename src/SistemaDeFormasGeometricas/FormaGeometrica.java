package SistemaDeFormasGeometricas;

abstract class FormaGeometrica {
    protected String cor;
    protected double area;

    public FormaGeometrica(String cor){
        this.cor = cor;
    }

    public double calcularArea(){
        return area;
    }

    public  void desenhar(){
    }

    public String getCor(){
        return cor;
    }

}
