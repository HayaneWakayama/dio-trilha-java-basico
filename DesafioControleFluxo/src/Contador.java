import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parametro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo paramento: ");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);

        }catch(ParametrosInvalidosException exception){
            System.out.println(exception.getMessage());
        }
    }
    static void contar(int paramentoUm, int paramentoDois) throws ParametrosInvalidosException{ 
        if(paramentoUm > paramentoDois){
            throw new ParametrosInvalidosException();
        }else{
            int contagem = paramentoDois - paramentoUm;
            for (int contador = 0; contador < contagem; contador++){
                System.out.println("Impressao do numero: " + (contador+1));
            }
        }
    }
}
