public class Main{
  public static void main(String[] args){
    int r = new java.util.Random().nextInt(90); //乱数
    System.out.println("あなたは多分、" + r + "歳ですね");

    System.out.println("名前を入力してください");
    String name = new java.util.Scanner(System.in).nextLine();
    System.out.println("年齢を入力してください");
    int age = new java.util.Scanner(System.in).nextInt();
    System.out.println("あなたの名前は," + name + "歳です。年齢は," + age + "です。");    
  }
}
