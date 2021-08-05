//標準入力とループ処理
// import java.util.*;

// public class Main{
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     String data = sc.next();
//     System.out.println("hello" + data);
//     data = sc.next();
//     System.out.println("hello" + data);
//   } 
// }

// public class Main{
//   public static void main(String[] args){
//     String data = new java.util.Scanner(System.in).nextLine();
//     System.out.println(data);
//   }
// }

// public class Main{
//   public static void main(String[] args){
//     aiu();
//   }
//   public static void aiu(){
//     System.out.println("呼び出しました");
//   }
// }


public class Main{
  public static void main(String[] args){
    System.out.println(aiu(5, 6));
  }

  public static int aiu(int n, int m){
    int a = n + m;
    return a;
  }
}