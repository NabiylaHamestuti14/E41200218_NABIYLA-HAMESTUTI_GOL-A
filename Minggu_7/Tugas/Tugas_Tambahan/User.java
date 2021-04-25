package Tugas_Tambahan;
/**
 *
 * @author Nabiyla Hamestuti
 */
public class User {
    public static void main(String[] args) {
       ////Deskripsi : untuk menyimpan nama/ deskripsi dari televisi
       TelevisiModern tv = new TelevisiModern("TV Polytron , 35 inc" ,12);
        
       String [] semuaChannel = {"METRO TV","RCTI","TPI","TRANS TV",
                                 "TRANS 7", "SCTV", "INDOSIAR","ANTV",
                                 "TVRI","BAYU TV","JTV"};
       
        System.out.println("Nabiyla Hamestuti membeli Televisi : "+ tv.getDeskripsi());
        //jumlahChannel : untuk menyimpan banyaknya channel yang dapat disimpan oleh televisi
        //Channels : untuk menyimpan data-data channel stasiun televisi yang sudah di set
        tv.getChannels();
        tv.setChannels(semuaChannel);
        //channelAktif : untuk menyimpan nomor channel yang sedang aktif saat ini
        tv.setChannelAktif(3);
        //Volume : untuk menyimpan informasi besarnya volume televisi yang sedang aktif saat ini
        tv.setVolume(10);
        //channelAktif : untuk menyimpan nomor channel yang sedang aktif saat ini
        tv.setChannelAktif(10);
        tv.setChannelAktif(1);
        //teletext
        tv.setModusTampilan(TelevisiModern.TELETEXT);
        tv.setHalamanTeleText(250); 
        tv.setModusTampilan(TelevisiModern.tv);
        tv.playCD();
        tv.setDiscTray("The Matrix");
        tv.playCD();
    }
}