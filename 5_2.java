// public class Main{
//   //　一つ目のaddメソッド
//   public static int add(int x, int y){
//     return x + y;
//   }
//   // 2つ目
//   public static double add(double x, double y){
//     return x + y;
//   }
//   // 3つ目
//   public static String add(String x, String y){
//     return x + y;
//   }
//   // 4つ目
//   public static int add(int x, int y, int z){
//     return x + y + z;
//   }
//   public static void main(String[] args){
//     System.out.println(add(10, 20));

//     System.out.println(add(3.5, 2.7));

//     System.out.println(add("Hello", "World"));

//     System.out.println(add(10, 20, 30));
//   }
// }

/*　基本的には同じメソッド名は再利用できないが、
　　仮引数の型または個数が違う場合は使用できる
　　その場合PCが自動的に判断する　*/

// public class Main{
//   public static void main(String[] args){
//     int[] array = {3, 5, 9};
//     printArray(array);
//   }
//   public static void printArray(int[] array){
   
//     for (int n : array){
//       System.out.println(n);
//     }
//   }
// }
// //引数に配列を指定することも可能

// //printArrayの引数は配列のアドレス情報のみを受け取っている


public class Main{
  public static void main(String[] args){
    int[] array = makeArray(3);
    for (int i : array){
      System.out.println(i);
    }
  }
  public static int[] makeArray(int size){
    int[] newArray = new int[size];
    
    for (int i = 0; i < newArray.length; i++){
      newArray[i] = i;
    }
    return newArray;
  }
}

//戻り値に配列を用いる