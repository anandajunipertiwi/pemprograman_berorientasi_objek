public class Student {
     // Variabel instance untuk nama, kredit, ipk, dan pointKualitas

     private String nama;
     private char kredit;
     private double ipk;
     private double pointKualitas;
 
     // Konstruktor untuk menginisialisasi objek Student
     public Student(String n, char k, double i) {
         nama = n;
         kredit = k;
         ipk = i;
         pointKualitas = hitungPointKualitas(); // Menghitung point kualitas saat objek dibuat

     }
 
     // Metode untuk menghitung point kualitas
     private double hitungPointKualitas() {
         double point = 0.0;
         switch (kredit) {
             case 'A':
                 point = 4.0;
                 break;
             case 'B':
                 point = 3.0;
                 break;
             case 'C':
                 point = 2.0;
                 break;
             case 'D':
                 point = 1.0;
                 break;
             default:
                 point = 0.0;
                 break;
         }
         return point * ipk;
     }

     
     // Metode untuk memasukkan kredit dan mengupdate kredit, point kualitas, dan ipk
     public void setKredit(char kredit, double ipk) {
         this.kredit = kredit;
         this.ipk = ipk;
         this.pointKualitas = hitungPointKualitas(); // Mengupdate point kualitas setelah input kredit
     }
 
     // Getter untuk point kualitas
     public double getPointKualitas() {
         return pointKualitas;
     }
 }
    

