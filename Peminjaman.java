package UKL_PBO;

import java.util.ArrayList;
import java.util.Scanner;

public class Peminjaman {

    private ArrayList<Integer> idSiswa = new ArrayList<Integer>();
    private ArrayList<Integer> idBuku = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();

    public Peminjaman() {

        this.idSiswa.add(0);
        this.idBuku.add(0);
        this.banyak.add(0);

        this.idSiswa.add(1);
        this.idBuku.add(2);
        this.banyak.add(0);

        this.idSiswa.add(0);
        this.idBuku.add(3);
        this.banyak.add(5);

    }

    public void prosesPeminjaman(Siswa siswa, Buku buku, Peminjaman peminjaman) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan ID Siswa Anda : ");
        int idSiswa = input.nextInt();
        System.out.println("Selamat datang " + siswa.getNama(idSiswa));

        ArrayList<Integer> idBuku = new ArrayList<Integer>();
        ArrayList<Integer> banyak = new ArrayList<Integer>();

        if (siswa.getStatus(idSiswa) == true) {
            int i = 0;
            int temp = 0;
            do {
                System.out.print("Masukkan kode buku :");
                temp = input.nextInt();
                if (temp != 99) {
                    idBuku.add(temp);
                    System.out.print(buku.getNamaBarang(idBuku.get(i)) + " sebanyak : ");
                    banyak.add(input.nextInt());
                    i++;
                }

            } while (temp != 99);

        } else {
            System.out.println("Maaf anda tidak bisa meminjam buku silahkan mengembalikan buku terlebih dahulu sebelum meminjam buku");
        }
        System.out.println();

        System.out.println("Catatatan peminjaman " + siswa.getNama(idSiswa) + " sebagai berikut :");
        System.out.println("Nama Barang \tQty \tHarga \tJumlah \t");

        int total = 0;
        int x = idBuku.size();
        for (int j = 0; j < x; j++) {
            int jumlah = banyak.get(j) * buku.getHarga(idBuku.get(j));
            total += jumlah;
            System.out.println(buku.getNamaBarang(idBuku.get(j)) + "\t"
                    + banyak.get(j) + "\t"
                    + buku.getHarga(idBuku.get(j)) + "\t"
                    + jumlah);
            peminjaman.setPeminjaman(buku, idSiswa, idBuku.get(j), banyak.get(j));
        }

        siswa.editStatus(idSiswa, false);
    }

    public void setPeminjaman(Buku buku, int idSiswa, int idBuku, int banyak) {
        this.idSiswa.add(idSiswa);
        this.idBuku.add(idBuku);
        this.banyak.add(banyak);
        buku.editStok(idBuku, buku.getStok(idBuku) - banyak);
    }

    public int getIdBuku(int id) {
        return this.idBuku.get(id);
    }

    public int getBanyak(int banyak) {
        return this.idBuku.get(banyak);
    }

    public int getIdSiswa(int idSiswa) {
        return this.idBuku.get(idSiswa);
    }

    public int getJmlhPeminjaman() {
        return this.idSiswa.size();
    }

}
