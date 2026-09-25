public class Retangulo {
    private double largura;
    private double altura;

    // Construtor padrão
    public Retangulo() {
        this.largura = 1.0;
        this.altura = 1.0;
    }

    // Construtor com parâmetros
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    // Getters e Setters
    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Calcula a área
    public double calcularArea() {
        return largura * altura;
    }

    // Verifica se é quadrado
    public boolean isQuadrado() {
        return largura == altura;
    }

    public static void main(String[] args) {
        Retangulo r1 = new Retangulo(5, 5);

        if (r1.isQuadrado()) {
            System.out.println("O retângulo é um quadrado.");
        } else {
            System.out.println("O retângulo não é um quadrado.");
        }

        System.out.println("Área: " + r1.calcularArea());
    }
}
