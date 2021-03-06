public class Retangulo extends FormaGeometrica {
    @Override
    public double area() {
        return altura * largura;
    }

    public String toString() {
        return String.format("[Retangulo] " + largura+0 + " / " + altura+0);
    }

    private double largura;
    private double altura;

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (largura < 0) {
            throw new IllegalArgumentException("Largura deve ser maior ou igual a 0");
        }
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura < 0) {
            throw new IllegalArgumentException("Altura deve ser maior ou igual a 0");
        }
        this.altura = altura;
    }
}

