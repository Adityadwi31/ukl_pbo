package UKL_PBO;

public class CatatanPeminjaman {

    public static void main(String[] args) {
        Siswa s = new Siswa();
        Petugas p = new Petugas();
        Buku b = new Buku();
        Peminjaman pen = new Peminjaman();
        LaporanPeminjaman l = new LaporanPeminjaman();
        l.laporan(b);
        l.laporan(s);
        l.laporan(p);
        l.laporan(pen, b);
        pen.prosesPeminjaman(s, b, pen);
        l.laporan(pen, b);
        l.laporan(b);
        l.laporan(s);
    }
}
