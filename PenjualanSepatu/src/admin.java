public class admin extends loginuser{
    protected int id_admin;
    protected String Nama;
    protected String Alamat;

    public int getId_admin() {
        return id_admin;
    }

    public void setId_admin(int id_admin) {
        this.id_admin = id_admin;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String alamat) {
        Alamat = alamat;
    }

    @Override
    public void cek() {
        super.cek();
    }

    public void kelolaDataSepatu(){

    }

    public void kelolaDataTransaksi(){

    }
}
