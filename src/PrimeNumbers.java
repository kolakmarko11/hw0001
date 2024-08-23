public class PrimeNumbers {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println();
            return;
        }

        int n = Integer.parseInt(args[0]);


        if (n <= 0) {
            System.out.println("n mora biti veci od 0");
            return;
        }


        System.out.println("Tražili ste izračun " + n + " prostih brojeva. Evo ih:");
    }
}
