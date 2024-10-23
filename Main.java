public class Main {
    public static void main(String[] args) {
        // Criando um produto genérico
        Produto produto = new Produto("Caneta", 1.00, 2.50);
        System.out.println("Lucro do produto: " + produto.calcularLucro());
        produto.salvar();
        
        // Criando um produto alimentício
        ProdutoAlimenticio produtoAlimento = new ProdutoAlimenticio("Biscoito", 3.00, 5.00, "2025-12-31", "Calorias: 100");
        System.out.println("Lucro do produto alimentício: " + produtoAlimento.calcularLucro());
        produtoAlimento.salvar();

        // Criando um produto de vestuário
        ProdutoVestuario produtoVestuario = new ProdutoVestuario("Camiseta", 15.00, 30.00, "M", "Azul", "Algodão");
        System.out.println("Lucro do produto de vestuário: " + produtoVestuario.calcularLucro());
        produtoVestuario.salvar();

        // Atualizando e deletando os produtos
        produtoAlimento.atualizar();
        produtoVestuario.deletar();
    }
}
