/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mc2110010063;
import sensus.*;
import java.util.Date;
import dataset.*;
import forms.*;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        //menampilkan constructor overload pada setiap class
//        
//        //membuat object dari class pasien ( object : Pasien)
//        pasien Pasien = new pasien(80, "maira", "bjm", "perempuan", new Date(103,3,22), "islam", "mahasiswa", "088245880823", "masuk");
//    
//        //membuat object dari class bangsal ( object : Bangsal)
//        bangsal Bangsal = new bangsal(6, "mawar", "1", 5);
//    
//        //membuat object dari class diagnosa ( object : Diagnosa)
//        diagnosa Diagnosa = new diagnosa(4, "Maag");
//
//        //membuat object dari class transaksiPasienMasuk ( object : Masuk)
//        transaksiPasienMasuk Masuk = new transaksiPasienMasuk(1, 80, new Date(), 4, 6, "masuk");
//
//        //membuat object dari class transaksiPasienPindah ( object : Pindah)
//        transaksiPasienPindah Pindah = new transaksiPasienPindah(2, 80, new Date(), 4, 7, "pindah"); 
//       
//        //membuat object dari class login ( object : Login)
//        login Login = new login("mairanhz", "8894", "maira", "pasien");
//        
//        
//        // Menampilkan data pada objek(method overload)      
//        Pasien.tampilkanDataPasien();       
//        Bangsal.tampilkanInfoBangsal();      
//        Diagnosa.tampilkanInfoDiagnosa();    
//        Masuk.tampilkanPasienMasuk();   
//        Pindah.tampilkanPasienPindah();
//        Login.tampilkanLogin(); 
          
//        datasetBangsal bangsal = new datasetBangsal();
//           
//            bangsal.insertKdBang(6);
//            bangsal.insertNmBang("Maira");
//            bangsal.insertKelasBang("1");
//            bangsal.insertJumlahBang(7);
//                
//                System.out.println("DATASET BANGSAL");
//                System.out.println("-------------------------");
//                System.out.println("Kode Bangsal : "+bangsal.getRecordKdBang());
//                System.out.println("Nama Bangsal : "+bangsal.getRecordNmBang());
//                System.out.println("Kelas Bangsal : "+bangsal.getRecordKelasBang());
//                System.out.println("Jumlah Bangsal : "+bangsal.getRecordJumlahBang());  
//                System.out.println("-------------------------");
//                
//        datasetDiagnosa diagnosa = new datasetDiagnosa();
//           
//            diagnosa.insertKdDiag(8);
//            diagnosa.insertNmDiag("Cacar");
//                
//                System.out.println("DATASET DIAGNOSA");
//                System.out.println("-------------------------");
//                System.out.println("Kode Diagnosa : "+diagnosa.getRecordKdDiag());
//                System.out.println("Nama Diagnosa : "+diagnosa.getRecordNmDiag()); 
//                System.out.println("-------------------------");
//          
//        datasetLogin login = new datasetLogin();
//           
//            login.insertUsername("Maira");
//            login.insertPassword("1485");
//            login.insertNama("Humaira Nurhaliza");
//            login.insertLevel("pasien");
//                
//                System.out.println("DATASET LOGIN");
//                System.out.println("-------------------------");
//                System.out.println("Username : "+login.getRecordUsername());
//                System.out.println("Password : "+login.getRecordPassword());
//                System.out.println("Nama :"+login.getRecordNama());
//                System.out.println("Level :"+login.getRecordLevel()); 
//                System.out.println("-------------------------");
//          
//        datasetPasien pasien = new datasetPasien();
//           
//            pasien.insertNoRM(1);
//            pasien.insertNmPasien("Humaira Nurhaliza");
//            pasien.insertAlamat("Banjarmasin");
//            pasien.insertJk("Perempuan");
//            pasien.insertTglLahir(new Date(103,3,22));
//            pasien.insertAgama("Islam");
//            pasien.insertPekerjaan("Mahasiswa");
//            pasien.insertNoTelp("+62 882 4588 0823");
//            pasien.insertJenisPas("Pasien Masuk");
//                
//                System.out.println("DATASET PASIEN");
//                System.out.println("-------------------------");
//                System.out.println("No RM : "+pasien.getRecordNoRM());
//                System.out.println("Nama Pasien : "+pasien.getRecordNmPasien());
//                System.out.println("Alamat : "+pasien.getRecordAlamat());
//                System.out.println("Jenis Kelamin : "+pasien.getRecordJk()); 
//                System.out.println("Tanggal Lahir : "+pasien.getRecordTglLahir());
//                System.out.println("Agama : "+pasien.getRecordAgama());
//                System.out.println("Pekerjaan : "+pasien.getRecordPekerjaan());
//                System.out.println("No Telp : "+pasien.getRecordNoTelp()); 
//                System.out.println("Jenis Pasien : "+pasien.getRecordJenisPas()); 
//                System.out.println("-------------------------");
//          
//        datasetTransaksiPasienMasuk masuk = new datasetTransaksiPasienMasuk();
//           
//            masuk.insertNoReg(1);
//            masuk.insertNoRM(1);
//            masuk.insertTglMasuk(new Date());
//            masuk.insertKdDiag(1);
//            masuk.insertKdBang(1);
//            masuk.insertStatus("Pasien Masuk");
//                
//                System.out.println("DATASET PASIEN");
//                System.out.println("-------------------------");
//                System.out.println("No Reg : "+masuk.getRecordNoReg());
//                System.out.println("No RM : "+masuk.getRecordNoRM());
//                System.out.println("Tanggal Masuk : "+masuk.getRecordTglMasuk());
//                System.out.println("Kode Diagnosa : "+masuk.getRecordKdDiag());
//                System.out.println("Kode Bangsal : "+masuk.getRecordKdBang());
//                System.out.println("Status : "+masuk.getRecordStatus()); 
//                System.out.println("-------------------------");
//          
//        datasetTransaksiPasienPindah pindah = new datasetTransaksiPasienPindah();
//           
//            pindah.insertNoRegP(1);
//            pindah.insertNoRM(1);
//            pindah.insertTglPindah(new Date());
//            pindah.insertKdDiag(1);
//            pindah.insertKdBang(1);
//            pindah.insertStatus("Pasien Pindah");
//                
//                System.out.println("DATASET PASIEN");
//                System.out.println("-------------------------");
//                System.out.println("No Reg : "+pindah.getRecordNoRegP());
//                System.out.println("No RM : "+pindah.getRecordNoRM());
//                System.out.println("Tanggal Pindah : "+pindah.getRecordTglPindah());
//                System.out.println("Kode Diagnosa : "+pindah.getRecordKdDiag());
//                System.out.println("Kode Bangsal : "+pindah.getRecordKdBang());
//                System.out.println("Status : "+pindah.getRecordStatus()); 
//                System.out.println("-------------------------");

    new frameUtama().setVisible(true);
    }
    
}
