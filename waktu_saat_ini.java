import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class waktu_saat_ini {
    public static void main(String[] args) {
        // Membuat format tampilan tanggal dan waktu
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss", new Locale("id", "ID"));
        
        // Mendapatkan tanggal dan waktu saat ini
        Date now = new Date();
        
        // Menampilkan hasil format waktu
        System.out.println("Hari ini adalah hari : " + sdf.format(now));
    }
}
