public class Despesa{

    private String data;
    private String formaDePagamento;
    private double valor;
    private String categoria;
    private String descricao;
    
    //getters e setters 
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //construtores 
    public Despesa(String data, String formaDePagamento, double valor, String categoria, String descricao) {
        this.data = data;
        this.formaDePagamento = formaDePagamento;
        this.valor = valor;
        this.categoria = categoria;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Data: " + data +
                ", Forma de pagamento: " + formaDePagamento +
                ", Valor: " + valor +
                ", Categoria: " + categoria +
                ", Descrição: " + descricao;
    }

}