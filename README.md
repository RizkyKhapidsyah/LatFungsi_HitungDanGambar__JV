# LatFungsi_HitungDanGambar__JV
Bahan Ajar Fundamental Pemrograman Java: Latihan Menghitung Dan Menggambar Menggunakan Function dan Cara Biasa.<br><br>
<img src="https://github.com/RizkyKhapidsyah/LatFungsi_HitungDanGambar__JV/blob/master/results/001.PNG">
<img src="https://github.com/RizkyKhapidsyah/LatFungsi_HitungDanGambar__JV/blob/master/results/002.PNG">
<img src="https://github.com/RizkyKhapidsyah/LatFungsi_HitungDanGambar__JV/blob/master/results/003.PNG">
<img src="https://github.com/RizkyKhapidsyah/LatFungsi_HitungDanGambar__JV/blob/master/results/004.PNG">
<img src="https://github.com/RizkyKhapidsyah/LatFungsi_HitungDanGambar__JV/blob/master/results/005.PNG">
<img src="https://github.com/RizkyKhapidsyah/LatFungsi_HitungDanGambar__JV/blob/master/results/006.PNG">
<img src="https://github.com/RizkyKhapidsyah/LatFungsi_HitungDanGambar__JV/blob/master/results/007.PNG">
<img src="https://github.com/RizkyKhapidsyah/LatFungsi_HitungDanGambar__JV/blob/master/results/008.PNG">
<img src="https://github.com/RizkyKhapidsyah/LatFungsi_HitungDanGambar__JV/blob/master/results/009.PNG">
<img src="https://github.com/RizkyKhapidsyah/LatFungsi_HitungDanGambar__JV/blob/master/results/010.PNG">
<img src="https://github.com/RizkyKhapidsyah/LatFungsi_HitungDanGambar__JV/blob/master/results/011.PNG">
<img src="https://github.com/RizkyKhapidsyah/LatFungsi_HitungDanGambar__JV/blob/master/results/012.PNG"><br><br>
- Lihat <a href="https://github.com/RizkyKhapidsyah/LatFungsi_HitungDanGambar__JV/tree/master/src/com/rk/lfhdg">Source Code.</a><br><br>

-----

# Menggunakan Prosedur dan Fungsi untuk Membuat Sub-program

## Pengertian Prosedur, Fungsi, dan Method

Prosedur, Fungsi, dan Method itu sama. Prosedur adalah sebutan untuk fungsi yang tidak mengembalikan nilai. Fungsi ini biasanya ditandai dengan kata kunci <code>void</code>. Fungsi adalah sebutan untuk fungsi yang mengembalikan nilai. Method adalah fungsi yang berada di dalam Class. Sebutan ini, biasanya digunakan pada OOP. Untuk memudahkan, mari kita sebut semuanya fungsi.

# Cara Membuat Fungsi di Java

Fungsi harus dibuat atau ditulis di dalam class. Struktur dasarnya seperti ini:

      static TypeDataKembalian namaFungsi(){
          // statemen atau kode fungsi
      }

Penjelasan:

Kata kunci static, artinya kita membuat fungsi yang dapat dipanggil tanpa harus membuat instansiasi objek.

TypeDataKembalian adalah tipe data dari nilai yang dikembalikan setelah fungsi dieksekusi. <code>namaFungsi()</code> adalah nama fungsinya. Biasanya ditulis dengan huruf kecil di awalnya. Lalu, kalau terdapat lebih dari satu suku kata, huruf awal di kata kedua ditulis kapital.

Contoh:

      static void ucapSalam(){
          System.out.println("Selamat Pagi");
      }

Tipe data void artinya kosong, fungsi tersebut tidak mengebalikan nilai apa-apa.

## Cara Memanggil/Eksekusi Fungsi

Setelah kita membuat fungsi, selanjutnya kita akan mengeksekusi fungsinya. Fungsi dapat dipanggil dari fungsi main atau dari fungsi yang lainnya.

Contoh pemanggilan fungsi dalam dalam funsgi main:

      public static void main(String[] args){
          ucapSalam();
      }

Kode lengkapnya, silahkan dicoba sendiri:

      class BelajarFungsi {

          // membuat fungsi ucapSalam()
          static void ucapSalam(){
              System.out.println("Selamat Pagi");
          }

          // membuat fungsi main()
          public static void main(String[] args){
              // memanggil/eksekusi fungsi ucapSalam()
              ucapSalam();
          }
      }

# Fungsi dengan Parameter

Parameter adalah variabel yang menampung nilai untuk diproses di dalam fungsi. Parameter berperan sebagai input untuk fungsi. Struktur dasarnya seperti ini:

      static TipeData namaFungsi(TipeData namaParameter, TipeData namaParameterLain){
          // kode fungsi
      }

Penjelasan:

Parameter ditulis di antara tanda kurung <code>(...)</code>;
Parameter harus diberikan tipe data;
Bila terdapat lebih dari satu parameter, maka dipisah dengan tanda koma.

Contoh fungsi yang memiliki parameter:

      static void ucapin(String ucapan){
          System.out.println(ucapan);
      }

Pada contoh tersebut, kita membuat parameter bernama ucapan dengan tipe String. Sehingga kita bisa menggunakan variabel ucapan di dalam fungsi.

Cara pemanggilan fungsi yang memiliki parameter:

      ucapin("Hallo!");
      ucapin("Selamat datang di pemrograman Java");
      ucapin("Saya kira ini bagian terakhir");
      ucapin("Sampai jumpa lagi, ya!");

# Fungsi yang Mengembalikan Nilai

Setelah fungsi memproses data yang diinputkan melalui parameter, selanjutnya fungsi harus mengembalikan nilai agar dapat diolah pada proses berikutnya. Pengembalian nilai pada fungsi menggunakan kata kunci <code>return</code>.

Contoh:

      static int luasPersegi(int sisi){
          int luas = sisi * sisi;
          return luas;
      }

Pada contoh tersebut, kita membuat sebuah parameter bernama sisi. Kemudian fungsi akan mengembalikan nilai dengan tipe <code>int</code> (integer) dari variabel luas.

Contoh pemanggilanya:

      System.out.println("Luas Persegi dengan panjang sisi 5 adalah " + luasPersegi(5));

# Pemanggilan Fungsi di Fungsi Lain

Fungsi-fungsi dapat saling memanggil untuk memproses data. Contoh, sebuah program Kalkulator Bangun Ruang memiliki fungsi-fungsi: <code>luasPersegi()</code>, <code>luasPersegiPanjang()</code>, <code>luasSegitiga()</code>, <code>luasBalok()</code>, <code>luasKubus()</code> dsb. Fungsi-fungsi tersebut dapat saling membantu, contoh fungsi <code>luasKubus()</code> membutuhkan fungsi <code>luasPersegi()</code>.

Rumus:

Luas Kubus = 6 *  luasPersegi;
Luas Persegi = sisi * sisi;

Maka programnya bisa dibuat seperti ini:

      public class BangunRuang {

          public static void main(String[] args) {
              int s = 12;
              int luas = luasKubus(s);

              System.out.println(luas);
          }

          // membuat fungsi luasPersegi()
          static int luasPersegi(int sisi){
              return sisi * sisi;
          }

          // membuat fungsi luasKubus()
          static int luasKubus(int sisi){

              // memanggil fungsi luasPersegi
              return 6 * luasPersegi(sisi);
          }

      }

## Fungsi Static dan Non-Static

Pada contoh-contoh diatas, kita menggunakan kata kunci static sebelum membuat fungsi. Kata kunci static akan membuat fungsi dapat dieksekusi langsung, tanpa harus membuat instansiasi objek dari class.

Contoh:

      public class FungsiStatic {

          // Fungsi non-static
          void makan(String makanan){
              System.out.println("Hi!");
              System.out.println("Saya sedang makan " + makanan);
          }

          // fungsi static
          static void minum(String minuman){
              System.out.println("Saya sedang minum " + minuman);
          }

          // fungsi main
          public static void main(String[] args) {

              // pemanggilan fungsi static
              minum("Kopi");


              // mambuat instansiasi objek saya dari class FungsiStatic
              FungsiStatic saya = new FungsiStatic();
              // pemanggilan fungsi non-static
              saya.makan("Nasi Goreng");

          }

      }

Pada contoh tersebut, fungsi <code>makan()</code> adalah fungsi non-<code>static</code>. Sedangkan fungsi <code>minum()</code> adalah fungsi <code>static</code>. Apabila kita tidak membuat objek untuk memanggil fungsi non-static, maka akan terjadi error.

# Variabel Global dan Variabel Lokal pada Java

Variabel global adalah variabel yang bisa diakses dari semua fungsi. Sedangkan variabel lokal adalah variabel yang hanya bisa diakses dari dalam fungsi tempat variabel itu berada.

Bingung? Mari kita lihat contohnya:

      class ProgramKu{

          // ini variabel global
          static String nama = "Programku";
          static String version = "1.0.0";

          static void help(){

              // ini variabel lokal
              String nama = "Petani Kode";

              // mengakses variabel global di dalam fungso help()
              System.out.println("Nama: " + nama);
              System.out.println("Versi: " + version);
          }

          public static void main(String args[]){

              // panggil fungsi help()
              help();

              System.out.println("Nama: " + nama);
              System.out.println("Versi: " + version);

          }
      }

Saat pemanggilan fungsi <code>help()</code> kita membuat ulang variabel <code>nama</code>. Sehingga variabel nama menjadi variabel lokal pada fungsi <code>help()</code> dan nilainya berubah menjadi "rikymetalist.blogspot.com". Sedangkan, saat kita akases lagi variabel nama melalui fungsi <code>main()</code> nilainya tetap sama seperti yang didefinisikan.

## Contoh Program dengan Fungsi dan Prosedur

Baiklah, silahkan buat class baru bernama <code>FungsiProsedur</code>. Lalu impor class-class yang dibutuhkan.

      import java.io.BufferedReader;
      import java.io.IOException;
      import java.io.InputStreamReader;
      import java.util.ArrayList;

Setelah itu buat variabel global di dalam class <code>FungsiProsedur</code>:

      static ArrayList listBuah = new ArrayList();
      static boolean isRunning = true;
      static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
      static BufferedReader input = new BufferedReader(inputStreamReader);

Penjelasan:

Variabel <code>listBuah</code> adalah variabel global untuk menyimpan nama-nama buah. Variabel <code>isRunning</code> adalah variabel global untuk membuat loop. Kemudian <code>inputStreamReader</code> dan input adalah objek yang kita butuhkan untuk mengambil input dari keyboard. Setelah itu, buat masing-masing fungsi.

Fungsi untuk menampilkan menu:

      static void showMenu() throws IOException {

          System.out.println("========= MENU ========");
          System.out.println("[1] Show All Buah");
          System.out.println("[2] Insert Buah");
          System.out.println("[3] Edit Buah");
          System.out.println("[4] Delete Buah");
          System.out.println("[5] Exit");
          System.out.print("PILIH MENU> ");

          int selectedMenu = Integer.valueOf(input.readLine());

          switch(selectedMenu){
              case 1:
                  showAllBuah();
                  break;
              case 2:
                  insertBuah();
                  break;
              case 3:
                  editBuah();
                  break;
              case 4:
                  deleteBuah();
                  break;
              case 5:
                  System.exit(0);
                  break;
              default:
                  System.out.println("Pilihan salah!");

          }
      }

Fungsi tersebut bertugas untuk menampilkan menu dan menentukan fungsi mana yang akan dipanggil berdasarkan nomer menu yang diinputkan.

-----

## Apa itu throws IOException?

Nanti saya akan bahas di kesempatan berikutnya. Untuk saat ini diabaikan saja dulu. Ini karena kita menggunakan <code>Buffereader</code>, jadi <code>throws IOException</code> wajib ditulis. Fungsi untuk menampilkan data:

      static void showAllBuah(){
          if(listBuah.isEmpty()){
             System.out.println("Belum ada data");
          } else {
               // tampilkan semua buah
              for(int i = 0; i < listBuah.size(); i++){
                  System.out.println(String.format("[%d] %s",i, listBuah.get(i)));
              }
          }
      }

Fungsi tersebut bertugas menampilkan isi dari <code>listBuah</code>. Kalau <code>listBuah</code> kosong, maka akan ditampilkan pesan <code>"Belum ada data"</code>. Fungsi untuk menambah data buah:

      static void insertBuah() throws IOException{
          System.out.print("Nama buah: ");
          String namaBuah = input.readLine();
          listBuah.add(namaBuah);
      }

Pada fungsi tersebut, kita menggunakan method <code>listBuah.add(namaBuah);</code> untuk menambah data ke dalam <code>listBuah</code> berdasarkan <code>namaBuah</code> yang diberikan.

Fungsi untuk mengubah data buah:

      static void editBuah() throws IOException{
          showAllBuah();
          System.out.print("Pilih nomer buah: ");
          int indexBuah = Integer.valueOf(input.readLine());

          System.out.print("Nama Baru: ");
          String namaBaru = input.readLine();

          // ubah nama buah
          listBuah.set(indexBuah, namaBaru);
      }

Pertama kita perlu tampilkan dulu daftar buahnya, lalu kita minta user untuk memilih buah mana yang akan diedit.
Setelah itu, kita update buahnya dengan method <code>listBuah.set(indexBuah, namaBaru);</code>. 
Fungsi untuk menghapus buah:

      static void deleteBuah() throws IOException{
          showAllBuah();
          System.out.print("Pilih nomer buah: ");
          int indexBuah = Integer.valueOf(input.readLine());
          // hapus buah
          listBuah.remove(indexBuah);
      }

Hampir sama seperti edit buah, untuk menghapus buah kita juga butuh nomer indeks buah yang akan dihapus. Lalu mengapusnya dengan method <code>listBuah.remove(indexBuah);</code>.

Fungsi main:

      public static void main(String[] args) throws IOException {

          do {
              showMenu();
          } while (isRunning);

      }

Lengkap sudah, berikut ini bentuk kode lengkapnya.

      import java.io.BufferedReader;
      import java.io.IOException;
      import java.io.InputStreamReader;
      import java.util.ArrayList;

      public class FungsiProsedur {

          static ArrayList listBuah = new ArrayList();
          static boolean isRunning = true;
          static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
          static BufferedReader input = new BufferedReader(inputStreamReader);

          static void showMenu() throws IOException{

              System.out.println("========= MENU ========");
              System.out.println("[1] Show All Buah");
              System.out.println("[2] Insert Buah");
              System.out.println("[3] Edit Buah");
              System.out.println("[4] Delete Buah");
              System.out.println("[5] Exit");
              System.out.print("PILIH MENU> ");

              int selectedMenu = Integer.valueOf(input.readLine());

              switch(selectedMenu){
                  case 1:
                      showAllBuah();
                      break;
                  case 2:
                      insertBuah();
                      break;
                  case 3:
                      editBuah();
                      break;
                  case 4:
                      deleteBuah();
                      break;
                  case 5:
                      System.exit(0);
                      break;
                  default:
                      System.out.println("Pilihan salah!");

              }


          }

          static void showAllBuah(){
              if(listBuah.isEmpty()){
                 System.out.println("Belum ada data");
              } else {
                   // tampilkan semua buah
                  for(int i = 0; i < listBuah.size(); i++){
                      System.out.println(String.format("[%d] %s",i, listBuah.get(i)));
                  }
              }
          }

          static void insertBuah() throws IOException{
              System.out.print("Nama buah: ");
              String namaBuah = input.readLine();
              listBuah.add(namaBuah);
          }

          static void editBuah() throws IOException{
              showAllBuah();
              System.out.print("Pilih nomer buah: ");
              int indexBuah = Integer.valueOf(input.readLine());

              System.out.print("Nama Baru: ");
              String namaBaru = input.readLine();

              // ubah nama buah
              listBuah.set(indexBuah, namaBaru);
          }

          static void deleteBuah() throws IOException{
              showAllBuah();
              System.out.print("Pilih nomer buah: ");
              int indexBuah = Integer.valueOf(input.readLine());
              // hapus buah
              listBuah.remove(indexBuah);
          }

          public static void main(String[] args) throws IOException {

              do {
                  showMenu();
              } while (isRunning);

          }

      }

# Memahami Kembali 2 Jenis Perulangan dalam Java

Belajar Pemrograman Java: Memahami Dua Jenis Perulangan dalam Java Apa yang akan kita lakukan bila ingin menyuruh komputer mengerjakan perintah yang berulang-ulang? Misalkan kita ingin menyuruh komputer menampilkan teks Petani Kode sebanyak 5x. Maka kita bisa menyuruhnya seperti ini:

      System.out.println("Programmer Go Blog");
      System.out.println("Programmer Go Blog");
      System.out.println("Programmer Go Blog");
      System.out.println("Programmer Go Blog");
      System.out.println("Programmer Go Blog");

Tapi… bagaimana kalau sebanyak 1000x, apa kita akan mampu mengetik kode sebanyak itu? Tentunya tidak. Karena itu, kita harus pakai perulangan. Contoh perulangan:

      for (int hitungan = 0; hitungan <= 1000; hitungan++) {
          System.out.println("Petani Kode");
      }

Sebelum masuk ke pembahasan lebih dalam, ada hal yang harus kalian ketahui terlebih dahulu. Perulangan dalam pemrograman dibagi manjadi dua jenis:

<i> Counted loop: Perulangan yang jumlah pengulangannya terhitung atau tentu.<br> Uncounted loop: Perulangan yang jumlah pengulangannya tidak terhitung atau tidak tentu.</i>

## Mind Map Perulangan

Counted loop terdiri dari perulangan For dan For each. Sedangkan Uncounted loop terdiri dari perulangan <code>While</code> dan <code>Do</code>/<code>While</code>
 
# Counted Loop

Seperti yang sudah dijelaskan, perulangan ini memiliki jumlah pengulangan yang tentu dan terhitung. Perulangan ini terdiri dari perulangan </code>for</code> dan <code>for each</code>. 

## Perulangan For

Format penulisan perulangan For di java adalah sebagai berikut:

      for( int hitungan = 0; hitungan <= 10; hitungan++ ){
          // blok kode yang akan diulang
      }

Penjelasan:

Variabel hitungan tugasnya untuk menyimpan hitungan pengulangan. hitungan <= 10 artinya selama nilai hitungannya lebih kecil atau sama dengan 10, maka pengulangan akan terus dilakukan. Dengan kata lain, perualangan ini akan mengulang sebanyak 10 kali.

<code>hitungan++</code> fungsinya untuk menambah satu (+1) nilai hitungan peda setiap pengulangan.

Blok kode For dimulai dengan tanda ‘<code>{</code>’ dan diakhiri dengan ‘<code>}</code>’.

## Contoh Program Perulangan For

Silahkan buat class baru bernama Bintang, kemudian ikuti kode berikut:

      class Bintang{
          public static void main(String[] args){

              for(int i=0; i <= 5; i++){
                  System.out.println("*****");
              }

          }
      }

Sekarang cobalah buat program untuk menampilkan nilai dari 1 sampai 10 dengan menggunakan perulangan.

      class CetakAngka{

          public static void main(String[] argumen){

              for(int i=0; i <= 10; i++){
                  System.out.print( i + " " );
              }

          }

      }

Buat sebuah program yang menampilkan bilangan ganjil saja.

      class CetakBilanganGanjil{

          public static void main(String[] argumen){
              for(int i = 1; i <= 20; i += 2){
                  System.out.print( i + " ");
              }
          }

      }

Perhatikan: di sana kita menggunakan i += 2, bukan i++. 
Apa maksudnya? Maksudnya, nilai <code>i</code> akan ditambah dua (+2) di setiap pengulangan.

# Perulangan For Each

Perulangan ini sebenarnya digunakan untuk menampilkan isi dari array. Apa itu array? Singkatnya, array itu variabel yang menyimpan lebih dari satu nilai dan memiliki indeks. Perulangan For Each pada Java, dilakukan juga dengan kata kunci <code>For</code>. Contohnya seperti ini:

      for ( int item : dataArray ) {
          // blok kode yang diulang
      }

Penjelasan:

Variabel item akan menyimpan nilai dari array Kita bisa baca seperti ini: “Untuk setiap item dalam <code>dataArray</code>, maka lakukan perulangan”

# Contoh Program For Each

Buat sebuah class baru bernama <code>PerulanganForeach</code>, kemudian ikuti kode berikut.

      public class PerulanganForeach {
          public static void main(String[] args) {

              // membuat array
              int angka[] = {3,1,42,24,12};

              // menggunakan perulangan For each untuk menampilkan angka
              for( int x : angka ){
                  System.out.print(x + " ");
              }

          }
      }

# Uncounted Loop

Seperti yang sudah dijelaskan di awal tadi, perulangan ini tidak jelas jumlah pengulangannya. Tapi, tidak menutup kemungkinan juga, jumlah pengulangannya dapat ditentukan. Perulangan uncounted loop terdiri dari perulangan While dan Do/While.

## Perulangan While

While bisa kita artikan selama. Cara kerja perulangan ini seperti percabangan, ia akan melakukan perulangan selama kondisinya bernilai <code>true</code>. Struktur penulisan perulangan <code>while</code>:

      while ( kondisi ) {
          // blok kode yang akan diulang
      }

Penjelasan:

Kondisi bisa kita isi dengan perbandingan maupun variabel <code>boolean</code>. Kondisi ini hanya memiliki nilai <code>true</code> dan <code>false</code>. Perulangan <code>while</code> akan berhenti sampai kondisi bernilai <code>false</code>. Program ini akan melakukan perulangan selama jawabannya tidak.

      import java.util.Scanner;

      public class PerulanganWhile {
          public static void main(String[] args) {

              // membuat variabel dan scanner
              boolean running = true;
              int counter = 0;
              String jawab;
              Scanner scan = new Scanner(System.in);

              while( running ) {
                  System.out.println("Apakah anda ingin keluar?");
                  System.out.print("Jawab [ya/tidak]> ");

                  jawab = scan.nextLine();

                  // cek jawabnnya, kalau ya maka berhenti mengulang
                  if( jawab.equalsIgnoreCase("ya") ){
                      running = false;
                  }

                  counter++;
              }

              System.out.println("Anda sudah melakukan perulangan sebanyak " + counter + " kali");

          }
      }

Di sana telah dilakukan perulangan sebanyak 4 kali. Bisa saja terjadi 10 kali. Itu targantung dari kondisinya. Kalau nilai variabel running bernilai <code>false</code>, maka perulangan berhenti. Contoh kode <code>while</code> di atas dapat kita baca seperti ini: “Lakukan perulangan selama nilai running bernilai true.” Tidak menutup kemungkinan juga, perulangan ini dapat melakukan counted loop. Contohnya seperti ini:

      int i = 0;

      while ( i <= 10 ){
          // blok kode yang akan diulang
          System.out.println('Perulangan ke-' + i);

          // increment nilai i
          i++;
      }

<i>Penting</i>: pastikan melakukan increment (<code>i++</code>) terhadap variabel counter. Karena kalau tidak, perulangannya akan terus-menerus dilakukan sampai komputernya <b><i>hang</i></b>.

## Perulangan Do/While

Cara kerja perulangan <code>Do</code>/<code>While</code> sebenarnya sama seperti perulangan <code>While</code>. Bedanya, Do/While melakukan satu kali perulangan dulu. Kemudian mengecek kondisinya. Struktur penulisannya seperti ini:

      do {
          // blok kode yang akan diulang
      } while (kondisi);

Jadi kerjakan dulu (<code>Do</code>), baru di cek kondisinya <code>while</code>(<i>kondisi</i>). Kalau kondisi bernilai <code>true</code>, maka lanjutkan perulangan.

Contoh Program dengan Perulangan <code>Do</code>/<code>While</code>

      public class PerulanganDoWhile {
          public static void main(String[] args) {

              // membuat variabel
              int i = 0;

              do {
                  System.out.println("perulangan ke-" + i);
                  i++;
              } while ( i <= 10);

          }
      }

## Perulangan Bersarang (Nested Loop)

Perulangan juga dapat bersarang. Perulangan bersarang maksudnya, perulangan dalam perulangan atau disebut juga nested loop. Contoh Program Perulangan Bersarang

      public class PerulanganBersarang {
          public static void main(String[] args) {

              // membuat variabel
              int x, y;

              // melakukan parulang sebnayan x dan y kali
              for (x = 0; x <= 5; x++){
                  for( y = 0; y <= 3; y++){
                      System.out.format("Perulangan [x=%d, y=%d] %n", x, y);
                  }
              }
          }
      }

P.S:

Perulangan bersarang sering digunakan pada array multi dimensi. Jenis perulangan di dalam perulangn bisa berbeda, misalnya di dalam perulangan <code>while</code> ada perulangan <code>for</code>.





-----
Referensi Artikel:<br>
- <a href="https://www.petanikode.com">PetaniKode</a>. Thanks To: <a href="https://www.petanikode.com">PetaniKode</a>.<br><br>
Referensi Source Code:<br>
<a href="https://www.youtube.com/user/faqihzamukhlish"> Kelas Terbuka </a> dan <a href="https://github.com/kelasterbuka"> Kelas Terbuka (Repository)</a>. Created by <a href="https://github.com/faqihza">Faqihza Mukhlish.</a> Thanks To: <a href="https://www.youtube.com/channel/UCRGHjysoCemh4y7tCJQs30w/about">Faqihza Mukhlish.</a><br>

-----
All Source Code is Modified.
