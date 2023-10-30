public class ContohKelas {
    // Atribut (variabel kelas)
    private String nama;
    private int usia;

    // Konstruktor
    public ContohKelas(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }

    // Metode (fungsi kelas)
    public void sapa() {
        System.out.println("Halo, nama saya " + nama + " dan saya berusia " + usia + " tahun.");
    }

    public static void main(String[] args) {
        // Membuat objek dari kelas ContohKelas
        ContohKelas contohObjek = new ContohKelas("John", 25);

        // Memanggil metode pada objek
        contohObjek.sapa();
    }
}

