public class testterbangunruang {
    public static void main(String[] args) {

        bangunruang Panjang = new bangunruang();
        bangunruang Lebar = new bangunruang();
        bangunruang Tinggi = new bangunruang();

        Panjang.setPanjang(8);
        Lebar.setLebar(10);
        Tinggi.setTinggi(6);
        
        System.out.println("Panjang Balok: " + Panjang.getPanjang());
        System.out.println("Lebar Balok: " + Lebar.getLebar());
        System.out.println("Tinggi Balok: " + Tinggi.getTinggi());

        System.out.println("Volume Balok: " + Panjang.getPanjang() * Lebar.getLebar() * Tinggi.getTinggi());

    }
}