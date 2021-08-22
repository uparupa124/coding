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


// public class Main{
//   public static void main(String[] args){
//     int a = aiu(8, 9);

//     if (a <= 17){
//     System.out.println("true");
//     }else{
//       System.out.println("false");
//     }
//   }

//   public static int aiu(int n, int m){
//     int a = n + m;
//     return a;
//   }
// }

// public class Main{
//   public static void main(String[] args){
//     long a = 1;
//     long b = 1;
//     long c = 2;

//     for(int i = 1; i < 20; i++){
//       long d = a + b + c;
//       System.out.println(d);
//       a = b;
//       b = c;
//       c = d;
//     }
//   }
// }


public class Main{
  public static void main(String[] args){
    int i = new java.util.Random().nextInt(4);
    System.out.println("0~4までの数字を入力してください");
    int value = new java.util.Scanner(System.in).nextInt();

    if(value == i){
      System.out.println("true");
    }else{
      System.out.println("false");
    }
  }
}