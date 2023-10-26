import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        String print, back;

        System.out.println("=== UTS PAKTIKUM DASAR PEMROGRAMAN SIB - 1F ===");
        System.out.println("dibuat oleh : ERIKA ATTHACARYA PUTRI CAHYANI");
        System.out.println("NIM : 2341760158");
        System.out.println("===============================================");

        do {
            System.out.println("Pilih menu :\n 1. Data Karyawan\n 2. Gaji Karyawan");
            menu = sc.nextInt();

            if (menu == 1) {
                System.out.println("Masukkan data karyawan");
                System.out.println("");
                System.out.print("Nama : ");
                String nama = sc.next(); //biar bisa input nama
                System.out.print("Alamat : ");
                String alamat = sc.next();
                System.out.print("NoHP : ");
                String noHP = sc.next();
                System.out.print("Golongan (1/2/3) : ");
                int golongan = sc.nextInt();
                System.out.print("Masa Kerja : ");
                int masakrj = sc.nextInt();
                System.out.print("Jumlah Kehadiran : ");
                int jmlkehadiran = sc.nextInt();
                System.out.print("Apakah anda ingin mencetak data karyawan (y/t)?");
                print = sc.next();
                    if (print.equalsIgnoreCase("y")) {
                        System.out.println("==============================");
                        System.out.println("Data Karyawan");
                        System.out.println("==============================");
                        System.out.println("Nama : " + nama);
                        System.out.println("Alamat : " + alamat);
                        System.out.println("NoHP : " + noHP);
                        System.out.println("Golongan : " + golongan);
                        System.out.println("Masa Kerja : " + masakrj);
                        System.out.println("Jumlah Kehadiran : " + jmlkehadiran);
                        System.out.println("Kembali ke menu (y/t)? ");
                        back = sc.next();
                            if (back.equalsIgnoreCase("y")) {
                                continue; //melanjutkan ke menu
                            } else {
                                break; //memberhentikan kode program
                            }
                    } else {
                        System.out.println("Kembali ke menu (y/t)? ");
                        back = sc.next();
                        if (back.equalsIgnoreCase("y")) {
                            continue;
                        } else {
                            break;
                        }
                    }
                } else if (menu == 2) {
                    System.out.println("Gaji Karyawan");
                    System.out.println("Nama : ");
                    String nama = sc.next(); //biar bisa input nama
                    System.out.print("Gaji Pokok : ");
                    int Gajipokok = sc.nextInt();
                    System.out.print("Tunjangan Masa Kerja : ");
                    int tunjanganmasakerja = sc.nextInt();
                    System.out.print("Golongan (1/2/3) : ");
                    int golongan = sc.nextInt();
                    System.out.print("Tunjangan Kehadiran : ");
                    int tunjangankehadiran = sc.nextInt();
                    double totalGaji;
                    totalGaji = Gajipokok+tunjanganmasakerja+tunjangankehadiran;
                    System.out.println("Gaji yang diterima : " + totalGaji);
                    System.out.print("Kembali ke manu utama (y/t)?");
                    back = sc.next();
                    if (back.equalsIgnoreCase("y")) {
                         continue;
                    } else {
                        break;
                    }
                }
            } while (true); //untuk mengembalikan ke menu awal
        }
    }
        