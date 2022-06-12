package UKL_PBO;

public class LaporanPeminjaman {

    public void laporan(Buku buku) {
        int x = buku.getJmlBuku();

        System.out.println();
        System.out.println("Tabel Buku");
        System.out.println();
        System.out.println("Nama Buku \tStok \tHarga");
        for (int i = 0; i < x; i++) {
            System.out.println(buku.getNamaBarang(i) + "\t" + buku.getStok(i) + "\t" + buku.getHarga(i));
        }
    }

    public void laporan(Siswa siswa) {
        int x = siswa.getJmlhSiswa();

        System.out.println();
        System.out.println("Tabel Siswa");
        System.out.println();
        System.out.println("Nama \tAlamat \tTelepon \tStatus");
        for (int i = 0; i < x; i++) {
            System.out.println(siswa.getNama(i) + "\t" + siswa.getAlamat(i) + "\t" + siswa.getTelepon(i) + "\t" + siswa.getStatus(i));
        }
    }
    public void laporan(Petugas petugas) {
        int x = petugas.getJmlPetugas();

        System.out.println();
        System.out.println("Tabel Petugas");
        System.out.println();
        System.out.println("Nama \tAlamat \tTelepon ");
        for (int i = 0; i < x; i++) {
            System.out.println(petugas.getNama(i) + "\t" + petugas.getAlamat(i) + "\t" + petugas.getTelepon(i) + "\t" );
        }
    }

    public void laporan(Peminjaman peminjaman, Buku buku) {
        int x = peminjaman.getJmlhPeminjaman();

        System.out.println();
        System.out.println("Laporan Peminjaman");
        System.out.println();
        System.out.println("Nama Barang\tQty \tHarga \tJumlah");

        int total = 0;
        for (int i = 0; i < x; i++) {
            int jumlah = peminjaman.getBanyak(i) * buku.getHarga(peminjaman.getIdBuku(i));
            total += jumlah;
            System.out.println(buku.getNamaBarang(peminjaman.getIdBuku(i)) + "\t"
                    + peminjaman.getBanyak(i) + "\t" + buku.getHarga(peminjaman.getIdBuku(i)) + "\t"
                    + jumlah);
            
        }
        System.out.println("Total Omset = " + total);
    }

}


