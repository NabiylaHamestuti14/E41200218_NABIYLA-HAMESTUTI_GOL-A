package Tugas_Tambahan;
/**
 *
 * @author Nabiyla Hamestuti
 */
public class Televisi {
    //inisialisasi variabel
    public String des;
    int jumlahChannel;
    private String[] channels = null;
    private int channelAktif;
    private int volume;
    
    //pewarisan 
    
    //menampilkan deskripsi 
    public String getDeskripsi() {
        //mengembalikan nilai variabel des
        return des;
    }
    //menampilkan jumlah channel pada televisi
    public int getJumlahChannel() {
        //mengembalikan nilai variabel jumlah channel
        return jumlahChannel;
    }
    //menampilkan channel yang ada pada televisi
    public String[] getChannels() {
        //pengkondisian
        if (channels == null) {
            System.out.println("Belum ada Channel yang di atur!");
        }
        return channels;
    }
    //mengatur channel yang ada pada televisi
    public void setChannels(String[] channels) {
        //pengkondisian
        if (channels.length > jumlahChannel) {
            System.out.println("Maaf Tv ini hanya dapat menyimpan "+
                    jumlahChannel +" channel");
        } else {    
            this.channels = channels;
            System.out.println("Informasi Channel berhasil diupdate!");
        }
    }
    //menampilkan channel yg aktif pada televisi
    public int getChannelAktif() {
        return channelAktif;
    }
    public void setChannelAktif(int channelAktif) {
        //pengkondisian
        if (channelAktif > channels.length) {
            System.out.println("Channel yang dicari belum diatur!");
            return;
        }
        this.channelAktif = channelAktif;
        System.out.println("Pindah Channel ke : "+ channels[channelAktif]);
    }
    //menampilan volume televisi
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Intensitas volume sekarang : "+ volume);
    }
}