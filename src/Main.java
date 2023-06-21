import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        //inicializando a scanner 

        System.out.println("Digite o valor disponivel para gastar este mês: ");
        double valorDisponivel = scanner.nextDouble();
        //lendo o valor que o usuario inseriu 

        scanner.nextLine(); //limpando buffer para evitar erros

        FinancasPessoais financasPessoais = new FinancasPessoais(valorDisponivel);
          
          boolean continuar = true;
          while (continuar) {
             System.out.println("--- Menu ---");
             System.out.println("1.Adicionar despesa");
             System.out.println("2.Mostrar histórico de gastos");
             System.out.println("3.Mostrar gastos por categoria");
             System.out.println("4.Mostrar gastos por forma de pagamento");
             System.out.println("0.Sair");
             
             
             int opcao = scanner.nextInt();
             

             switch (opcao) {
                case 1: 
                  System.out.println("Digite a data: " );
                  String data = scanner.next();
                  System.out.println("Digite a forma de pagamento: ");
                  String formaDePagamento = scanner.next();
                  System.out.println("Digite o valor: ");
                  double valor = scanner.nextDouble();
                  System.out.println("Digite a categoria: ");
                  String categoria = scanner.next();
                  System.out.println("Digite a descrição do item: ");
                  String descricao = scanner.nextLine();

                  financasPessoais.adicionarDespesa(data, formaDePagamento, valor, categoria, descricao);

                  System.out.println("Despesa adicionada com sucesso!");
                  break;
                case 2:
                  financasPessoais.mostrarHistoricoGastos();
                  break;
                case 3:
                  System.out.println("Digite uma categoria para obter o histórico: ");
                  String categoriaEscolhida = scanner.next();
                  //lendo a categoria que o usuario escolheu 
                  financasPessoais.mostrarGastosPorCategoria(categoriaEscolhida);
                  break;
                case 4:
                  System.out.println("Digite uma forma de pagamento para obter o histórico: ");
                  String PagamentoEscolhido = scanner.next();
                  //lendo a categoria que o usuario escolheu 
                  financasPessoais.mostrarGastosFormaPagamento(PagamentoEscolhido);
                  break;
                case 0:
                  continuar = false;
                  break;
                default:
                  System.out.println("Opção inválida!");
             }

          }
          
          scanner.close();
    }
}
