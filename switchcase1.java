import java.util.*;

public class switchcase1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String[] varOpçoes = {"Criar","Ler","Editar","Excluir"};
       for (int o = 0; o < varOpçoes.length; o++) {
        System.out.println("Opção ["+ o +"] - " + varOpçoes[o]);
       }
       System.out.println("Digite uma das opçoes acima: ");
       int opcao = sc.nextInt();

       switch (opcao) {
            case 0:
            System.out.println("Voce selecionou a opção " + varOpçoes[0]);
            break;
            case 1:
            System.out.println("Voce selecionou a opção " + varOpçoes[1]);
            break;
            case 2:
            System.out.println("Voce selecionou a opção " + varOpçoes[2]);
            break;
            case 3:
            System.out.println("Voce selecionou a opção " + varOpçoes[3]);
            break;
            default:
            System.out.println("Não existe essa opção");
            break;
       }
       sc.close();
    }
}
