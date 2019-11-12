package com.alfidwi.idolgroup48;

import java.util.ArrayList;

public class IdolData {
    public static String[][] data = new String[][]{
            {"0", "Ariella Calista Ichwan", "Ariella Calista Ichwan panggilan Ari, Ariel, Eril dari Team J. Lahir di Jakarta pada 12 Mei 2000. Jangan main-main dengan pesona sanguinku! Halo aku Ariel!",
                    "https://i.postimg.cc/v8nLC8Lw/J-ariel.jpg"},
            //id, name, description
            {"1", "Aurel Mayori Putri", "Aurel Mayori Putri panggilan Yori dari Team J. Lahir di Indonesia pada 14 Mei 2006. Si kawaii yang senyumnya selalu available untuk kalian semua! Halo, aku Yori! ",
                    "https://i.postimg.cc/Y9xHnB9c/J-aurel-mayori.jpg"},
            {"2", "Azizi Shafaa Asadel", "Azizi Shafaa Asadel panggilan Zee, Zizi dari Team J. Lahir di Kota Tanggerang, Banten pada 16 Mei 2004. Si gadis tomboi yang semangatnya meletup-letup! Panggil aku Zee!",
                    "https://i.postimg.cc/qBXsLbx8/J-azizi-asadel.jpg"},
            {"3", "Cindy Hapsari Maharani Pujiantoro Putri", "Cindy Hapsari Maharani Pujiantoro Putri panggilan Cindy, Cinhap dari Team J. Lahir di Banyumas pada 13 September 1998. Seanggun aurora di langit malam, aku akan menjadi cahaya untuk kalian semua. Hai, aku Cindy!",
                    "https://i.postimg.cc/QxKXDPY7/J-cindy-hapsari.jpg"},
            {"4", "Eve Antoinette Ichwan", "Eve Antoinette Ichwan panggilan Eve dari Team J. Lahir di Jakarta pada 17 Oktober 2003.Aku ingin membuat lukisan perjalanan yang indah bersama kalian. Aku Eve. ",
                    "https://i.postimg.cc/Y973rJxC/J-eve-antoinette.jpg"},
            {"5", "Gabriela Margareth Warouw", "Gabriela Margareth Warouw panggilan Gaby dari Team J. Lahir di Jakarta pada 11 April 1998. Selalu tersenyum dan mudah tertawa. Aku Gaby.",
                    "https://i.postimg.cc/Ghp4Dd3s/J-gabriella.jpg"},
            {"6", "Aninditha Rahma Cahyadi", "Aninditha Rahma Cahyadi panggilan Anin dari Team K-III. Lahir di Palembang pada 5 Januari 1999. Bagaikan angin yang akan selalu menghembuskan keceriaan pada hari-harimu. Aku Anin.",
                    "https://i.postimg.cc/bYVzKb8s/K-aninditha-rahma-cahyadi.jpg"},
            {"7", "Beby Chaesara Anadila", "Beby Chaesara Anadila panggilan Beby dari Team K-III. Lahir di Bandung pada 18 Maret 1998. I Love You Beby! Beby! Beby!\n" +
                    "Selalu rajin belajar dan berlatih keras! Aku Beby!",
                    "https://i.postimg.cc/0j71M6Mq/K-beby-chaseara-anadila.jpg"},
            {"8","Maria Genoveva Natalia Desy Purnamasari Gunawan","Maria Genoveva Natalia Desy Purnamasari Gunawan panggilan Desy dari Team K-III. Lahir di Yogyakarta pada 25 Desember 1996. Hai, hai, hai, hai. Mempunyai daya tarik yang akan selalu membuat kalian semua penasaran, aku Desy.",
                    "https://i.postimg.cc/0213PbBd/K-maria-genoveva-natalia-desy-purnamasari-gunawan.jpg"},
            {"9","Shani Indira Natio","Shani Indira Natio panggilan Shani dari Team K-III. Lahir di Kebumen pada 5 Oktober 1998. Semanis coklat selembut sutra. Hai, aku Shani."
                    ,"https://i.postimg.cc/Qtr5HZGP/K-shani-indira-natio.jpg"},
            {"10","Shania Gracia","Shania Gracia panggilan Gracie, Gre dari Team K-III. Lahir di Jakarta pada 31 Agustus 1999. Senyumku akan terekam jelas dalam ingatanmu seperti foto dengan sejuta warna. Namaku Gracia, always smile!",
                    "https://i.postimg.cc/V6Y6xfcY/K-shania-gracia.jpg"},
            {"11","Viviyona Apriani","Viviyona Apriani panggilan Yona dari Team K-III. Lahir di Jakarta pada 13 April 1994. Si Pemimpi yang pantang menyerah. Hai, aku Yona.",
                    "https://i.postimg.cc/W4sT35Y8/K-viviyona-apriani.jpg"},
            {"12","Adhisty Zara","Adhisty Zara panggilan Zara, Dhisty, Pipu dari Team T. Lahir di Bandung pada 21 Juni 2003. Selalu berusaha dengan 200% kekuatanku, panggil aku Zara!",
                    "https://i.postimg.cc/522MWXXK/T-adhisty-zara.jpg"},
            {"13","Aninditha Rahma Cahyadi","Aninditha Rahma Cahyadi panggilan Anin dari Team T. Lahir di Palembang pada 5 Januari 1999. Bagaikan angin yang akan selalu menghembuskan keceriaan pada hari-harimu. Aku Anin.",
                    "https://i.postimg.cc/dDMDS8sf/T-aninditha-rahma-cahyadi2.jpg"},
            {"14","Ayana Shahab","Ayana Shahab panggilan Ayana, A-chan dari Team T. Lahir di Osaka, Jepang pada 3 Juni 1997. Meskipun mataku sayu, aku akan selalu menghiburmu. Aku Ayana!",
                    "https://i.postimg.cc/G3vBH5Xw/T-ayana-shahab.jpg"},
            {"15","Hasyakyla Utami Kusumawardhani","Hasyakyla Utami Kusumawardhani panggilan Hasya, Caca, Kyla dari Team T. Lahir di Bandung pada 20 Mei 2002",
                    "https://i.postimg.cc/JnP2qqq1/T-haskyla-utami.jpg"},
            {"16","Jinan Safa Safira","Jinan Safa Safira panggilan Jinan dari Team T. Lahir di Jakarta pada 8 Juni 1999. 1! 2! 3! 4! 5,6,7,8! Hey hey hey! Ayo! Bergerak dengan ceria bersamaku! aku Jinan!",
                    "https://i.postimg.cc/RVsnBnPN/T-jinan-safa-safira.jpg"},
            {"17","Nabila Yussi Fitriana","Nabila Yussi Fitriana panggilan Lala dari Team T. Lahir di Bandar Lampung pada 29 Desember 2000. Tangga nada ke-6 yang diulang 2 kali, yang pemberani dan selalu bersinar. Halo aku Lala.",
                    "https://i.postimg.cc/Mp02B1hG/T-nabila-fitriana.jpg"},
            {"18","Tan Zhi Hui Celine(陈紫薇)","Tan Zhi Hui Celine(陈紫薇) panggilan Celine dari Team T. Lahir di Johor Bahru, Malaysia pada 21 Agustus 2001. Aku ingin menjadi musik yang membuat kalian tersenyum! Hai semua, nama aku Celine!",
                    "https://i.postimg.cc/L4jrwt83/T-tan-zhi-hui-celine.jpg"},
            //{"19", "Alfi Dwi Novitasari", "Alfi", "https://i.postimg.cc/QCvX2q5z/IMG-20190419-112728.jpg"}
    };
    public static ArrayList<Idol> getListData(){
        ArrayList<Idol> list = new ArrayList<>();
        for (String[] aData : data){
            Idol idol = new Idol();
            idol.setId(Integer.parseInt(aData[0]));
            idol.setName(aData[1]);
            idol.setDescription(aData[2]);
            idol.setPhoto(aData[3]);

            list.add(idol);
        }
        return list;
    }
}
