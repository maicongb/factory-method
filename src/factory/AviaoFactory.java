package factory;

import entidade.Aviao;
import entidade.Veiculo;

public class AviaoFactory implements  VeiculoFactory{
    @Override
    public Veiculo criarVeiculo() {
        return new Aviao("Avião", 500);
    }
}
