import java.util.*;

public class ifelse1 {
    public static void main(String[] args) {
        boolean sair = false;
        while (sair == false) {
            String texto = "Da caixa de Pandora, na qual fervilhavam os males da humanidade, os \n gregos fizeram sair a esperança em último lugar, por considerá-la o mais \n terrível de todos. Não conheço símbolo algum mais emocionante do que \neste.",
                    palavra, respota2;
            int pp;
            System.out.println(
                    "Da caixa de Pandora, na qual fervilhavam os males da humanidade, os \n gregos fizeram sair a esperança em último lugar, por considerá-la o mais \n terrível de todos. Não conheço símbolo algum mais emocionante do que \neste.\n\nDigite uma palavra do texto a cima.");
            Scanner sc = new Scanner(System.in);
            palavra = sc.nextLine();
            pp = texto.indexOf(palavra);
            if (pp >= 0) {
                System.out.println("A palavra "+ palavra +" foi encontrada!!\n\nSua posiçao é "+ pp);
                sair = true;
            } else {
                System.out.println("\n\n A palavra não foi encontrada!");
                System.out.print("Deseja tentar novamente? S/N: ");

                Scanner scan = new Scanner(System.in);
                respota2 = scan.nextLine();
                if (respota2.equals("N")) {
                    sair = true;
                } else {
                    if (respota2.equals("S")) {
                        continue;
                    }
                }
                scan.close();
            }
            sc.close();
        }

    }
}