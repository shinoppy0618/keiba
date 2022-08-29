public class tester1{
  public static void main(String[] args) {
    readDate ans= new readDate();
    ans.loadDate("keiba.txt");
    int[][] z = ans.keisan1();
    for (int i = 0; i <= 4; i++) {
      for(int j = 0; j<= 4; j++) {
        System.out.println("z["+i+"]["+j+"]="+z[i][j]);
      }
    }
  }
}
