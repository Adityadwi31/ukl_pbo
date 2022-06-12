package UKL_PBO;

import java.util.ArrayList;

public class Petugas implements PERPUS {

    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamatPetugas = new ArrayList<String>();
    private ArrayList<String> teleponPetugas = new ArrayList<String>();
    private ArrayList<Integer> idPetugas = new ArrayList<Integer>();

    public Petugas() {
        this.namaPetugas.add("Om A");
        this.alamatPetugas.add("Malang");
        this.teleponPetugas.add("081111111111");

        this.namaPetugas.add("Om B");
        this.alamatPetugas.add("Batu");
        this.teleponPetugas.add("081222222222");

        this.namaPetugas.add("Om C");
        this.alamatPetugas.add("Batu");
        this.teleponPetugas.add("081333333333");

        this.namaPetugas.add("Om D");
        this.alamatPetugas.add("Gresik");
        this.teleponPetugas.add("081444444444");

    }

    public void setId(int IdPetugas) {
        this.idPetugas.add(IdPetugas);
    }

    public int getId(int id) {
        return this.idPetugas.get(id);
    }

    public int getJmlPetugas() {
        return this.namaPetugas.size();

    }

    @Override
    public void setNama(String namaPetugas) {
        this.namaPetugas.add(namaPetugas);
    }

    @Override
    public void setAlamat(String alamatPetugas) {
        this.alamatPetugas.add(alamatPetugas);
    }

    @Override
    public void setTelepon(String teleponpetugas) {
        this.teleponPetugas.add(teleponpetugas);
    }

    @Override
    public String getNama(int idPetugas) {
        return this.namaPetugas.get(idPetugas);
    }

    @Override
    public String getAlamat(int idPetugas) {
        return this.alamatPetugas.get(idPetugas);
    }

    @Override

    public String getTelepon(int idPetugas) {
        return this.teleponPetugas.get(idPetugas);
    }

}
