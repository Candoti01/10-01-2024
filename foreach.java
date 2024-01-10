
public class foreach {
    public static void main(String[] args) {
        String[] frutas = {"Morango", "Côco", "Tomate", "Manga", "Uva", "Melancia"};
        System.out.println("Você tem [" + frutas.length + "] frutas cadastradas");
        for (int f=0; f < frutas.length; f++) {
            System.out.println("Fruta: [" + frutas[f] + "] conferidas com sucesso.");
        }
    }
}