public class dowhile1 {
    public static void main(String[] args) {
       int tempoTotal = 2000; //Tempo em milissegundos
       int minutoContado = 0;
       int segundoContado = 0;

       while (minutoContado <= tempoTotal) {
        try {
            System.out.println("Assistindo filme. Se passaram " + minutoContado + " Minuto(s) e " + segundoContado + " Segundo(s)");
            Thread.sleep(1000); // contador de tempo a cada 1 segundo (1000 milissegundos)
            segundoContado++;
            if (segundoContado == 60000) {
                minutoContado++;
            };
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro " + e);
        }
       }
    }
}
