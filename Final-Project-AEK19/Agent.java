public class Agent extends User {

  private int level;
  private String name;
  
  public Agent(String name,int level) {super(name, level);
    this.name = name;
    this.level = level;
  }
@Override
public void setName(){
  this.name = name;
}
  @Override
public String getName(){
  return name;
}
public void setLevel(){
  this.level = level;
}
@Override
public int getLevel(){
  return level;
}
  @Override
  void sees(){
    System.out.println(getName() + " sees foreigner");
  }

  @Override
  void powerUp(){
    System.out.println(getName() + " begins to  mututate and twitches getting ready to eliminate Foreigner");
  }
  @Override
   void scans(){
    System.out.println(getName() + " has a power level of " + getLevel() + ", but notices that someone else has entered the Matrix with different power level. ");
  }
    // Agents only recgonize people as foreigners if they have a level greater than theres if not, they are just regular civilians

  @Override
  void dodges(){
    System.out.println(getName() + " wants to force the intruder to to elimination and see their skills");
  }
  @Override
   void shoot(){
    
    if (level >= 10){
  System.out.println(getName() + " shoots to try and eliminate Foreigners that have a higher power level within the Matrix");
  } else if (level < 10) {
  System.out.println("Agent ignores stranger");

  
    }
      
    }

  @Override 
   void clash(){
      System.out.println("Agent runs to leap at Foreigner");
      }

}
