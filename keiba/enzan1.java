import java.util.*;
import java.io.*;

class enzan1 {
  int[][] seki(data[] da,int n) {
    int x=0; int ans[][] = new int[5][5];
    for(int i = 0;i<=4;i++) {
      if (i==0){
        ans[0][0]=n;
        for (int k = 1; k<= 4; k++) {
          x = 0;
          for(int j = 0; j <= n-1; j++) {
            switch (k) {
              case 1: x = x + da[j].getNum(); break;
              case 2: x = x + da[j].getHeavy(); break;
              case 3: x = x + da[j].getName(); break;
              case 4: x = x + da[j].getWeight(); break;
            }
          }
          ans[0][k]=x;
        }
      }
      else {
        for (int l = 0; l<=4;l++) {
          if(l==0) {
            x = 0;
            for(int m = 0; m <= n-1; m++) {
                switch (i) {
                  case 1: x = x + da[m].getNum(); break;
                  case 2: x = x + da[m].getHeavy(); break;
                  case 3: x = x + da[m].getName(); break;
                  case 4: x = x + da[m].getWeight(); break;
                }
              }
              ans[i][l] = x;
          }
          else {
            x = 0;
            int p = 0; int q= 0;
            for (int r = 0; r <= n-1;r++) {
              switch(i) {
                case 1: p = da[r].getNum(); break;
                case 2: p = da[r].getHeavy(); break;
                case 3: p = da[r].getName(); break;
                case 4: p = da[r].getWeight(); break;
              }
              switch(l) {
                case 1: q = da[r].getNum(); break;
                case 2: q = da[r].getHeavy(); break;
                case 3: q = da[r].getName(); break;
                case 4: q = da[r].getWeight(); break;
              }
              x = x + (p*q);
            }
            ans[i][l] = x;
          }
        }
      }
    }
    return ans;
  }
}
