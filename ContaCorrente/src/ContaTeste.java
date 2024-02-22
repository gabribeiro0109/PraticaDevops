import java.util.Scanner;
public class ContaTeste {
    public static void main(String[]args){
        // Importar classe Scanner para inserir dados via teclado
        Scanner input=new Scanner(System.in);
        // Declarar uma variável para colocar o nome do cliente
        String nome1,nome2;
        double saldo1,saldo2,retirarSaldo1,retirarSaldo2;

        // Colocar o valor em uma variável de nome
        System.out.println("Digite o nome do cliente");
        nome1=input.nextLine();
        System.out.println("Digite o nome do cliente");
        nome2=input.nextLine();
        System.out.println("Digite seu saldo "+nome1);
        saldo1=input.nextDouble();
        System.out.println("Digite seu saldo "+nome2);
        saldo2=input.nextDouble();
        System.out.println("Digite quanto de dinheiro você deseja retirar "+nome1);
        retirarSaldo1=input.nextDouble();
        System.out.println("Digite quanto de dinheiro você deseja retirar "+nome2);
        retirarSaldo2=input.nextDouble();


        // Criar um representante de Conta
        Conta conta1 = new Conta();
        Conta conta2= new Conta();
        conta1.setNome(nome1);
        conta1.setSaldo(saldo1);
        conta2.setNome(nome2);
        conta2.setSaldo(saldo2);
        conta1.setRetirarsaldoaldo(retirarSaldo1);
        conta2.setRetirarsaldoaldo(retirarSaldo2);


        System.out.println("O nome do cliente é: "+ conta1.getNome());
        System.out.printf("O saldo é: %.2f",conta1.getSaldo()-conta1.getRetirarsaldo());
        System.out.println("\nO nome do cliente é: "+ conta2.getNome());
        System.out.printf("O saldo é: %.2f",conta2.getSaldo()-conta2.getRetirarsaldo());


    }
}
