abstract public class User {

  abstract void powerUp();
  
  abstract void sees();
  
  abstract void scans();

  abstract void dodges();
  
  abstract void shoot();
  
  abstract void clash();
  
   private String name;
   private int level;
   public User(String name, int level){
     this.name = name;
     this.level = level;
   }
   public void setName(){
     this.name = name;
   }
    public String getName(){
      return name;
    }
   public void setLevel(){
     this.level = level;
   }

   public int getLevel(){
     return level;
   }
  

  }



  

      

