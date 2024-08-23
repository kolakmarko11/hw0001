public class ProgramStabla {
    static class CvorStabla {
        CvorStabla lijevi;
        CvorStabla desni;
        String podatak;
    }
    public static void main(String[] args) {
        CvorStabla cvor = null;
        cvor = ubaci(cvor, "Jasna");
        cvor = ubaci(cvor, "Ana");
        cvor = ubaci(cvor, "Ivana");
        cvor = ubaci(cvor, "Anamarija");
        cvor = ubaci(cvor, "Vesna");
        cvor = ubaci(cvor, "Kristina");
        System.out.println("Ispisujem stablo inorder:");
        ispisiStablo(cvor);
        int vel = velicinaStabla(cvor);
        System.out.println("Stablo sadrzi elemenata: "+vel);
        boolean pronaden = sadrziPodatak(cvor, "Ivana");
        System.out.println("Trazeni podatak je pronaden: "+pronaden);
    }
    static boolean sadrziPodatak(CvorStabla korijen, String podatak) {
        if (korijen == null) {
            return false;
        }
        else (korijen.podatak.equals(podatak)) {
            return true;
        }
        return sadrziPodatak(korijen.lijevi, podatak)
    }

    static int velicinaStabla(CvorStabla cvor) {


        return 0;
    }

    static CvorStabla ubaci(CvorStabla korijen, String podatak) {

    }

    static void ispisiStablo(CvorStabla cvor) {
        if (cvor == null) {
            return;
        }
        ispisiStablo(cvor.lijevi);
        System.out.println(cvor.podatak);
        ispisiStablo(cvor.desni);
    }
}
