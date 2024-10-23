// Classe derivada ProdutoAlimenticio que herda de Produto
public class ProdutoAlimenticio extends Produto {
    // Atributos específicos para produtos alimentícios
    private String dataValidade;
    private String informacoesNutricionais;

    // Construtor da classe ProdutoAlimenticio
    public ProdutoAlimenticio(String nome, double precoCusto, double precoVenda, String dataValidade, String informacoesNutricionais) {
        // Chamando o construtor da classe pai (Produto)
        super(nome, precoCusto, precoVenda);
        this.dataValidade = dataValidade;
        this.informacoesNutricionais = informacoesNutricionais;
    }

    // Métodos de acesso e modificação para os novos atributos
    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getInformacoesNutricionais() {
        return informacoesNutricionais;
    }

    public void setInformacoesNutricionais(String informacoesNutricionais) {
        this.informacoesNutricionais = informacoesNutricionais;
    }

    // Sobrescrevendo o método salvar para incluir detalhes específicos
    @Override
    public void salvar() {
        // Chamando o método da classe pai
        super.salvar();
        System.out.println("Produto alimentício salvo com data de validade: " + dataValidade);
    }

    // Sobrescrevendo o método deletar
    @Override
    public void deletar() {
        super.deletar();
        System.out.println("Produto alimentício deletado.");
    }

    // Sobrescrevendo o método atualizar
    @Override
    public void atualizar() {
        super.atualizar();
        System.out.println("Produto alimentício atualizado com novas informações nutricionais.");
    }
}
