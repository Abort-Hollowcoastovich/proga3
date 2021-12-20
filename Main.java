public class Main {
    public static void main(String [] arg){
        BlueEye sineglazka = new BlueEye();
        Cheeks shechki = new Cheeks();
        Eyes glazki = new Eyes();
        Medunica malishka = new Medunica();
        Blanket odeialo = new Blanket();
        Steps shagi = new Steps();
        Door dver = new Door();
        Khalat halat = new Khalat();
        Hat shapka = new Hat();
        Case chemodan = new Case();
        Neznaika neznaika = new Neznaika();
        System.out.println();
        shagi.go(dver.getName());
        neznaika.goToBed(odeialo.getName());
        sineglazka.enter(halat, shapka, chemodan);
        shechki.were();
        glazki.watch();
        neznaika.understood(malishka.getName());
        sineglazka.talk();
    }
}
