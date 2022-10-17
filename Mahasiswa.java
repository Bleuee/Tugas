package pertemuan.pkg5;

public class Mahasiswa {
protected String nim,nama,grade;
protected int nilai;

    public Mahasiswa(String nim, String nama, int nilai) {
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
    }
    
    Mahasiswa(){
        
    }

public void setDataMahasiswa(String nim, String nama, int nilai) {
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
}

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getGrade(){
        if(getNilai()>=80 && getNilai()<=100){
            grade="A";
        }
        else if(getNilai()>=70 && getNilai()<=79){
            grade="B";
    }
        else if(getNilai()>=60 && getNilai()<=69){
            grade="C";
        }
        else if(getNilai()>=50 && getNilai()<=59){
            grade="D";
    }
        else if(getNilai()>=0 && getNilai()<=50){
            grade="E";
    }
return grade;
}

    public int getNilai() {
        return nilai;
    }

    public void infoMahasiswa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
