// Classe base Produto
public class Produto {
    // Atributos da classe Produto
    private String nome;
    private double precoCusto;
    private double precoVenda;

    // Construtor da classe Produto
    public Produto(String nome, double precoCusto, double precoVenda) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

    // Método para calcular o lucro com base no preço de custo e de venda
    public double calcularLucro() {
        return precoVenda - precoCusto;
    }

    // Métodos de acesso (getters) e modificação (setters)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    // Método para salvar o produto no banco de dados
    public void salvar() {
        // Simulando a operação de salvar no banco de dados
        System.out.println("Produto salvo no banco de dados.");
    }

    // Método para deletar o produto do banco de dados
    public void deletar() {
        // Simulando a operação de deletar no banco de dados
        System.out.println("Produto deletado do banco de dados.");
    }

    // Método para atualizar o produto no banco de dados
    public void atualizar() {
        // Simulando a operação de atualizar no banco de dados
        System.out.println("Produto atualizado no banco de dados.");
    }
}
