public class Main {
    public static void main(String[] args) {
        long toplam = 0;

        // 1'den 20'ye kadar olan sayıları dönüyoruz
        for (int i = 1; i <= 20; i++) {
            // Çift olanları kontrol ediyoruz
            if (i % 2 == 0) {
                long kup = (long) i * i * i;
                toplam += kup;
            }
        }

        // Sonucu ekrana yazdırıyoruz
        System.out.println("1-20 arasindaki cift sayilarin kupleri toplami: " + toplam);
    }
}