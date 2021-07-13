// public class Main{
//   public static void main(String[] args){
//     email("repmyu@gmail.com", "元気にしていますか？私は元気です。");
//   }
//   public static void email(String title, String address, String text){
//     System.out.println(address + "に、以下のメールを送信しました");
//     System.out.println("件名:" + title);
//     System.out.println("本文:" + text);
//   }
//   public static void email(String address, String text){
//     System.out.println(address + "に、以下のメールを送信しました");
//     System.out.println("件名:無題");
//     System.out.println("本文:" + text);
//   }
// }

public class Main{
  public static void main(String[] args){
    double ans = calcTriangleArea(10.0, 5.0);
    System.out.println("三角形の底辺の長さが10.0cm,高さが5.0cmの場合、面積は" + ans + "cm2");

    double ans1 = calcCircleArea(5.0);
    System.out.println("円の半径が5.0cmの場合、面積は" + ans1 + "cm2");
  }
  public static double calcTriangleArea(double bottom, double height){
    double ans = bottom * height / 2;
    return ans;
  }
  public static double calcCircleArea(double radius){
    double ans = radius * radius * 3.14;
    return ans;
  }
}