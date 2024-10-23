// Classe derivada ProdutoVestuario que herda de Produto
public class ProdutoVestuario extends Produto {
    // Atributos específicos para produtos de vestuário
    private String tamanho;
    private String cor;
    private String material;

    // Construtor da classe ProdutoVestuario
    public ProdutoVestuario(String nome, double precoCusto, double precoVenda, String tamanho, String cor, String material) {
        // Chamando o construtor da classe pai (Produto)
        super(nome, precoCusto, precoVenda);
        this.tamanho = tamanho;
        this.cor = cor;
        this.material = material;
    }

    // Métodos de acesso e modificação para os novos atributos
    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    // Sobrescrevendo o método salvar para incluir detalhes específicos
    @Override
    public void salvar() {
        super.salvar();
        System.out.println("Produto de vestuário salvo com tamanho: " + tamanho + ", cor: " + cor);
    }

    // Sobrescrevendo o método deletar
    @Override
    public void deletar() {
        super.deletar();
        System.out.println("Produto de vestuário deletado.");
    }

    // Sobrescrevendo o método atualizar
    @Override
    public void atualizar() {
        super.atualizar();
        System.out.println("Produto de vestuário atualizado com novo material: " + material);
    }
}
