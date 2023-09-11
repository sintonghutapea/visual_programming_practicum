# P01_01. Sistem Manajemen Tugas 

Studi Kasus: Sistem Manajemen Tugas untuk Mata Kuliah Pemrograman

Poppy dan Mabel telah merencanakan pengembangan Sistem Manajemen Tugas (SMT) untuk membantu mereka dan orang lain dalam mengelola tugas-tugas mereka di berbagai mata kuliah, dengan fokus pada mata kuliah pemrograman. Berikut ini adalah rincian studi kasus untuk Sistem Manajemen Tugas ini:

*1. Deskripsi Tugas*
   - Deskripsi Tugas adalah informasi singkat yang mendeskripsikan apa yang menjadi tugasnya. Ini termasuk deskripsi umum tentang apa yang harus dilakukan dalam tugas tersebut.

*2. Kode Mata Kuliah*
   - Kode Mata Kuliah adalah kode unik yang digunakan untuk mengidentifikasi mata kuliah. Contoh: "CS101" untuk mata kuliah Pemrograman Dasar.

*3. Nama Mata Kuliah*
   - Nama Mata Kuliah adalah nama lengkap dari mata kuliah terkait. Contoh: "Pemrograman Dasar".

*4. Pengampu*
   - Pengampu adalah nama dosen yang mengajar mata kuliah tersebut. Contoh: "Dr. John Smith".

*5. Deadline*
   - Deadline adalah waktu batas pengumpulan tugas. Ini dapat berupa tanggal dan jam khusus. Contoh: "20 September 2023, pukul 23.59 WIB".

*6. Format Penamaan Tugas*
   - Format penamaan tugas adalah aturan penamaan file tugas. Dalam kasus ini, format penamaan tugas adalah: "NIM_NAMA_NAMA_MATKUL". Contoh: "12345678_JohnSmith_PemrogramanDasar".

Sistem Manajemen Tugas (SMT) yang dikembangkan oleh Poppy dan Mabel akan memungkinkan mahasiswa dan pengajar untuk:

- Mendaftarkan tugas baru dengan deskripsi, kode mata kuliah, nama mata kuliah, pengampu, dan deadline.
- Menampilkan Tugas Baru dengan deskripsi, kode mata kuliah, nama mata kuliah, pengampu, dan deadline.

Dengan Sistem Manajemen Tugas ini, Poppy dan Mabel berharap dapat membantu mahasiswa dalam mengatur tugas-tugas mereka dengan lebih efisien, terutama dalam mata kuliah pemrograman. Sistem ini juga dapat berguna bagi mahasiswa di mata kuliah lain yang memiliki tugas-tugas yang perlu diorganisir dan diawasi dengan baik.



## Input - Output Simulation (P01)

Tugas berikutnya, kembangkan sebuah solusi sederhana yang secara berturut-turut akan membaca kesepuluh properti buku. Setiap properti baca dalam satu baris masukan. Selanjutnya, tampilkan semua nilai properti yang telah dimasukkan dalam satu baris keluaran. Antara properti yang satu dengan properti lainnya dipisahkan dengan tanda pipe ``|``. Perhatikan dua contoh berikut.

### Example 1

**Input**:
```bash
Buat program sederhana untuk menghitung jumlah bilangan ganjil dalam rentang 1 hingga 100.
12S1102
Pemrograman Visual
Mario E. S. Simaremare, S.Kom., M.Sc.
15 September 2023, pukul 23.59 WIB
12S23004_PoppySibuea_PemrogramanVisual

```



#### Output :
```bash
Buat program sederhana untuk menghitung jumlah bilangan ganjil dalam rentang 1 hingga 100.|12S1102|Pemrograman Visual|Mario E. S. Simaremare, S.Kom., M.Sc.|15 September 2023, pukul 23.59 WIB|12S23004_PoppySibuea_PemrogramanVisual

```


### Example 2

**Input**:
```bash
Lakukan eksperimen sederhana untuk mengukur percepatan gravitasi di permukaan Bumi.
FIS1103
Fisika Dasar
Nenni Mona Aruan, S.Pd., M.Si
18 September 2023, pukul 21.30 WIB
12S23011_MabelChristoffelAS_FisikaDasar

```




**Output**:
```bash
Lakukan eksperimen sederhana untuk mengukur percepatan gravitasi di permukaan Bumi.|FIS1103|Fisika Dasar|Nenni Mona Aruan, S.Pd., M.Si|18 September 2023, pukul 21.30 WIB|12S23011_MabelChristoffelAS_FisikaDasar

```








# P01_02. Pengelolaan Gudang Buku 

Dengan perkembangan usaha penjualan bukunya, Ucok dan Butet memutuskan untuk membangun gudang untuk menyimpan buku-buku yang akan dijual. Mereka perlu suatu program sederhana untuk membantu mereka mengelola informasi di gudang buku tersebut.

Sebuah gudang dapat menyimpan beberapa jenis buku dengan informasi sebagai berikut:

1. Nama Gudang: Nama unik yang digunakan untuk mengidentifikasi gudang tersebut dalam sistem manajemen.
2. Kapasitas Gudang: Konstanta  yang merepresentasikan berapa banyak buku yang dapat disimpan di gudang tersebut.
3. Jumlah Buku Saat Ini: Jumlah total buku atau produk yang saat ini disimpan di gudang
4. AC: Sebuah boolean yang menyatakan apakah gudang dilengkapi dengan AC (yes/no).
5. Lantai: Jenis lantai yang digunakan di gudang (misal: kayu, keramik, beton).
6. Ketersediaan Teknologi  :Informasi tentang teknologi dan peralatan yang digunakan dalam gudang, seperti sistem pelacakan stok otomatis, sistem pencahayaan, dan peralatan material handling.



# Input-Output Simulation

Buatlah program yang akan membaca informasi gudang seperti di atas dan kemudian menampilkan ringkasan informasi tersebut.Antara properti yang satu dengan properti lainnya dipisahkan dengan tanda pipe ```|```. Perhatikan dua contoh berikut.

## Example 1
**Input**:
```bash
Gudang Utama
5000
2300
yes
beton
sistem pelacakan stok otomatis, peralatan material handling

```

## Output

**Output**:
```bash
Informasi Gudang:
Gudang Utama|5000|2300|yes|beton|sistem pelacakan stok otomatis, peralatan material handling

```


## Example 2
**Input**:
```bash
Gudang Cabang
3000
1500
no
kayu
sistem pencahayaan, peralatan material handling

```

## Output

**Output**:
```bash
Informasi Gudang:
Gudang Cabang|3000|1500|1996|no|kayu|sistem pencahayaan, peralatan material handling

```






