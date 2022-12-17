public class customer extends loginuser{
    private int Id;
    protected String Nama;
    protected String Alamat;
    protected String email;

    public customer(int Id, String nama, String alamat) {
        this.Id = Id;
        Nama = nama;
        Alamat = alamat;
        this.email = this.email;
    }

    public customer() {

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void cek() {
        super.cek();
    }

    public void pilihSepatu() {
        switch ((int) kodesepatu) {
            case 1:
                String namasepatu = "Adidas";
                int ukuran = 41;
                int harga = 630000;
                System.out.println("Pesanan anda sedang diproses :)");
                break;
            case 2:
                namasepatu = "Nike";
                ukuran = 40;
                harga = 640000;
                System.out.println("Pesanan anda sedang diproses :)");
                break;
            case 3:
                namasepatu = "Converse";
                ukuran = 39;
                harga = 549000;
                System.out.println("Pesanan anda sedang diproses :)");
                break;
            case 4:
                namasepatu = "Vans";
                ukuran = 42;
                harga = 560000;
                System.out.println("Pesanan anda sedang diproses :)");
                break;
        }
    }

    public void Transaksi(){

    }
}
