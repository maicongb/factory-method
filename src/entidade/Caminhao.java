package entidade;

public class Caminhao extends  Veiculo {

    private String descricao;
    private Integer capacidadeCarga;


    public Caminhao(String descricao, Integer capacidadeCarga) {
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
        return 50;
    }
}
