public class Main{
  public static void main(String[] args){
    double pi = 3.14;
    int pie = 5;
    System.out.println("半径" + pie + "cmのパイの面積は、");
    System.out.println(pie * pie * pi);
    System.out.println("パイの半径を倍にします");
    pi = 10; //3.14を10に書き換えた
    System.out.println("半径" + pie + "cmのパイの面積は、");
    System.out.println(pie * pie * pi);
  }
}

public class Next{
  public static void main(String[] args){
    final double PI = 3.14;
    int pie = 5;
    System.out.println("半径" + pie + "cmのパイの面積は、");
    System.out.println(pie * pie * PI);
    System.out.println("パイの半径を倍にします");
    PI = 10; //定数を書き換えるとコンパイルエラーが起きる
    System.out.println("半径" + pie + "cmのパイの面積は、");
    System.out.println(pie * pie * PI);
  }
}