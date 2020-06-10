package sample;

public class User {
    private String nama;
    private int usia;

    public User(String nama, int usia){
        this.nama = nama;
        this.usia = usia;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public String getNama() {
        return nama;
    }

    public int getUsia() {
        return usia;
    }
}
