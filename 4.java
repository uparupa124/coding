// public class Main{
//   public static void main(String[] args){
//     int[] seq = new int[10];

//     for (int i = 0; i < seq.length; i++){
//       seq[i] = new java.util.Random().nextInt(4);
//     }

//     // for (int i = 0; i< seq.length; i++){
//     //   switch (seq[i]){
//     //     case 0:
//     //       System.out.println("A");
//     //       break;
//     //     case 2:
//     //       System.out.println("T");
//     //       break;
//     //     case 3:
//     //       System.out.println("G");
//     //       break;
//     //     case 4:
//     //       System.out.println("C");
//     //       break;
//     //   }
//       // for (int i = 0; i < seq.length; i++){
//       //   char[] base = {'A', 'T', 'G', 'C'};
//       //   System.out.println(base[seq[i]] + " ");
//       // } //この書き方でもOK
    
//   }
// }

// public class Main{
//   public static void main(String[] args){
//     int[] scores = {30, 50, 70, 80, 100};
//     for (int value : scores){
//       System.out.println(value); //拡張for文　配列を回すことができる
//     }
//   }
// }


public class Main{
  public static void main(String[] args){
    int[] arrayA = {1, 2, 3};
    int[] arrayB = new int[3];
    arrayB = arrayA; //PC内の配列のアドレスをコピーしたことになるのでBに代入するとAで表示した時に同じ数になる
    arrayB[1] = 100;
    System.out.println(arrayA[1]);
  }
}