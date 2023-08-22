import entidade.Veiculo;
import factory.AviaoFactory;
import factory.CaminhaoFactory;
import factory.NavioFactory;
import factory.VeiculoFactory;

public class Main {
    public static void main(String[] args) {

        /*As factory servem apenas para criar os objetos*/
        VeiculoFactory navioFactory = new NavioFactory("navio", 300);
        VeiculoFactory aviaoFactory = new AviaoFactory();
        VeiculoFactory caminhaoFactory = new CaminhaoFactory();

        /* Veiculo é uma classe abstrata */
        Veiculo navio = navioFactory.criarVeiculo();
        Veiculo aviao = aviaoFactory.criarVeiculo();
        Veiculo caminhao = caminhaoFactory.criarVeiculo();

        /* Veiculo é uma classe abstrata que possui um metodo abstrato calcular ipva */
        Integer valorIpvaNavio = navio.calcularIpva();

        System.out.println(navio.getDescricao() + valorIpvaNavio);
        System.out.println(aviao.getDescricao());
        System.out.println(caminhao.getDescricao());
    }
}