package entidade;

public class Aviao extends Veiculo {

    private String descricao;
    private Integer capacidadeCarga;

    public Aviao(String descricao, Integer capacidadeCarga) {
        this.descricao = descricao;
        this.capacidadeCarga = capacidadeCarga;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCapacidadeCarga(Integer capacidadeCarga) {
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
        return 200;
    }
}
