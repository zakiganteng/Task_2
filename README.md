# Task_2 2017
OOP ADF Task 2 2017 : Class and Object Exercise

## Kelas Mahasiswa
* BERIKAN IDENTITAS NIM DAN NAMA DI SETIAP FILE
* Buatlah sebuah Kelas Mahasiswa Berisi 
	* String NIM, 
	* String Nama, 
	* String Status,
	* array char[] Nilai
	* int i (digunakan untuk mengisi array Nilai)
* Lakukan enkapsulasi pada setiap atribut dengan membuatnya private dan memberi setter dan getter
* Tambahkan dua buah konstruktor: 
	* konstruktor default tanpa input parameter
	* konstruktor dengan input parameter nim dan nama
* kedua konstruktor mengeset string status = Tidak Lulus, dan mengeset nilai i = 0
* kedua konstruktor menginstansiasi array Nilai berukuran 10
* Tambahkan method berikut:
	* add Nilai
	``` java
	public void addNilai(char nilai)
	```
	method menerima input karakter nilai dan menambahkannya ke dalam array nilai selama jumlah nilai yang sudah dimasukkan belum 10
	
	* get Nilai
	```java
	public char getNilai(int i)
	```
	method mengembalikan karakter nilai ke-i dari daftar nilai
	
	* to String
	```java
	public String toString()
	```
	method mengembalikan String berisi atribut Mahasiswa dengan format [nim, nama, status, Nilai = x, x, x,]
		
	* cek Nilai
	```java
	public char cekNilai(Mahasiswa m)
	```
	method akan mengecek daftar nilai dirinya terhadap daftar nilai dari objek mahasiswa m.<br>
	method mengembalikan karakter terkecil yang muncul di daftar nilai dari kedua objek.<br>
	contoh: <br>
		- jika daftar nilai objek m1 berisi C,D,B,D,; dan daftar nilai objek m2 berisi A,B,E,C,B,; <br>
		- maka pemanggilan m1.cekNilai(m2) akan mengembalikan karakter 'B'<br>
	method mengembalikan karakter 'X' jika tidak ada karakter yang sama yang ditemukan di kedua daftar<br>
	contoh: <br>
		- jika daftar nilai objek m1 berisi C,D,; dan daftar nilai objek m2 berisi A,B,; <br>
		- maka pemanggilan m1.cekNilai(m2) akan mengembalikan karakter 'X'<br>
* Jalankan kelas Main
