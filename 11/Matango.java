public class Matango{
  int hp = 50;
  char suffix;
  public Matango(char suffix){
    this.suffix = suffix;
  }
  
  public void attack(Dancer d){
    System.out.println("きのこ" + this.suffix + "の攻撃");
    System.out.println("10のダメージ");
    d.hp -= 10;
  }
}