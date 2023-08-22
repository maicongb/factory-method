package factory;

import entidade.Caminhao;
import entidade.Veiculo;

public class CaminhaoFactory implements VeiculoFactory {
    @Override
    public Veiculo criarVeiculo() {
        return new Caminhao("Caminhão",300);
    }
}
