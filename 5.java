// public class Main{
//   public static void main(String[] args){
//     System.out.println("名前を入力してください");
//     String input = new java.util.Scanner(System.in).nextLine();
//     System.out.println("メソッドを呼び出します");
//     hello(input);
//     System.out.println("メソッドを呼び出しました");
//   }

//   public static void hello(String name){
//     System.out.println(name + "さん、こんにちは");
//   }
// }

public class Main{
  public static void main(String[] args){
    System.out.println("xの値を入力してください");
    int x = new java.util.Scanner(System.in).nextInt();
    System.out.println("yの値を入力してください");
    int y = new java.util.Scanner(System.in).nextInt();
    add(x, y);
    int ans = add(x, y); //戻り値の受け取り
    System.out.println(x + "+" + y + "=" + ans);
  }
  public static int add(int x, int y){
    int ans = x + y;
    return ans; //戻り値の受け渡し return文はメソッドを終了するので、その後にコードを記述しても処理されない
  }
}

//メソッドブロックのvoidの部分は戻り値がある時は変数の型を記述する