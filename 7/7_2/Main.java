public class Main{
  public static void main(String[] args){
    Hero h = new Hero("うぱ");
    System.out.println(h.name + "のHPは" + h.hp + "です");

    Hero h1 = new Hero();
    System.out.println(h1.name);

    Thief t = new Thief("upa");
    System.out.println("名前" + t.name + "HP" + t.hp + "MP" + t.mp);
  }
}