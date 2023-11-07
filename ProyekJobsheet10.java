import java.util.Scanner;
public class ProyekJobsheet10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tm, gd;
        long tarif;
        String name, tgl, konfirmasi;
        String namaGd[][] = { 
            {"Gedung Pernikahan",  "900 Orang", "Rp. 90000"},
            {"Gedung Olahraga", "250 Orang", "Rp. 25000"},
            {"Gedung Kesenian", "100 Orang", "Rp. 10000"},
            {"Gedung Auditorium", "500 Orang", "Rp. 50000"}
        };
        while (true) {
            System.out.print("\nApakah Anda ingin memesan gedung (y/t)? ");
            konfirmasi = input.next();
            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.println("GEDUNG YANG TERSEDIA!");
                System.out.printf("%-5s%-20s\n", "No.", "Nama Gedung\t  Maks Tamu\t  Tarif");
                for (int i = 0; i < namaGd.length; i++) {
                    System.out.print((i + 1) + ". ");
                    for (int j=0; j<namaGd[i].length; j++){
                        System.out.print("  "+namaGd[i][j]+"\t");
                    }
                    System.out.println();
                }
                do {
                    System.out.print("\nMasukkan Nomor Gedung yang akan dipesan : ");
                    gd = input.nextInt();
                
                    if (gd < 1 || gd > 4) {
                        System.out.println("Mohon masukkan nomor gedung antara 1 dan 4.");
                    }
                } while (gd < 1 || gd > 4);
                
                switch (gd) {
                    case 1:
                        System.out.print("Masukkan Nama Anda : ");
                        name = input.next();
                        System.out.print("Masukkan Tanggal Acara (DD-MM-YYY) : ");
                        tgl = input.next();
                        System.out.println("Kapasitas Maksimal tamu 900.");
                        System.out.println("Tarif yang harus anda bayar Rp.90000/tamu");
                        System.out.print("Masukkan Jumlah Tamu : ");
                        tm = input.nextInt();
                        tarif = tm * 90000;
                        if (tm <= 900) {
                            System.out.println("\nAtas Nama       : " + name);
                            System.out.println("Nama Gedung     : " + namaGd[0][0]);
                            System.out.println("Tanggal         : " + tgl);
                            System.out.println("Jumlah Tamu     : " + tm);
                            System.out.println("Total Biaya     : Rp." + tarif);
                        } else {
                            System.out.println("Mohon maaf jumlah tamu melebihi kapasitas");
                        }
                        break;
                    case 2:
                        System.out.print("Masukkan Nama Anda : ");
                        name = input.next();
                        System.out.print("Masukkan Tanggal Sewa (DD-MM-YYY): ");
                        tgl = input.next();
                        System.out.println("Kapasitas Maksimal tamu 250.");
                        System.out.println("Tarif yang harus anda bayar Rp.25000/tamu");
                        System.out.print("Masukkan Jumlah Tamu : ");
                        tm = input.nextInt();
                        tarif = tm * 25000;
                        if (tm <= 250) {
                            System.out.println("\nNama Anda       : " + name);
                            System.out.println("Nama Gedung     : " + namaGd[1][0]);
                            System.out.println("Tanggal         : " + tgl);
                            System.out.println("Jumlah Tamu     : " + tm);
                            System.out.println("Total Biaya     : Rp." + tarif);
                        } else {
                            System.out.println("Mohon maaf jumlah tamu melebihi kapasitas");
                        }
                        break;
                    case 3:
                        System.out.print("Masukkan Nama Anda : ");
                        name = input.next();
                        System.out.print("Masukkan Tanggal Sewa (DD-MM-YYY): ");
                        tgl = input.next();
                        System.out.println("Kapasitas Maksimal tamu 100.");
                        System.out.println("Tarif yang harus anda bayar Rp.10000/tamu");
                        System.out.print("Masukkan Jumlah Tamu : ");
                        tm = input.nextInt();
                        tarif = tm * 10000;
                        if (tm <= 100) {
                            System.out.println("\nNama Anda       : " + name);
                            System.out.println("Nama Gedung     : " + namaGd[2][0]);
                            System.out.println("Tanggal         : " + tgl);
                            System.out.println("Jumlah Tamu     : " + tm);
                            System.out.println("Total Biaya     : Rp." + tarif);
                        } else {
                            System.out.println("Mohon maaf jumlah tamu melebihi kapasitas");
                        }
                        break;
                    case 4:
                        System.out.print("Masukkan Nama Anda : ");
                        name = input.next();
                        System.out.print("Masukkan Tanggal Sewa (DD-MM-YYY): ");
                        tgl = input.next();
                        System.out.println("Kapasitas Maksimal tamu 500.");
                        System.out.println("Tarif yang harus anda bayar Rp.50000/tamu");
                        System.out.print("Masukkan Jumlah Tamu : ");
                        tm = input.nextInt();
                        tarif = tm * 50000;

                        if (tm <= 500) {
                            System.out.println("\nNama Anda       : " + name);
                            System.out.println("Nama Gedung     : " + namaGd[3][0]);
                            System.out.println("Tanggal         : " + tgl);
                            System.out.println("Jumlah Tamu     : " + tm);
                            System.out.println("Total Biaya     : Rp." + tarif);
                    } else {
                        System.out.println("Mohon maaf jumlah tamu melebihi kapasitas");
                    }
                    break;
                }
            } else if (konfirmasi.equalsIgnoreCase("t")) {
                System.out.print("Terima kasih! Program Selesai");
                System.exit(0);
            } else {
                System.out.println("Maaf, pilihan anda salah! Silakan ulangi.");
            }
        }
    }
}