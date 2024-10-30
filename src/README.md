# Penghitung Nilai Akhir

Program Java ini menghitung nilai akhir mata kuliah berdasarkan tiga nilai: tugas, UTS, dan UAS. Setiap nilai memiliki bobot tertentu yang berkontribusi pada nilai akhir. Program ini kemudian menampilkan nilai akhir dan grade huruf yang setara berdasarkan nilai tersebut.

## Fitur

- *Validasi Input*: Memastikan input nilai berada dalam rentang 0 hingga 100. Jika input tidak valid atau bukan angka, pengguna akan diminta untuk memasukkan ulang.
- *Sistem Grading*: Menetapkan grade huruf berdasarkan nilai akhir:
    - A untuk nilai ≥ 85
    - B untuk nilai ≥ 70
    - C untuk nilai ≥ 60
    - D untuk nilai ≥ 50
    - E untuk nilai di bawah 50

## Struktur Kode

### Konstanta

- BOBOT_UAS: Bobot nilai UAS, ditetapkan sebesar 0.4.
- BOBOT_UTS: Bobot nilai UTS, ditetapkan sebesar 0.3.
- BOBOT_TUGAS: Bobot nilai tugas, ditetapkan sebesar 0.3.

### Metode

- **main**: Metode utama program. Mengumpulkan input, menghitung nilai akhir, dan menampilkan grade akhir.
- **displayNilaiAkhir**: Menerima nilai akhir, menampilkannya, dan mencetak grade huruf berdasarkan nilai tersebut.
- **hitungNilaiAkhir**: Menghitung nilai akhir berdasarkan bobot nilai.
- **inputNilai**: Mengumpulkan dan memvalidasi input untuk setiap jenis nilai (tugas, UTS, dan UAS).

## Cara Penggunaan

1. Kompilasi program:

   ```bash
   javac PenghitungNilaiAkhir.java