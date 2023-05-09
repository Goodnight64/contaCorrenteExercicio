import java.util.Scanner;

public class contaCorrente {
    public static void main(String[] args) {
        String nome = "Jaqueline oliveira";
        String tipoDeconta = "corrente";
        double saldo = 2500.0;
        int operacao = 0;
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;

        while(opcao != 4){
            System.out.println("**********************************");
            System.out.println("Dados iniciais do cliente  ");
            System.out.println("nome:          " +  nome);
            System.out.println("tipo de conta: " + tipoDeconta);
            System.out.println("saldo inicial: " + operacao);
            System.out.println("***********************************");
            System.out.println("operações: ");
            System.out.println("1 - consultar saldos");
            System.out.println("2 - receber valor   ");
            System.out.println("3 - transferir valor");
            System.out.println("4 - sair            ");

            System.out.println("digite a opçao desejada: ");
             opcao = entrada.nextInt();

            switch (opcao){
                case 1:
                    System.out.println(saldo);
                    break;
                case 2 :
                    System.out.println("digite o valor a receber: ");
                    double valor = entrada.nextDouble();
                    saldo = saldo + valor;
                    System.out.println("seu saldo agora é: " + saldo);
                    break;
                case 3 :
                    System.out.println("digite o valor a transferir: ");
                    double valor2 = entrada.nextDouble();
                    saldo = saldo - valor2;
                    System.out.println("seu saldo agora é: " + saldo);
                    break;
            }


        }


    }
}