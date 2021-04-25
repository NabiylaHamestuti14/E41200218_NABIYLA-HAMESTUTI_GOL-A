package Tugas_Tambahan;
/**
 *
 * @author Nabiyla Hamestuti
 */
public class TelevisiModern extends Televisi {
    //inisialisasi variabel
    public String teletext;
    public String TV;
    public String modusTampilan;
    public String discTray;
    
    public TelevisiModern(String des, int jumlahChannel) {
        this.des = des;
        this.jumlahChannel = jumlahChannel;
    }
    //menampung nilai dari variabel teletext
    static String TELETEXT = "Teletext";
    static String tv = "TV";
    //mengatur modus tampilan yang nilainya diperoleh dari parameter t
    public String setModusTampilan(String t ){
        //pengkondisian
        if( TELETEXT ==t){
            this.TELETEXT = t;
            System.out.println("Modus tampilan : " + this.TELETEXT);
        }
        else if( tv == t){
            this.tv = t;
            System.out.println("Modus tampilan : " + this.tv);
        }
        return "Tidak ada tampilan yang sesuai";
    }
    //tampilan berpindah halaman sesuai parameter teletext
    public void setHalamanTeleText(int teletext){
        System.out.println("Berpindah ke halaman teletext " + teletext);
    }
    //mengembalikan nilai dari variabel teletext
    public String getHalamanTeleText(){
        return this.teletext;
    }
    public void setDiscTray(String discTray){
        this.discTray = discTray;
    }
    //mengembalikan nilai dari variabel discTray
    public String getDiscTray(){
        return this.discTray;
    }
    //menampilkan CD
    public void playCD(){
        //pengkondisian
        if (this.discTray == null ){
            System.out.println("Tidak ada CD di dalam disc tray!");
        } else {       
            System.out.println("Memutar Film " + this.discTray);
        }
    }
    void setHalamanTeletext(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}