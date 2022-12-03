import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Scanner fq = new Scanner(System.in);
    System.out.println(" Welcome! Which color pill you would like to pick you only get two options:\n" + "1) Red Pill\n" + "2) Blue Pill\n");

    int selection = fq.nextInt();
    
    FalseOption.catchThis(3);
    switch (selection) {
      case 1:
        System.out.println(
            "The Red Pill will set you free and there is no turning back\nTaking this color pill comes with positive super human effects to your body including:\n ");
        break;
      case 2:
        System.out.println(
            "The Blue Pill will bring you back to reality and you will remain the same waking up like nothing happened. ");
        break;

      case 3:
        System.out.println("Not an option, but sort of in between, so I will give you the possible positive outcomes of the red pill: ");
        break;
    }
        fq.close(); 
     

  
    ArrayList<String> positives = new ArrayList<String>();
    positives.add("Improved vision");
    positives.add("Enhanced jumping ability");
    positives.add("Added fighting techniques");
    positives.add("Telekensis");
    positives.add("Pre Cognition & Awareness");
    positives.add("Phasing");
    positives.add("Matrix Vision");
    positives.add("Flight");
    positives.add("Super Speed");

    

    for (String p : positives) {
      System.out.println(p);

      if (selection == 2) {
        System.out.println("\nYou will not have any cool powers unforuntately\n\n:(");
        break;
      } else if (selection == 1) {
        System.out.println("\n");
        continue;
      }
    }
    if (selection <= 1) {
      System.out.println(
          "\nYou have now entered into the Matrix successfully and your new powers are activated, but you are immediately approached by an agent\n");
      ArrayList<User> characters = new ArrayList<User>();

      User one = new Foreigner("Foreigner ", 14);
      one.setName();
      one.setLevel();
      System.out.println(one.toString() + "Foreigner notices something strange\n ");
      one.sees();
      one.powerUp();

      User three = new Agent("Agent", 10);

      three.setName();
      three.setLevel();
      three.sees();
      three.scans();
      three.powerUp();
      three.shoot();

      one.dodges();

      characters.add(one);
      characters.add(three);

      for (User persons : characters) {
        persons.clash();
       
      }
     
    }
   
  }

}

  
