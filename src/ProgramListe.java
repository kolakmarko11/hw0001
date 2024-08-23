public class ProgramListe {
    static class CvorListe {
        ProgramListe.CvorListe sljedeci;
        String podatak;
    }

    public static void main(String[] args) {
        ProgramListe.CvorListe cvor = null;
        cvor = ubaci(cvor, "Jasna");
        cvor = ubaci(cvor, "Ana");
        cvor = ubaci(cvor, "Ivana");
        System.out.println("Ispisujem listu uz originalni poredak:");
        ispisiListu(cvor);
        cvor = sortirajListu(cvor);
        System.out.println("Ispisujem listu nakon sortiranja:");
        ispisiListu(cvor);
        int vel = velicinaListe(cvor);
        System.out.println("Lista sadrzi elemenata: " + vel);
    }

    static int velicinaLista(ProgramListe.CvorListe cvor) {

    }
    static ProgramListe.CvorListe ubaci(ProgramListe.CvorListe prvi, String podatak) {
        ProgramListe.CvorListe novi = new ProgramListe.CvorListe();
        novi.sljedeci = prvi;
        novi.podatak = podatak;
        return novi

    }

    static void ispisiListu(ProgramListe.CvorListe cvor) {
        while (cvor != null) {
            System.out.println(cvor.podatak);
            cvor = cvor.sljedeci
        }
    }
    static ProgramListe.CvorListe sortirajListu(ProgramListe.CvorListe cvor) {

    }
}
