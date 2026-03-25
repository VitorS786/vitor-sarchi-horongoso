package atv7;

public class Aeronavemetodos {
    
    String modelo;
    int passageiros;
    double velocidadeMaxima;
    double capacidadeCombustivel;
    double queimaCombustivelminuto;

    public Aeronavemetodos(String modelo, int passageiros, double velocidadeMaxima, double capacidadeCombustivel,
            double queimaCombustivelminuto) {

        this.modelo = modelo;
        this.passageiros = passageiros;
        this.velocidadeMaxima = velocidadeMaxima;
        this.capacidadeCombustivel = capacidadeCombustivel;
        this.queimaCombustivelminuto = queimaCombustivelminuto;
    }

    public int getPassageiros() {
        return this.passageiros;
    }

    public String getModelo() {
        return this.modelo;
    }
    public double getTempoDeVoo() {
        return this.capacidadeCombustivel / this.queimaCombustivelminuto;
    }
}