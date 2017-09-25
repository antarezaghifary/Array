public class Testarraydua {
int nis[][] = {{210651},{210651},{210652}};
String nama[][] = {{"Rizvan Dimas"},{"NurAzmi"},{"Devita Fahma"}};

public void tampil(){
    System.out.println("Identitas Siswa Angkatan 24");
}
public void namanis(){
  for (int i = 0; i< 3; i++){
    for (int j = 0; j< 1; j++){
        System.out.println(nama[i][j]+":"+nis[i][j]);
  }
 }
}
// KUDU MAINE MEK SIJI
public static void main (String[]args){
Testarraydua siswa = new Testarraydua();
siswa.tampil();
siswa.namanis();
 }
}


