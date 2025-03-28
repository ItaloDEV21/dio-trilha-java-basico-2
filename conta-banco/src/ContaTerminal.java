import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       //TODO:conhecer e importar a classe scanner

       //Exibir as mensagens para o nosso usúario 

       // obter pela scanner os valores digitados no terminal 

       // exibir a mensagem da conta criada

       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

       System.out.println("Por favor, digite o número da Agência !");
       int numero = scanner.nextInt();

       System.out.println("Informe sua agência: ");
       String agencia = scanner.next();

       scanner.nextLine();

        System.out.println("Digite seu nome por favor: ");
        String nome = scanner.nextLine();  
        
        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();  

        //  imprimindo a mesnsagem a ser mostrada para o cliente

        System.out.println("Óla " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
