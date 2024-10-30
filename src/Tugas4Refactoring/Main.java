package Tugas4Refactoring;

import java.util.ArrayList;
import java.util.List;

/**
 * Antarmuka untuk mendefinisikan hewan yang bisa diberi makan.
 */
interface DapatDiberiMakan {
    /**
     * Metode untuk memberi makan hewan.
     */
    void beriMakan();
}

/**
 * Kelas yang merepresentasikan sebuah peternakan yang dapat menampung dan
 * memberi makan hewan.
 */
class Peternakan {
    private List<DapatDiberiMakan> hewanList;

    /**
     * Konstruktor untuk membuat peternakan baru.
     * Inisialisasi daftar hewan yang dapat diberi makan.
     */
    public Peternakan() {
        hewanList = new ArrayList<>();
    }

    /**
     * Menambah hewan ke dalam daftar peternakan.
     *
     * @param hewan Objek hewan yang dapat diberi makan.
     */
    public void tambahHewan(DapatDiberiMakan hewan) {
        hewanList.add(hewan);
    }

    /**
     * Menampilkan semua hewan yang ada di dalam peternakan.
     */
    public void tampilkanHewan() {
        for (DapatDiberiMakan hewan : hewanList) {
            System.out.println(hewan);
        }
    }

    /**
     * Memberi makan semua hewan yang ada di dalam peternakan.
     */
    public void beriMakanHewan() {
        for (DapatDiberiMakan hewan : hewanList) {
            hewan.beriMakan();
        }
    }

    /**
     * Metode utama untuk menjalankan program.
     *
     * @param args Argumen dari baris perintah.
     */
    public static void main(String[] args) {
        Peternakan peternakan = new Peternakan();
        peternakan.tambahHewan(new Anjing("Bobby"));
        peternakan.tambahHewan(new Kucing("Mittens"));
        peternakan.tampilkanHewan();
        peternakan.beriMakanHewan();
    }
}

/**
 * Kelas abstrak yang merepresentasikan hewan.
 * Setiap hewan memiliki nama dan dapat diberi makan.
 */
class Hewan implements DapatDiberiMakan {
    private String nama;

    /**
     * Konstruktor untuk membuat hewan dengan nama tertentu.
     *
     * @param nama Nama hewan.
     */
    public Hewan(String nama) {
        this.nama = nama;
    }

    /**
     * Mengembalikan nama hewan.
     *
     * @return Nama hewan.
     */
    public String getNama() {
        return nama;
    }

    /**
     * Memberi makan hewan dengan mencetak pesan ke konsol.
     */
    @Override
    public void beriMakan() {
        System.out.println("Memberi makan " + nama);
    }

    /**
     * Mengembalikan representasi string dari hewan.
     *
     * @return String yang merepresentasikan hewan.
     */
    @Override
    public String toString() {
        return "Nama Hewan: " + nama;
    }
}

/**
 * Kelas yang merepresentasikan hewan jenis anjing.
 */
class Anjing extends Hewan {
    /**
     * Konstruktor untuk membuat anjing dengan nama tertentu.
     *
     * @param nama Nama anjing.
     */
    public Anjing(String nama) {
        super(nama);
    }

    /**
     * Mengembalikan representasi string dari anjing.
     *
     * @return String yang merepresentasikan anjing.
     */
    @Override
    public String toString() {
        return super.toString() + ", Jenis: Anjing";
    }
}

/**
 * Kelas yang merepresentasikan hewan jenis kucing.
 */
class Kucing extends Hewan {
    /**
     * Konstruktor untuk membuat kucing dengan nama tertentu.
     *
     * @param nama Nama kucing.
     */
    public Kucing(String nama) {
        super(nama);
    }

    /**
     * Mengembalikan representasi string dari kucing.
     *
     * @return String yang merepresentasikan kucing.
     */
    @Override
    public String toString() {
        return super.toString() + ", Jenis: Kucing";
    }
}
