public class TesterStudent {
    public static void main(String[] args) {
        // Membuat objek Student
        Student student = new Student("ananda", 'A', 3.5);

        //menampilkan data diri
        System.out.println("Nama: Ananda Juni Pertiwi");
        System.out.println("Prodi: Manajemen Informatika");
        System.out.println("Jurusan: Ekonomi dan Bisnis");

        // Menampilkan point kualitas awal
        System.out.println("Point Kualitas Awal: " + student.getPointKualitas());

        // Memasukkan kredit dan mengupdate informasi menggunakan setter
        student.setKredit('B', 3.2);

        // Menampilkan point kualitas setelah perubahan mengguankan getter
        System.out.println("Point Kualitas Setelah Perubahan: " + student.getPointKualitas());
    }
}

