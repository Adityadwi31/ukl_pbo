package UKL_PBO;

import java.util.ArrayList;

public class Siswa implements PERPUS {

    private ArrayList<String> namaSiswa = new ArrayList<String>();
    private ArrayList<String> alamatSiswa = new ArrayList<String>();
    private ArrayList<String> teleponSiswa = new ArrayList<String>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();

    public Siswa() {

        this.namaSiswa.add("Aditya");
        this.alamatSiswa.add("Malang");
        this.teleponSiswa.add("081111111111");
        this.status.add(false);

        this.namaSiswa.add("Haikal");
        this.alamatSiswa.add("Malang");
        this.teleponSiswa.add("081222222222");
        this.status.add(true);

        this.namaSiswa.add("Marsya");
        this.alamatSiswa.add("Malang");
        this.teleponSiswa.add("081333333333");
        this.status.add(true);

        this.namaSiswa.add("Razita");
        this.alamatSiswa.add("Malang");
        this.teleponSiswa.add("081444444444");
        this.status.add(true);

    }

    public void setStatus(boolean status) {
        this.status.add(status);
    }

    public boolean getStatus(int idSiswa) {
        return this.status.get(idSiswa);

    }

    public void editStatus(int idSiswa, boolean status) {
        this.status.set(idSiswa, status);
    }

    public int getJmlhSiswa() {
        return this.status.size();
    }

    @Override
    public void setNama(String namaSiswa) {
        this.namaSiswa.add(namaSiswa);
    }

    @Override
    public void setAlamat(String alamatSiswa) {
        this.alamatSiswa.add(alamatSiswa);
    }

    @Override
    public void setTelepon(String teleponSiswa) {
        this.teleponSiswa.add(teleponSiswa);
    }

    @Override
    public String getNama(int idSiswa) {
        return this.namaSiswa.get(idSiswa);
    }

    @Override
    public String getAlamat(int idSiswa) {
        return this.alamatSiswa.get(idSiswa);
    }

    @Override
    public String getTelepon(int idSiswa) {
        return this.teleponSiswa.get(idSiswa);
    }
}
