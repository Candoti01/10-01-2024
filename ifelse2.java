import java.util.*;

public class ifelse2 {
    public static void main(String[] args) {
        boolean resp = false, r = false;
        String Usuario = "r";
        int senha = 2, confSenha;
        while (resp == false) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            // Registro Usuario!

            System.out.println("\n\n\nRegistrando...\n\nInsira seu nome de usuario: ");
            Scanner registro = new Scanner(System.in);
            Usuario = registro.nextLine();
            // Registro senha!

            System.out.println("\nInsira sua senha: ");
            senha = registro.nextInt();
            // Confirmação da Senha!
            System.out.println("Confirme sua senha: ");
            confSenha = registro.nextInt();

            if (senha == confSenha) {
                System.out.println("\nREGISTRADO!\n");
                resp = true;
            } else {
                System.out.println("\nAs senhas estão diferentes!");
            }
        }
        // Login do Usuário!
        while (r == false) {

            System.out.println("\n\nLogando...\n\nDigite seu Usuario: ");
            Scanner registro = new Scanner(System.in);
            String userlogado = registro.nextLine();
            System.out.println("Digite a Senha: ");
            int Sen = registro.nextInt();

            if (userlogado.equals(Usuario)) {
                if (Sen == senha) {
                    System.out.println("\nLOGADO COM SUCESSO!\n");
                    r = true;
                } else {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Usuario ou senha incorretos!");
                    r = true;
                }
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("Usuario ou senha incorretos!");
                r = true;
            }
            registro.close();
        }
    
    }
}
