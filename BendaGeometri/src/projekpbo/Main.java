package projekpbo;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("===========================================");
        System.out.println("    PROGRAM PENGHITUNG BENTUK GEOMETRI    ");
        System.out.println("===========================================");
        
        boolean running = true;
        
        while (running) {
            tampilkanMenu();
            int pilihan = getInputInteger("Pilih menu (1-7): ");
            
            switch (pilihan) {
                case 1:
                    hitungLingkaran();
                    break;
                case 2:
                    hitungPersegi();
                    break;
                case 3:
                    hitungSegitiga();
                    break;
                case 4:
      
                    break;
                case 5:
                    demonstrasiPolymorphism();
                    break;
                case 6:
                    bandingkanBentuk();
                    break;
                case 7:
                    System.out.println("\nTerima kasih telah menggunakan program ini!");
                    running = false;
                    break;
                default:
                    System.out.println("\nPilihan tidak valid! Silakan pilih 1-7.");
            }
            
            if (running) {
                System.out.println("\nTekan Enter untuk melanjutkan...");
                scanner.nextLine();
                clearScreen();
            }
        }
        
        scanner.close();
    }
    
    private static void tampilkanMenu() {
        System.out.println("\n=============== MENU UTAMA ===============");
        System.out.println("1. Hitung Lingkaran");
        System.out.println("2. Hitung Persegi");
        System.out.println("3. Hitung Segitiga");
        System.out.println("4. Hitung Kubus");
        System.out.println("5. Demonstrasi Polymorphism");
        System.out.println("6. Bandingkan Bentuk");
        System.out.println("7. Keluar");
        System.out.println("==========================================");
    }
    
    private static void hitungLingkaran() {
        System.out.println("\n=== PERHITUNGAN LINGKARAN ===");
        double jariJari = getInputDouble("Masukkan jari-jari lingkaran: ");
        
        if (jariJari <= 0) {
            System.out.println("Jari-jari harus lebih besar dari 0!");
            return;
        }
        
        Lingkaran lingkaran = new Lingkaran(jariJari);
        tampilkanHasilPerhitungan(lingkaran, "Lingkaran dengan jari-jari " + jariJari);
    }
    
    private static void hitungPersegi() {
        System.out.println("\n=== PERHITUNGAN PERSEGI ===");
        double sisi = getInputDouble("Masukkan panjang sisi persegi: ");
        
        if (sisi <= 0) {
            System.out.println("Sisi harus lebih besar dari 0!");
            return;
        }
        
        Persegi persegi = new Persegi(sisi);
        tampilkanHasilPerhitungan(persegi, "Persegi dengan sisi " + sisi);
    }
    
    private static void hitungSegitiga() {
        System.out.println("\n=== PERHITUNGAN SEGITIGA ===");
        System.out.println("Pilih metode input:");
        System.out.println("1. Alas dan Tinggi");
        System.out.println("2. Tiga Sisi");
        
        int pilihan = getInputInteger("Pilihan Anda (1/2): ");
        Segitiga segitiga = null;
        String deskripsi = "";
        
        switch (pilihan) {
            case 1:
                double alas = getInputDouble("Masukkan panjang alas: ");
                double tinggi = getInputDouble("Masukkan tinggi: ");
                
                if (alas <= 0 || tinggi <= 0) {
                    System.out.println("Alas dan tinggi harus lebih besar dari 0!");
                    return;
                }
                
                segitiga = new Segitiga(alas, tinggi);
                deskripsi = "Segitiga dengan alas " + alas + " dan tinggi " + tinggi;
                break;
                
            case 2:
                double sisiA = getInputDouble("Masukkan panjang sisi A: ");
                double sisiB = getInputDouble("Masukkan panjang sisi B: ");
                double sisiC = getInputDouble("Masukkan panjang sisi C: ");
                
                if (sisiA <= 0 || sisiB <= 0 || sisiC <= 0) {
                    System.out.println("Semua sisi harus lebih besar dari 0!");
                    return;
                }
                
                // Validasi segitiga
                if (!isValidTriangle(sisiA, sisiB, sisiC)) {
                    System.out.println("Ketiga sisi tidak dapat membentuk segitiga!");
                    return;
                }
                
                segitiga = new Segitiga(sisiA, sisiB, sisiC);
                deskripsi = "Segitiga dengan sisi " + sisiA + ", " + sisiB + ", " + sisiC;
                break;
                
            default:
                System.out.println("Pilihan tidak valid!");
                return;
        }
        
        tampilkanHasilPerhitungan(segitiga, deskripsi);
    }
    
    private static void hitungKubus() {
        System.out.println("\n=== PERHITUNGAN KUBUS ===");
        double sisi = getInputDouble("Masukkan panjang sisi kubus: ");
        
        if (sisi <= 0) {
            System.out.println("Sisi harus lebih besar dari 0!");
            return;
        }
        
        Kubus kubus = new Kubus(sisi);
        tampilkanHasilPerhitungan(kubus, "Kubus dengan sisi " + sisi);
    }
    
    private static void demonstrasiPolymorphism() {
        System.out.println("\n=== DEMONSTRASI POLYMORPHISM ===");
        System.out.println("Membuat array dari berbagai bentuk geometri:\n");
        
        BendaGeometri[] bentukGeometri = {
            new Lingkaran(5),
            new Persegi(4),
            new Segitiga(3, 4),
            new Kubus(3)
        };
        
        for (int i = 0; i < bentukGeometri.length; i++) {
            System.out.println("Bentuk " + (i + 1) + ": " + bentukGeometri[i].getClass().getSimpleName());
            System.out.println("- Keliling: " + String.format("%.2f", bentukGeometri[i].hitungKeliling()));
            System.out.println("- Luas: " + String.format("%.2f", bentukGeometri[i].hitungLuas()));
            System.out.println("- Volume: " + String.format("%.2f", bentukGeometri[i].hitungVolume()));
            System.out.println("- Luas Permukaan: " + String.format("%.2f", bentukGeometri[i].hitungLuasPermukaan()));
            System.out.println();
        }
    }
    
    private static void bandingkanBentuk() {
        System.out.println("\n=== BANDINGKAN BENTUK ===");
        System.out.println("Membandingkan persegi dan lingkaran dengan ukuran yang sama:\n");
        
        double ukuran = getInputDouble("Masukkan ukuran (sisi persegi = jari-jari lingkaran): ");
        
        if (ukuran <= 0) {
            System.out.println("Ukuran harus lebih besar dari 0!");
            return;
        }
        
        Persegi persegi = new Persegi(ukuran);
        Lingkaran lingkaran = new Lingkaran(ukuran);
        
        System.out.println("PERSEGI (sisi = " + ukuran + "):");
        System.out.println("- Keliling: " + String.format("%.2f", persegi.hitungKeliling()));
        System.out.println("- Luas: " + String.format("%.2f", persegi.hitungLuas()));
        
        System.out.println("\nLINGKARAN (jari-jari = " + ukuran + "):");
        System.out.println("- Keliling: " + String.format("%.2f", lingkaran.hitungKeliling()));
        System.out.println("- Luas: " + String.format("%.2f", lingkaran.hitungLuas()));
        
        System.out.println("\nPERBANDINGAN:");
        if (persegi.hitungLuas() > lingkaran.hitungLuas()) {
            System.out.println("- Persegi memiliki luas yang lebih besar");
        } else {
            System.out.println("- Lingkaran memiliki luas yang lebih besar");
        }
        
        if (persegi.hitungKeliling() > lingkaran.hitungKeliling()) {
            System.out.println("- Persegi memiliki keliling yang lebih besar");
        } else {
            System.out.println("- Lingkaran memiliki keliling yang lebih besar");
        }
    }
    
    private static void tampilkanHasilPerhitungan(BendaGeometri bentuk, String deskripsi) {
        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Bentuk: " + deskripsi);
        System.out.println("Jenis: " + bentuk.getClass().getSimpleName());
        
        if (bentuk instanceof Geometri2D) {
            System.out.println("Kategori: Bentuk 2D");
        } else {
            System.out.println("Kategori: Bentuk 3D");
        }
        
        System.out.println("\nDetail Perhitungan:");
        System.out.println("- Keliling: " + String.format("%.2f", bentuk.hitungKeliling()));
        System.out.println("- Luas: " + String.format("%.2f", bentuk.hitungLuas()));
        System.out.println("- Volume: " + String.format("%.2f", bentuk.hitungVolume()));
        System.out.println("- Luas Permukaan: " + String.format("%.2f", bentuk.hitungLuasPermukaan()));
    }
    
    private static double getInputDouble(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.print("Input tidak valid! Masukkan angka: ");
            scanner.next();
        }
        double value = scanner.nextDouble();
        scanner.nextLine(); // consume newline
        return value;
    }
    
    private static int getInputInteger(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.print("Input tidak valid! Masukkan angka: ");
            scanner.next();
        }
        int value = scanner.nextInt();
        scanner.nextLine(); // consume newline
        return value;
    }
    
    private static boolean isValidTriangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
    
    private static void clearScreen() {
        // Simple way to create space (works in most terminals)
        for (int i = 0; i < 2; i++) {
            System.out.println();
        }
    }
}