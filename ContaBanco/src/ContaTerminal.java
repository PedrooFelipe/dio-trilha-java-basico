import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        
        int numero;
        String nomeCliente, sobrenomeCliente;
        String agencia;
        double saldo = 1900.48;
        
        
        //Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada.
        System.out.println("Digite seu nome!");
        nomeCliente = entrada.next();

        System.out.println("Digite seu Sobrenome!");
        sobrenomeCliente = entrada.next();

        System.out.println("Por gentileza, digite sua agência!(ex: 123-4)");
        agencia = entrada.next();

        System.out.println("Por favor, digite o numero da agência!");
        numero = entrada.nextInt();
    }
}
