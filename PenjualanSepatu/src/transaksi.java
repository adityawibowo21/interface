public class transaksi extends customer implements sepatu {
    private int kodeBarang;
    private String namaBarang;
    private float harga;

    private int kodeTransaksi;
    private int banyak;
    private String namasepatu;
    private int ukuran;

    //konstruktor
    public transaksi(){}

    //dari kelas parent
    public transaksi(int Id, String nama, String alamat)
    {
        super(Id, nama, alamat);
    }

    public void setTransaksi(int kodeTransaksi, int banyak)
    {
        this.kodeTransaksi = kodeTransaksi;
        this.banyak = banyak;
    }

    //total transaksi = banyaknya barang * harga barang
    public float totalTransaksi()
    {
        return (banyak*harga);
    }

    @Override
    public void setBarang(int kodesepatu, String namasepatu, float harga) {
        this.kodesepatu = kodesepatu;
        this.namasepatu = namasepatu;
        this.harga = harga;
    }

    //output
    public void cetakStruk()
    {
        System.out.println("ID Pembeli      : " + super.getId());
        System.out.println("Nama Pembeli        : " + super.getNama());
        System.out.println("Alamat          : " + super.getAlamat());

        System.out.println("Kode Barang         : " + kodeBarang);
        System.out.println("Nama Barang         : " + namaBarang);
        System.out.println("Harga           : " + harga);

        System.out.println("Kode transaksi      : " + kodeTransaksi);
        System.out.println("Banyak          : " + banyak);

        System.out.println("Total Transaksi     : " + totalTransaksi());
    }

}
