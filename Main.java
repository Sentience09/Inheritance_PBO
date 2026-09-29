public class Main {
    public static void main(String[] args) {
        Bentuk bujurSangkar = new Bujur_Sangkar(5.0, "Hitam");
        System.out.println("-> Info Bujur Sangkar:");
        bujurSangkar.printInfo(); 
        System.out.println();

        Bentuk lingkaran = new Lingkaran(7.0, "Coklat");
        System.out.println("-> Info Lingkaran:");
        lingkaran.printInfo();
        System.out.println();

        Bentuk silinder = new Silinder(10.0, 7.0, "Putih");
        System.out.println("-> Info Silinder:");
        silinder.printInfo();
    }
}