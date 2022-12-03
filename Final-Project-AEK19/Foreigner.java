/// this class is for the person entering the Matrix
public class Foreigner extends User {

  private int level;
  private String name;

  public Foreigner(String name, int level) {super(name, level);
    this.name = name;
    this.level = level;
  }
 
  public void setName(String name) {
    this.name = name;
  }
  @Override
  public String getName() {
    return name;
  }
  public void setlevel(int level){
    this.level = level;
  }
  @Override
  public int getLevel(){
    return level;
  }



  public String toString() {
    return "New people who enter in the matrix are identified as a " + getName();
  }

  @Override
  void powerUp() {
    System.out.println("\n and powers up to level " + getLevel());
  }

  @Override
  void sees() {
    System.out.println(getName() + " spots agent from distance");
  }

  @Override
  void scans(){
    System.out.println(getName() + " can't scan power level of Agent");
  }

  @Override
   void dodges() {
    if (level > 10) {
      System.out.println(getName() + " dodges the shot using supernatural speed");
    } else if (level <= 10) {
      System.out.println(getName() + "ignores person");
    }
    
  }

  @Override
  void shoot(){
    System.out.println(getName() + " does not have a gun to shoot out of");
  }

  @Override
  void clash() {
    System.out.println(getName() + " runs to leap at Agent");
  }
}
