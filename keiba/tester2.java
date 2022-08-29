public class tester2{
  public static void main(String[] args) {
    readDate ans = new readDate();
    ans.loadDate("keiba.txt");
    ans.loadGyaku("memo.txt");
    double[][] z = ans.keisan2();
    double[] a = ans.keisan3(z);
    for (int n = 0; n <= 4; n++) {
        System.out.println("n["+n+"]="+a[n]);
    }
  }
}
