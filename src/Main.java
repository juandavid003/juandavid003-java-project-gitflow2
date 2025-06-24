public class Main {
    public static void main(String[] args) {

        Saludo saludo = new Saludo();
        System.out.println(saludo.generarSaludo("Mundo", "en"));
        System.out.println(saludo.generarSaludo("Mundo", "es"));
        System.out.println(saludo.generarSaludo("Mundo", "fr"));
    }
}
