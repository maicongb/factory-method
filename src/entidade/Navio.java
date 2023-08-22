package entidade;

public class Navio extends Veiculo {

    private String descricao;
    private Integer capacidadeCarga;

    public Navio(String descricao, Integer capacidadeCarga) {
        this.descricao = descricao;
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public String getDescricao() {
        return this.descricao;
    }

    @Override
    public Integer getCapacidadeCarga() {
        return this.capacidadeCarga;
    }

    @Override
    public Integer calcularIpva() {
        return 20;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCapacidadeCarga(Integer capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
}
