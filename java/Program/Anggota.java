public class Anggota{
    // private attributes
    private String id;
    private String nama;
    private String bidang;
    private String partai;

    // construtctor
    public Anggota(){
        this.id = "";
        this.nama = "";
        this.bidang = "";
        this.partai = "";
    }

    public Anggota(String id, String nama, String bidang, String partai){
        this.id = id;
        this.nama = nama;
        this.bidang = bidang;
        this.partai = partai;
    }

    // setter and getter
    public String getId(){
        return this.id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getNama(){
        return this.nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getBidang(){
        return this.bidang;
    }

    public void setBidang(String bidang){
        this.bidang = bidang;
    }

    public String getPartai(){
        return this.partai;
    }

    public void setPartai(String partai){
        this.partai = partai;
    }
}