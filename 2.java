// public class Main{
//   public static void main(String[] args){
//     int age = (int)3.2; //(int)で少数の値を整数の箱に入れ込む
//     System.out.println(age);


//     int a = 25;
//     int b = 26;
//     int m = Math.max(a , b);
//     System.out.println(m);
//   }
// }

//(int)⇨キャスト演算子　はみ出たデータが切り捨てられるので滅多に使うことはない

public class Next{
  public static void main(String[] args){
    String age = "23";
    int n = Integer.parseInt(age); //Stringをintegerに変換　to_iと同じ
    System.out.println("あなたは来年" + (n+1) + "歳になりますね");
  }
}