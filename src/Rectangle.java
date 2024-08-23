import java.io.IOException;

public class Rectangle {
    public static void main(String[] args) throws IOException {
        double sirina, visina;

        if (args.length == 2) {
            sirina = Double.parseDouble(args[0]);
            visina = Double.parseDouble(args[1]);
        }

        System.out.println("Definirali ste Rectangle sa širinom" + sirina + "i visinom" + visina + ".");
        System.out.println("Njegova je povrsina: ");

    }
}
