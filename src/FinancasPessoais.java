import java.util.ArrayList;
import java.util.List;


public class FinancasPessoais {
    
    private double valorDisponivel;
    private double totalGasto;
    List<Despesa> despesas;

    public FinancasPessoais(double valorDisponivel) {
        this.valorDisponivel = valorDisponivel;
        this.totalGasto = 0; //inicializando o valor gasto em 0
        this.despesas = new ArrayList<>(); //armazenando as despesas dentro da lista 
    }

    public void adicionarDespesa(String data, String formaDePagamento, double valor, 
    String categoria, String descricao ) {
        Despesa despesa = new Despesa(data, formaDePagamento, valor, categoria, descricao);

        despesas.add(despesa);
          totalGasto += valor;
          valorDisponivel -= valor;
    }

    public void mostrarHistoricoGastos() {
        System.out.println("---Histórico de gastos---");
        for (Despesa despesa : despesas) {
            System.out.println(despesa);
        }
        System.out.println("Total gasto: " + totalGasto);
        System.out.println("Valor disponivel: " + valorDisponivel);
    }

    public void mostrarGastosPorCategoria(String categoria) {
        System.out.println("---Gastos por categoria:" + categoria + "---");
        for (Despesa despesa : despesas) {
            if (despesa.getCategoria().equals(categoria)) {
                System.out.println(despesa);
            }
        }

    }

    public void mostrarGastosFormaPagamento(String formaDePagamento) {
        System.out.println("---Gastos por forma de pagamento: " + formaDePagamento + "---");
        for (Despesa despesa : despesas) {
            if (despesa.getFormaDePagamento().equals(formaDePagamento)) {
                System.out.println(despesa);
            }
        }
    }
}
