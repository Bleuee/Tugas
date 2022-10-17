package pertemuan.pkg5;

import java.util.ArrayList;
import java.util.Scanner;
public class Mahasiswa21G extends Mahasiswa {
    
    Mahasiswa21G(String nim, String nama, int nilai){
        super(nim,nama,nilai);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Mahasiswa> mhs = new ArrayList<>();
                
        for(int i=0;i<=2;i++){
            System.out.print("Isikan NIM:");
            String nim = sc.nextLine();

            System.out.print("Isikan NAMA:");
            String nama = sc.nextLine();

            System.out.print("Isikan NILAI:");
            int nilai = Integer.parseInt(sc.nextLine());

           mhs.add(new Mahasiswa21G(nim,nama,nilai));
           
        }
        
        
        for(int i=0;i<=2;i++){
            mhs.get(i).infoMahasiswa();
        }
        
    }
    
}

