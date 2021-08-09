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
    int a = aiu(8, 9);

    if (a <= 17){
    System.out.println("true");
    }else{
      System.out.println("false");
    }
  }

  public static int aiu(int n, int m){
    int a = n + m;
    return a;
  }
}