// public class Main{
//   public static void main(String[] args){
//     int[] points = new int[4];
//     double[] weights = new double[5];
//     boolean answers = new boolean[3];
//     String names = new String[3];
//   }
// }

// public class Main{
//   public static void main(String[] args){
//     int[] moneyList = {121902, 8302, 55100};
//     for (int i = 0; i < moneyList.length; i++){
//       System.out.println(moneyList[i]);
//     }
//     for (int value : moneyList){
//       System.out.println(value);
//     }
//   }
// }

public class Main{
  public static void main(String[] args){
    int[] numbers = {3, 4, 9};
    System.out.println("一桁の数字を入力してください");
    int input = new java.util.Scanner(System.in).nextInt();
    for (int value : numbers){
      if (value == input){
        System.out.println("当たり");
        break; //あってもなくてもOK
      }
    }
  }
}