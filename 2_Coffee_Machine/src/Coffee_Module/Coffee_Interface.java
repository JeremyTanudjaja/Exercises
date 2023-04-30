package Coffee_Module;
import java.util.Scanner;

public class Coffee_Interface {
    // Kelas Coffee_Interface merupakan kelas yang berfungsi
    // untuk menangani proses pembuatan, dan pembayaran kopi
    // dengan bantuan kelas Coffee_Maker dan kelas Payment
    // seperti halnya di Main, kita akan menyambungkan
    // kelas ini dengan kelas tersebut


    // Disini kita membuat variabel untuk menyambungkan
    // yaitu Coffee_Maker cm, kita juga membuat variabel
    // Scanner sc untuk user input, dan float price untuk
    // masukin duid yang harus dibayar pelanggan.
    Scanner sc;
    Coffee_Maker cm;
    float price;

    public Coffee_Interface(){
        // ketika Objek dibuat (Objek Coffee_Interface cf yang di main)
        // Objek akan secara otomatis masuk ke method/fungsi ini. Kita
        // bisa menggunakan fungsi ini untuk melakukan setup yang diperlukan
        // yaitu inisialisasi scanner dari variabel sc yang udh kita buat [diatas],
        // inisialisasi cm, dan kita kasih tau agar masuk ke method/function
        // pilihKopi. function atau method pilihKopi berisikan print-print
        // user mau minum kopi apa.
        sc = new Scanner(System.in);
        cm = new Coffee_Maker();
        pilihKopi();
    }

    public void pilihKopi(){
        // cm.availableCoffee();

        // minta user untuk ngasih pilihan mereka
        System.out.println("Mau Pilih kopi apa?");
        System.out.println("[1] Espresso");
        System.out.println("[2] Americano");
        System.out.println("[3] Latte");
        System.out.println("Pilihnya pakai angka langsung 1 2 atau 3");

        //scanner nya udh kita inisialisasi di constructor, kita juga taruh
        //variabelnya sebagai class variabel (di luar fungsi/method) makanya
        //skrng bisa kita pakai di method/fungsi ini atau di method/fungsi lainnya
        String pilihan = sc.nextLine(); //ambil pilihan User dan masukin ke variabel pilihan

        // cek, jika pilihan 1 maka Espresso yang dibuat
        if(pilihan == "1"){
            // cek dulu resource buat bikin espresso ada atau enggak
            // kalau ada, cm.checkespresso akan return true, kalau enggak dia
            // akan return false (dan masuk ke statement else)
            if(cm.checkespresso()){
                // udh kita cek resources, tinggal kita bikin espressonya
                // disini cm.makeespressso akan ngurangin resource kita
                // dan returnnya nominal uang yang harus user bayar.
                // price adalah Class variabel yang kita bikin diatas, jadi bisa
                // dipakai di luar fungsi/method ini. nanti price kita pakai buat
                // sistem pembayaran
                price = cm.makeespresso();
            }else{
                //kalau resourcenya kurang, kita end aja programnya pakai false
                return;
            }


        //penjelasannya sama kyk yang espresso
        } else if (pilihan == "2"){
            if(cm.checkamericano()){
                price = cm.makeamericano();
            }else{
                return;
            }

        } else if (pilihan == "3") {
            // masukin latte

        } else {
            System.out.println("Terima kasih sudah menggunakan sistem kami");
            return;
        }

    }

    public void payment(){

    }



}
