public class Computer extends TangibleAsset{
  String makerName;

  public Computer(String name, int price, String color, String makerName){
    super(name, price, color);
    this.makerName = makerName;
  }

  public String makerName(){
    return this.color;
  }
}