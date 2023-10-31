import java.util.Scanner;

public class BioskopWithScanner04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, next;
        int baris, kolom, umur, menu;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan umur: ");
                    umur = sc.nextInt();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[0].length) {
                        System.out.println("Nomor baris/kolom kursi tidak tersedia");
                        continue;
                    }

                    if (penonton[baris - 1][kolom - 1] != "") {
                        System.out.println("Kursi sudah terisi");
                        System.out.print("Masukkan baris: ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = sc.nextInt();
                        sc.nextLine();
                    }
                    penonton[baris - 1][kolom - 1] = nama;
                    break;

                case 2:
                    for (int i = 0; i < penonton.length; i++) {
                        for (int a = 0; a < penonton[i].length; a++) {
                            if (penonton[i][a] != null) {
                                System.out.println("Penonton di baris " + (i+1) + ", kolom " + (a+1) + ": " + penonton[i][a]);
                            }else {
                                System.out.println("Penonton di baris " + (i+1) + ", kolom " + (a+i) + ": ***");
                            }
                        }
                    }
                    
                break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Menu tidak valid, Silahkan coba lagi");
            }
        }
    }
}