import java.io.File;
import java.io.FileWriter;

public class tester{
  public static void main(String[] args) {
    readData ans= new readData();
    ans.loadData("keiba.txt");
    int[][] z = ans.keisan1();
    double[][] zan = new double[5][5];
    for (int i = 0; i <= 4; i++) {
      for(int j = 0; j<= 4; j++) {
        //System.out.println("z["+i+"]["+j+"]="+z[i][j]);
        zan[i][j] = (double)z[i][j];
      }
    }

    double[][] gyaku = new double[5][5];
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        if (i == j) {
          gyaku[i][j] = 1.;
        }
        else {
          gyaku[i][j] = 0.;
        }
      }
    }
    int flag = 0;
    for (int i = 0; i < 5; i++) {
      if (zan[i][i] == 0) {
        for (int j = i; j < 5; j++) {
          if (zan[j][i] != 0) {
            for (int k = 0; k < 5; k++) {
              double kari;
              kari = (double)zan[i][k];
              zan[i][k] = (double)zan[j][k];
              zan[j][k] = (double)kari;
              kari = (double)gyaku[i][k];
              gyaku[i][k] = (double)gyaku[j][k];
              gyaku[j][k] = kari;
            }
            flag = 1;
            break;
          }
        }
        if (flag == 0) {
          System.out.println("0 error!");
          System.exit(0);
        }
      }

      for (int j = 0; j < 5; j++) {
        if (i != j && zan[j][i] != 0) {
          double kari = (double)zan[j][i] / zan[i][i];
          for (int k = 0; k < 5; k++) {
            zan[j][k] = zan[j][k] - ((double)zan[i][k] * kari);
            gyaku[j][k] = gyaku[j][k] - ((double)gyaku[i][k] * kari);
          }
        }
      }

      if (zan[i][i] != 1) {
        double kari = (double)zan[i][i];
        for (int j = 0; j < 5; j++) {
          zan[i][j] = (double)zan[i][j] / kari;
          gyaku[i][j] = (double)gyaku[i][j] / kari;
        }
      }
    }
    try {
      File file = new File("memo1.txt");
      FileWriter filewriter = new FileWriter(file);
      for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 4; j++) {
          filewriter.write(String.valueOf(gyaku[i][j]) + ",");
        }
        filewriter.write(String.valueOf(gyaku[i][4]) + "\r\n");
      }
      filewriter.close();
    } catch(Exception e) {
    }

    ans.loadGyaku("memo1.txt");
    double[][] kei = ans.keisan2();
    double[] a = ans.keisan3(kei);
    /*for (int n = 0; n <= 4; n++) {
        System.out.println("n["+n+"]="+a[n]);
    }*/
    ans.kotae(a[0],a[1],a[2],a[3],a[4]);
  }
}
