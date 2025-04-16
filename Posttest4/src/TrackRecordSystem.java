import java.util.Scanner;
import model.Criminal;
import model.CriminalRepository;
import model.Officer;
import model.OfficerRepository;

public class TrackRecordSystem {
    static CriminalRepository criminalRepo = new CriminalRepository();
    static OfficerRepository officerRepo = new OfficerRepository();
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n=== Sistem Track Record Criminal Samarinda ===");
            System.out.println("1. Tambah Criminal");
            System.out.println("2. Tampilkan Criminal");
            System.out.println("3. Update Criminal");
            System.out.println("4. Hapus Criminal");
            System.out.println("5. Tambah Petugas");
            System.out.println("6. Tampilkan Petugas");
            System.out.println("7. Exit");
            System.out.print("Pilih menu: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1: addCriminal(); break;
                case 2: showCriminals(); break;
                case 3: updateCriminal(); break;
                case 4: deleteCriminal(); break;
                case 5: addOfficer(); break;
                case 6: showOfficers(); break;
                case 7: System.out.println("Keluar dari program..."); break;
                default: System.out.println("Pilihan tidak valid!");
            }
        } while (choice != 7);
    }
    
    static void addCriminal() {
        System.out.print("Masukkan ID: ");
        String id = scanner.nextLine();
        System.out.print("Masukkan Nama Depan: ");
        String firstName = scanner.nextLine();
        System.out.print("Masukkan Nama Belakang: ");
        String lastName = scanner.nextLine();
        System.out.print("Masukkan Umur: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Masukkan Jenis Kejahatan: ");
        String crimeType = scanner.nextLine();

        Criminal criminal = new Criminal(id, firstName + " " + lastName, age, crimeType);
        criminalRepo.addCriminal(criminal);
        System.out.println("Criminal berhasil ditambahkan.");
    }
    
    static void showCriminals() {
        if (criminalRepo.getAllCriminals().isEmpty()) {
            System.out.println("Tidak ada data criminal.");
            return;
        }
        for (Criminal c : criminalRepo.getAllCriminals()) {
            c.display();
            System.out.println("--------------------------");
        }
    }
    
    static void updateCriminal() {
        System.out.print("Masukkan ID criminal yang ingin diperbarui: ");
        String id = scanner.nextLine();
        Criminal c = criminalRepo.findById(id);
        if (c != null) {
            System.out.print("Masukkan Nama Depan Baru: ");
            String firstName = scanner.nextLine();
            System.out.print("Masukkan Nama Belakang Baru: ");
            String lastName = scanner.nextLine();
            c.setName(firstName, lastName);
            System.out.print("Masukkan Umur Baru: ");
            c.setAge(scanner.nextInt());
            scanner.nextLine();
            System.out.print("Masukkan Jenis Kejahatan Baru: ");
            c.setCrimeType(scanner.nextLine());
            System.out.println("Data criminal berhasil diperbarui.");
        } else {
            System.out.println("Criminal dengan ID tersebut tidak ditemukan.");
        }
    }
    
    static void deleteCriminal() {
        System.out.print("Masukkan ID criminal yang ingin dihapus: ");
        String id = scanner.nextLine();
        criminalRepo.removeCriminal(id);
        System.out.println("Data criminal berhasil dihapus.");
    }
    
    static void addOfficer() {
        System.out.print("Masukkan ID Petugas: ");
        String id = scanner.nextLine();
        System.out.print("Masukkan Nama Depan: ");
        String firstName = scanner.nextLine();
        System.out.print("Masukkan Nama Belakang: ");
        String lastName = scanner.nextLine();
        System.out.print("Masukkan Pangkat: ");
        String rank = scanner.nextLine();

        Officer officer = new Officer(id, firstName + " " + lastName, rank);
        officerRepo.addOfficer(officer);
        System.out.println("Petugas berhasil ditambahkan.");
    }
    
    static void showOfficers() {
        if (officerRepo.getAllOfficers().isEmpty()) {
            System.out.println("Tidak ada data petugas.");
            return;
        }
        for (Officer o : officerRepo.getAllOfficers()) {
            o.display();
            System.out.println("--------------------------");
        }
    }
}
