import java.util.*;
import java.io.*;

class data {
  int num,weight,heavy;
  int name;
  data(int num, int heavy, int name, int weight) {
    this.num=num;
    this.heavy=heavy;
    this.weight=weight;
    this.name = name;
  }

  int getNum() {return num;}
  int getName() {return name;}
  int getWeight() {return weight;}
  int getHeavy() {return heavy;}
}

class readData {
 private data[] list = new data[271];
 private int[] time = new int[271];
 private int y = 0;
 private double[][] gyaku = new double[5][5];
 void loadData(String filename) {
   try {
     BufferedReader reader = new BufferedReader(new FileReader(filename));
     String line; int ti;
     int num, weight, heavy;
     String name; int na;
     String[] sp;
     int i = 0;
     while ((line = reader.readLine())!=null) {
       sp = line.split(",");
       ti = Integer.parseInt(sp[0]);
       num = Integer.parseInt(sp[1]);
       heavy = Integer.parseInt(sp[2]);
       name = sp[3];
       if (name.equals("akiyamashi")) na = 237;
       else if (name.equals("akiyamato")) na = 167;
       else if (name.equals("igarashiyu")) na = 117;
       else if (name.equals("ikezoeke")) na = 267;
       else if (name.equals("ishikawayu")) na = 163;
       else if (name.equals("ishigamishi")) na = 119;
       else if (name.equals("ishibashishi")) na = 208;
       else if (name.equals("izumiyafu")) na = 172;
       else if (name.equals("itouta")) na = 133;
       else if (name.equals("inoueto")) na = 99;
       else if (name.equals("iwatami")) na = 279;
       else if (name.equals("iwataya")) na = 344;
       else if (name.equals("iwabeji")||name.equals("iwabezi")) na = 121;
       else if (name.equals("uenoshi")) na = 116;
       else if (name.equals("uenota")) na = 177;
       else if (name.equals("uchidahi")) na = 288;
       else if (name.equals("edata")) na = 172;
       else if (name.equals("ootsukaka")) na = 96;
       else if (name.equals("ooeharake")) na = 33;
       else if (name.equals("oonota")) na = 194;
       else if (name.equals("oobaka")) na = 95;
       else if (name.equals("okadayo")) na = 102;
       else if (name.equals("oginoki")) na = 168;
       else if (name.equals("oginota")) na = 135;
       else if (name.equals("ozawada")) na = 158;
       else if (name.equals("onoderayu")) na = 77;
       else if (name.equals("katsuurama")) na = 214;
       else if (name.equals("katoushi")) na = 142;
       else if (name.equals("katouta")) na = 116;
       else if (name.equals("kanekomi")) na = 84;
       else if (name.equals("kamedaha")) na = 157;
       else if (name.equals("kawashimashi")) na = 169;
       else if (name.equals("kawasuha")) na = 188;
       else if (name.equals("kawadayu")) na = 374;
       else if (name.equals("kawamatake")) na = 169;
       else if (name.equals("kikuzawaka")) na = 126;
       else if (name.equals("kitazawashi")) na = 221;
       else if (name.equals("kitamurahi")) na = 258;
       else if (name.equals("kitamurayu")) na = 255;
       else if (name.equals("kidoyo")) na = 124;
       else if (name.equals("kusanota")) na = 67;
       else if (name.equals("kumazawashi")) na = 193;
       else if (name.equals("kuroiwayu")) na = 103;
       else if (name.equals("kokubunki")) na = 150;
       else if (name.equals("kokubunyu")) na = 129;
       else if (name.equals("kosakata")) na = 129;
       else if (name.equals("kozakiri")) na = 163;
       else if (name.equals("kobayashishi")) na = 110;
       else if (name.equals("kobayashiri")) na = 101;
       else if (name.equals("komakifu")) na = 232;
       else if (name.equals("kowatai")) na = 114;
       else if (name.equals("kowatata")) na = 161;
       else if (name.equals("kowataha")) na = 111;
       else if (name.equals("saitoua")) na = 180;
       else if (name.equals("sakaima")) na = 152;
       else if (name.equals("sakairi")) na = 205;
       else if (name.equals("sameshimaka")) na = 210;
       else if (name.equals("sameshimari")) na = 163;
       else if (name.equals("shibatada")) na = 169;
       else if (name.equals("shibatami")) na = 121;
       else if (name.equals("shibatayo")) na = 310;
       else if (name.equals("shibayamayu")) na = 188;
       else if (name.equals("shimadaji")) na = 129;
       else if (name.equals("shirahamayu")) na = 116;
       else if (name.equals("sugaharari")) na = 69;
       else if (name.equals("sugawaraa")) na = 210;
       else if (name.equals("sugiharama")) na = 121;
       else if (name.equals("suzukike")) na = 90;
       else if (name.equals("takakurari")) na = 131;
       else if (name.equals("takadaji")) na = 121;
       else if (name.equals("takanoka")) na = 63;
       else if (name.equals("takeyu")) na = 437;
       else if (name.equals("takenoshitato")) na = 141;
       else if (name.equals("tanakaka")) na = 254;
       else if (name.equals("tanakake")) na = 151;
       else if (name.equals("tanabehi")) na = 253;
       else if (name.equals("tamurata")) na = 106;
       else if (name.equals("tannaiyu")) na = 160;
       else if (name.equals("dazaike")) na = 165;
       else if (name.equals("dannota")) na = 229;
       else if (name.equals("tsunodaya")) na = 173;
       else if (name.equals("tsumuraa")) na = 195;
       else if (name.equals("demuro")) na = 416;
       else if (name.equals("tosakike")) na = 366;
       else if (name.equals("tomitaa")) na = 145;
       else if (name.equals("nakaiyu")) na = 153;
       else if (name.equals("nakamurama")) na = 147;
       else if (name.equals("nagaokayo")) na = 105;
       else if (name.equals("nagashimama")) na = 95;
       else if (name.equals("naganota")) na = 151;
       else if (name.equals("nanbayo")) na = 137;
       else if (name.equals("nishiyama")) na = 150;
       else if (name.equals("nishiyari")) na = 129;
       else if (name.equals("nishimuraa")) na = 226;
       else if (name.equals("nishimurata")) na = 113;
       else if (name.equals("nonakayu")) na = 102;
       else if (name.equals("hattorito")) na = 44;
       else if (name.equals("hamanakasu")) na = 308;
       else if (name.equals("harayu")) na = 99;
       else if (name.equals("haradaka")) na = 91;
       else if (name.equals("banke")) na = 72;
       else if (name.equals("hishidayu")) na = 195;
       else if (name.equals("hirasawake")) na = 106;
       else if (name.equals("fukunagayu")) na = 352;
       else if (name.equals("fuziika")) na = 135;
       else if (name.equals("fuziokako")) na = 223;
       else if (name.equals("fuziokayu")) na = 258;
       else if (name.equals("fuzikaketa")) na = 118;
       else if (name.equals("fuzitana")) na = 140;
       else if (name.equals("furukawana")) na = 153;
       else if (name.equals("furukawayo")) na = 177;
       else if (name.equals("bushizawato")) na = 117;
       else if (name.equals("matsuokama")) na = 224;
       else if (name.equals("matsudata")) na = 197;
       else if (name.equals("matsumotohi")) na = 129;
       else if (name.equals("matsuyamako")) na = 244;
       else if (name.equals("matsuwakafu")) na = 199;
       else if (name.equals("matobaha")) na = 132;
       else if (name.equals("mayuzumihi")) na = 120;
       else if (name.equals("marutaki")) na = 180;
       else if (name.equals("maruyamage")) na = 222;
       else if (name.equals("miurako")) na = 274;
       else if (name.equals("mizuguchiyu")) na = 108;
       else if (name.equals("minoshimaya")) na = 140;
       else if (name.equals("miyazakiho")) na = 128;
       else if (name.equals("miyukihi")) na = 233;
       else if (name.equals("mutoumi")) na = 174;
       else if (name.equals("morika")) na = 108;
       else if (name.equals("moriyu")) na = 144;
       else if (name.equals("yamadake")) na = 92;
       else if (name.equals("yokoyamaka")) na = 159;
       else if (name.equals("yokoyamata")) na = 248;
       else if (name.equals("yokoyamano")) na = 363;
       else if (name.equals("yokoyamari")) na = 103;
       else if (name.equals("yoshidaha")) na = 240;
       else if (name.equals("yoshidayu")) na = 227;
       else if (name.equals("rumeru")) na = 481;
       else if (name.equals("wadatsu")) na = 148;
       else if (name.equals("wadari")) na = 238;
       else {na = 0; System.out.println(i +"no data");System.exit(0);}
       weight = Integer.parseInt(sp[4]);
       if(num > 18 || heavy > 57 || heavy < 49 || weight > 650 || weight < 350){
         System.out.println(i +"no data"); System.exit(0);
       }
       list[i] = new data(num,heavy,na,weight);
       time[i] = ti;
       i++;
       y++;
       //System.out.println(num + ", "+ heavy + ", " + na + ", " + weight);
     }
     reader.close();
   } catch (Exception e) {
     System.out.println(e);
   }
 }

 void loadGyaku(String filename) {
   try {
     BufferedReader reader = new BufferedReader(new FileReader(filename));
     String line; String[] sp; int i = 0;
     while ((line = reader.readLine())!=null) {
       sp = line.split(",");
       gyaku[i][0] = Double.parseDouble(sp[0]);
       gyaku[i][1] = Double.parseDouble(sp[1]);
       gyaku[i][2] = Double.parseDouble(sp[2]);
       gyaku[i][3] = Double.parseDouble(sp[3]);
       gyaku[i][4] = Double.parseDouble(sp[4]);
       //System.out.println(gyaku[i][0]+", "+gyaku[i][1]+", "+gyaku[i][2]+", "+gyaku[i][3]+", "+gyaku[i][4]);
       i++;
     }
     reader.close();
   } catch (Exception e) {
     System.out.println(e);
   }
 }

 int[][] keisan1() {
   enzan1 a = new enzan1();
   int[][] x = a.seki(list,y);
   return x;
 }
 double[][] keisan2() {
   enzan2 a2 = new enzan2();
   double[][] a3 = a2.seki(gyaku,list,y);
   return a3;
 }
 double[] keisan3(double[][] z) {
   enzan3 a4 = new enzan3();
   double[] a5 = a4.seki(z,time,y);
   return a5;
 }
 void kotae (double n0, double n1, double n2, double n3, double n4){
    kotae a6 = new kotae();
    a6.seki(n0, n1, n2, n3, n4);
 }
}
