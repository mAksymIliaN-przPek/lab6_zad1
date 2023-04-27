

public class Main {
    public static void main(String[] args) {
        
        Punkt punkt1 = new Punkt();
        Punkt punkt2 = new Punkt(2, 3);
        Punkt punkt3 = new Punkt(5, 7);


        punkt1.setX(4);
        punkt1.setY(6);
        System.out.println("punkt1 x: " + punkt1.getX());
        System.out.println("punkt1 y: " + punkt1.getY());
        punkt1.zeruj();
        punkt1.opis();

        punkt2.przesun(1, 2);
        punkt2.opis();


        Figura figura = new Figura(punkt1);
        Prostokat prostokat = new Prostokat(4, 6);
        Trojkat trojkat = new Trojkat(3, 5);

        System.out.println(figura.opis());
        System.out.println("Prostokąt powierzchnia: " + prostokat.getPowierzchnia());


        class Okrag {
            Punkt srodek;
            double promien;

            Okrag(Punkt srodek, double promien) {
                this.srodek = srodek;
                this.promien = promien;
            }

            double getPowierzchnia() {
                return Math.PI * promien * promien;
            }

            double getSrednica() {
                return 2 * promien;
            }

            void setPromien(double promien) {
                this.promien = promien;
            }

            double getPromien() {
                return promien;
            }

            boolean wSrodku(Punkt punkt) {
                double dx = punkt.getX() - srodek.getX();
                double dy = punkt.getY() - srodek.getY();
                return dx * dx + dy * dy <= promien * promien;
            }
        }

        Okrag okrag = new Okrag(punkt2, 3);
        System.out.println("Okrag powierzchnia: " + okrag.getPowierzchnia());
        System.out.println("Okrag srednica: " + okrag.getSrednica());
        System.out.println("Czy punkt3 jest wewnątrz okręgu: " + okrag.wSrodku(punkt3));
    }
}
