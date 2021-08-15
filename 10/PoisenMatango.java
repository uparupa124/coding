public class PoisenMatango extends Matango{
  int poisenCount = 5;
  public PoisenMatango(char suffix){
    super(suffix);
  }

  public void attack(Hero h){
    super.attack(h);
    if(posenCount > 0){
      System.out.println("さらに毒の胞子をばら撒いた");
      int dmg = h.hp / 5;
      h.hp -= dmg;
      System.out.println(dmg + "ポイントのダメージ！");
      this.poisenCount--;
    }
  }
}