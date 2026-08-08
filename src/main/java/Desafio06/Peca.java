package Desafio06;

public class Peca {
    private String code;
    private double weight;
    private StatusControleQualidade statusControleQualidade;
    
    public Peca(String code, double weight, StatusControleQualidade statusControleQualidade) {
        this.code = code;
        this.weight = weight;
        this.statusControleQualidade = statusControleQualidade;
    }

    public Peca() {
        
    }

    public String getCode() {
        return code;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public StatusControleQualidade getStatusControleQualidade() {
        return statusControleQualidade;
    }

    public void setStatusControleQualidade(StatusControleQualidade statusControleQualidade) {
        this.statusControleQualidade = statusControleQualidade;
    }

    @Override
    public String toString() {
        return "Peca{" +
                "code='" + code + '\'' +
                ", weight=" + weight +
                ", statusControleQualidade=" + statusControleQualidade +
                '}';
    }
}
