import java.util.*;
import java.io.*;

class enzan2 {
  double[][] seki(double[][] gyaku, data[] da, int n) {
    double x = 0;double ans[][] = new double[5][n];
    for(int i = 0; i <= 4; i++) {
      for(int j = 0; j <= n-1; j++) {
        x = 0;
        for (int l = 0; l <= 4; l++) {
          switch (l) {
            case 0: x = (double)x + gyaku[i][0]; break;
            case 1: x = x + gyaku[i][1] * da[j].getNum(); break;
            case 2: x = x + gyaku[i][2] * da[j].getHeavy(); break;
            case 3: x = x + gyaku[i][3] * da[j].getName(); break;
            case 4: x = x + gyaku[i][4] * da[j].getWeight(); break;
          }
        }
        ans[i][j] = x;
      }
    }
    return ans;
  }
}

class enzan3 {
  double[] seki(double[][] gyaku,int[] time,int n) {
    double kai[] = new double[5];
    double x;
    for (int i = 0; i<=4;i++) {
      x=0;
      for(int j = 0; j<= n-1;j++) {
        x = x + gyaku[i][j]*time[j];
      }
      kai[i] = x;
    }
    return kai;
  }
}
