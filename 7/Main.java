public class Main{
  public static void main(String[] args){
    Hero h = new Hero();
    System.out.println("勇者の名前を決めてください");
    h.name = new java.util.Scanner(System.in).nextLine();
    h.hp = 100;
    System.out.println("勇者" + h.name + "を生み出しました");

    Cleric c = new Cleric();
    System.out.println("聖職者の名前を決めてください");
    c.name = new java.util.Scanner(System.in).nextLine();
    System.out.println("聖職者" + c.name + "を生み出しました");
    

    Matango m1 = new Matango();
    m1.hp = 50;
    m1.suffix = 'A';

    Matango m2 = new Matango();
    m2.hp = 48;
    m2.suffix = 'B';

    h.slip();
    m1.run();
    m2.run();
    h.run();
    c.selfAid();
    c.selfAid();
    c.pray(3);
  }
}