Polymorphism in Java

Polimorfisme dalam Java empat latihan utama yang mencakup inheritance, abstract class, interface, serta perbedaan antara overriding dan overloading. Setiap bagian menunjukkan bagaimana satu referensi dapat merepresentasikan berbagai bentuk objek dan bagaimana Java menentukan method mana yang dijalankan.



Latihan 1 Polimorfisme melalui Inheritance

Tujuan: Memahami runtime polymorphism menggunakan overriding.

Konsep yang ditunjukkan:

Class Animal, Dog, dan Bird

Method speak() di-override oleh subclass

Pemanggilan method secara dinamis berdasarkan objek sebenarnya

Contoh penggunaan instanceof dan casting untuk perilaku khusus seperti fetch()



Latihan 2 Polimorfisme dengan Abstract Class

Tujuan: Menggunakan abstraksi untuk menyatukan perilaku umum.

Konsep yang ditunjukkan:

abstract class Shape

Implementasi Circle dan Rectangle

Pemanggilan area() secara polimorfik melalui List<Shape>

Kode berjalan pada level abstraksi tanpa mengetahui tipe konkret



Latihan 3  Polimorfisme dengan Interface

Tujuan: Menunjukkan fleksibilitas desain melalui interface.

Konsep yang ditunjukkan:

Interface Payable

Implementasi Employee (gaji tetap) dan Contractor (dibayar per jam)

Penggunaan List<Payable> untuk menyatukan berbagai tipe objek dalam sistem pembayaran

Desain berbasis kontrak yang stabil terhadap perubahan struktur class



Latihan 4  Overriding vs Overloading

Tujuan: Memahami perbedaan mekanisme runtime dan compile-time.

Konsep yang ditunjukkan:

Overriding terjadi ketika subclass menyediakan implementasi baru dari method superclass

Overloading bergantung pada parameter dan diputuskan saat compile-time

Kasus penting:

Base b = new Sub();
b.f(10); 


Pemanggilan di atas mengeksekusi Base.f(Number) karena method di Sub adalah overloading, bukan overriding.

Konsep Utama yang Diperkuat
1. Runtime Polymorphism (Overriding)
Animal a = new Dog();
a.speak(); // memanggil implementasi Dog

2. Compile-Time Resolution (Overloading)

Pemilihan method ditentukan berdasarkan parameter saat kompilasi.

3. Polimorfisme dalam Koleksi
List<Animal> list = List.of(new Dog(), new Bird());
for (Animal a : list) a.speak();

4. Casting dan instanceof

Digunakan saat membutuhkan perilaku khusus subclass.

if (a instanceof Dog) ((Dog) a).fetch();

5. Interface & Desain Abstraksi

Interface seperti Payable memungkinkan pembuatan kode yang fleksibel dan stabil terhadap perubahan struktur class.
