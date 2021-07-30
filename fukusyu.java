// public class Main{
//   public static void main(String[] args){
//     int isHungry = 1;
//     String food = "りんご";
//     System.out.println("こんにちは");
//     if (isHungry == 0){
//       System.out.println("お腹がいっぱいです");
//     }else{
//       System.out.println("はらぺこです");
//       System.out.println(food + "をいただきます");
//       System.out.println("ごちそうさまでした");
//     }
//   }
// }

// public class Main{
//   public static void main(String[] args){
//     boolean tenki = false;
//     if (tenki == true){
//       System.out.println("洗濯をします");
//       System.out.println("散歩に行きます");
//     }else{
//     System.out.println("DVDを見ます");
//     System.out.println("寝ます");
//     }
//   }
// }

// public class Main{
//   public static void main(String[] args){
//     System.out.print("[メニュー] 1:検索 2:登録 3:削除 4:変更>");
//     int selected = new java.util.Scanner(System.in).nextInt();

//     switch (selected) {
//       case 1:
//         System.out.println("検索します");
//         break;
//       case 2:
//         System.out.println("登録します");
//         break;
//       case 3:
//         System.out.println("削除します");
//         break;
//       case 4:
//         System.out.println("変更します");
//         break;
      
//     }
//   }
// }

// public class Main{
//   public static void main(String[] args){
//     System.out.println("数当てゲーム");
//     int ans = new java.util.Random().nextInt(10);

//     for (int i = 0; i < 5; i++){
//       System.out.println("０〜９の数字を入力してください");
//       int num = new java.util.Scanner(System.in).nextInt();
//         if (ans == num){
//           System.out.println("当たり！");
//           break;
//         }else{
//           System.out.println("違います");
//         }
//     }
//     System.out.println("ゲームを終了します");
//   }
// }

// public class Main{
//   public static void main(String[] args){
//     int[] moneyList = {121902, 8302, 55100};

//     for (int i = 0; i < moneyList.length; i++){
//       System.out.println(moneyList[i]);
//     }
//     for (int m : moneyList){
//       System.out.println(m);
//     }
//   }
// }

// public class Main{
//   public static void main(String[] args){
//     int[] numbers = {3, 4, 9};
//     System.out.println("画面に一桁の数字を入力してください");
//     int input = new java.util.Scanner(System.in).nextInt();
//     for (int i = 0; i < numbers.length; i++){
//       if (numbers[i] == input){
//         System.out.println("当たり！");
//         break;
//       }
//     }
//   }
// }

public class Main{
  public static void main(String[] args){
    int[] numbers = {3, 4, 9};
    System.out.println("画面に一桁の数字を入力してください");
    int input = new java.util.Scanner(System.in).nextInt();
    for (int m : numbers){
      if (m == input){
        System.out.println("当たり！");
        break;
      }
    }
  }
}