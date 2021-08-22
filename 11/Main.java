public class Main{
  public static void main(String[] args){
    Dancer d = new Dancer();
    Matango m = new Matango('A');
    d.name = "upa";
    System.out.println("1~4の数字を入力してください");
    int i = new java.util.Scanner(System.in).nextInt();

    if(i == 1){
      d.attack(m);
    }else if(i == 2){
      d.dance();
    }else if(i == 3){
      System.out.println(d.name + "は戸惑っている");
    }else{
      System.out.println("眠たい");
    }

  }
}