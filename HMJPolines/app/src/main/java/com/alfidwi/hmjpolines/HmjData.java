package com.alfidwi.hmjpolines;

import java.util.ArrayList;

public class HmjData {
    public static String[][] data = new String[][]{
            {"0", "HMJ Elektro", "Himpunan Mahasiswa Elektro Terdiri dari 5 Program Studi yaitu D3 Teknik informatika, " +
                    "D3 Teknik Elektronika, D3 Teknik Listrik, D3 Teknik Telekomunikasi, STr Teknik Telekomunikasi",
                    "https://i.postimg.cc/QxdcLRBk/hme.jpg"},
            //id, name, description
            {"1", "HMJ Mesin", "himpunan Mahasiswa Mesin Terdiri dari 4 Program Studi yaitu D3 Teknik Mesin, " +
                    "D3 Konversi Energi, STr Teknik Pembangkit Energi, STr Teknik Mesin",
                    "https://i.postimg.cc/LsL1BS7R/hmm.jpg"},
            {"2", "HMJ Sipil", "himpunan Mahasiswa Sipil Terdiri dari 4 Program Studi yaitu D3 Konstruksi Sipil, " +
                    "D3 Konstruksi Gedung, STr Perancangan dan Perbaikan Gedung, STr Perancangan Jalan dan Jembatan",
                    "https://i.postimg.cc/yxBXSxYw/hms.jpg"},
            {"3", "HMJ Administrasi Bisnis", "himpunan Mahasiswa Administrasi Bisnis Terdiri dari 4 Program Studi yaitu D3 Administrasi Bisnis, " +
                    "D3 Manajemen Pemasaran, STr Administrasi Bisnis Terapan, STr Manajemen Bisnis Internasional",
                    "https://i.postimg.cc/pLYvD1Z4/hmab.jpg"},
            {"4", "HMJ Akuntansi", "himpunan Mahasiswa Akuntansi Terdiri dari 0 Program Studi yaitu D3 Administrasi Bisnis, " +
                    "D3 Manajemen Pemasaran, STr Administrasi Bisnis Terapan, STr Manajemen Bisnis Internasional",
                    "https://i.postimg.cc/pLYvD1Z4/hmab.jpg"}

    };
    public static ArrayList<Hmj> getListData(){
        ArrayList<Hmj> list = new ArrayList<>();
        for (String[] aData : data){
            Hmj hmj = new Hmj();
            hmj.setId(Integer.parseInt(aData[0]));
            hmj.setName(aData[1]);
            hmj.setDescription(aData[2]);
            hmj.setPhoto(aData[3]);

            list.add(hmj);
        }
        return list;
    }
}
