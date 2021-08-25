public class Main{
  public static void main(String[] args){
    System.out.println("バナナかりんごのどちらかを入力してください");
    String foods = new java.util.Scanner(System.in).nextLine();
    if(foods == "バナナ"){
      System.out.println("お前は猿だ");
    }else{
      System.out.println("お前は何者だ");
    }

  }
}