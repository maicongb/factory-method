package factory;

import entidade.Navio;
import entidade.Veiculo;

public class NavioFactory implements VeiculoFactory {

    public String descricao;
    public Integer capacidade;

    public NavioFactory(String descricao, Integer capacidade) {
        this.descricao = descricao;
        this.capacidade = capacidade;
    }

    @Override
    public Veiculo criarVeiculo() {
        return new Navio(descricao, capacidade);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

}
