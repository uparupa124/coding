// public class Main{
//   public static void main(String[] args){
//     System.out.println("ようこそ占いの館へ");
//     System.out.println("あなたの名前を入力してください");
//     String name = new java.util.Scanner(System.in).nextLine();
//     System.out.println("あなたの年齢を入力してください");
//     String ageString = new java.util.Scanner(System.in).nextLine();
//     int age = Integer.parseInt(ageString);
//     int fortune = new java.util.Random().nextInt(4);
//     fortune++;
//     System.out.println("占いの結果が出ました！");
//     System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
//     System.out.println("1:大吉 2:中吉 3:吉 4:凶");
//   }
// }

public class Main{
  public static void main(String[] args){
    System.out.println("ようこそ占いの館へ");
    System.out.println("あなたの名前を入力してください");
    String name = new java.util.Scanner(System.in).nextLine();
    System.out.println("あなたの年齢を入力してください");
    String ageString = new java.util.Scanner(System.in).nextLine();
    int age = Integer.parseInt(ageString);
    int fortune = new java.util.Random().nextInt(4);
    fortune++;
    System.out.println("占いの結果が出ました");

    switch(fortune){
      case 1:
        System.out.println(age + "歳の" + name + "さん、あなたの運気番号は大吉です");
        break;
      case 2:
        System.out.println(age + "歳の" + name + "さん、あなたの運気番号は中吉です");
        break;
      case 3:
        System.out.println(age + "歳の" + name + "さん、あなたの運気番号は吉です");
        break;
      default:
        System.out.println(age + "歳の" + name + "さん、あなたの運気番号は凶です");
    }
    //fortune == 1 fortune ==2.. をif文で書くとめんどくさいのでswitchが使える
    //break;を忘れない　defaultは全てに当てはまらなかった時に実行するコード
    
  }
}