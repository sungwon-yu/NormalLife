import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    String[] fName = new String[] { "Hydrogen", "Helium", "Lithium", "Beryllium", "Boron", "Carbon", "Nitrogen",
        "Oxygen", "Fluorine", "Neon", "Sodium", "Magnesium", "Aluminium", "Silicon", "Phosphorus", "Sulfur", "Chlorin",
        "Argon", "Potassium", "Calcium", "Scandium", "Titanium", "Vanadium", "Chrominum", "Manganese", "Iron", "Cobalt",
        "Nickel", "Copper", "Zinc", "Gallium", "Germanium", "Arsenic", "Selenium", "Bromine", "Krypton", "Rubidium",
        "Strontium", "Yttrium", "Zirconium", "Nioblum", "Molybdenum", "Technetium", "Ruthenium", "Rhodium", "Palladium",
        "Silver", "Cadmium", "Indium", "Tin", "Antimony", "Tellurium", "Iodine", "Xenon", "Caesium", "Barium",
        "Lanthanum", "Cerlum", "Praseodymium", "Neodymium", "Promethium", "Samarium", "Europium", "Gadolinium",
        "Terbium", "Dysprosium", "Holmium", "Erbium", "Thulium", "Ytterbium", "Lutetium", "Hafnium", "Tantalum",
        "Tungsten", "Rhenium", "Osmium", "Iridium", "Platinum", "Gold", "Mercury", "Thallium", "Lead", "Bismuth",
        "Polonium", "Astatine", "Radon" };

    
    String[] symbol = new String[] { "H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne", "Na", "Mg", "Al", "Si", "P",
        "S", "Cl", "Ar", "K", "Ca", "Sc", "Ti", "V", "Cr", "Mn", "Fe", "Co", "Ni", "Cu", "Zn", "Ga", "Ge", "As", "Se",
        "Br", "Kr", "Rb", "Sr", "Y", "Zr", "Nb", "Mo", "Tc", "Ru", "Rh", "Pd", "Ag", "Cd", "In", "Sn", "Sb", "Te", "I",
        "Xe", "Cs", "Ba", "La", "Ce", "Pr", "Nd", "Pm", "Sm", "Eu", "Gd", "Tb", "Dy", "Ho", "Er", "Tm", "Yb", "Lu",
        "Hf", "Ta", "W", "Re", "Os", "Ir", "Pt", "Au", "Hg", "Tl", "Pb", "Bi", "Po", "At", "Rn" };

    Random rand = new Random(); // instance of random class
    int upperbound = 86;
    System.out.println("Please select the mode, symbol or name");
    String mode = reader.nextLine();
    System.out.println(" ");
    
    if(mode.equals("symbol")){
      int i = 1;
      while (i == 1) {
        int int_random = rand.nextInt(upperbound);
        System.out.println(fName[int_random]);
        String answer = symbol[int_random];
        System.out.println("What is this symbol's name?");
        System.out.println(" ");
        String user = reader.nextLine();

        while (!user.equals(answer)) {
          System.out.println("It is wrong, keep trying");
          user = reader.nextLine();
          
        } 
        if (user.equals(answer) == true) {
          System.out.println(" ");
          System.out.println("Correct");
          System.out.println(" ");
        }
      }
    }
    else if(mode.equals("name")){
      int i = 2;
      while (i == 2){
        int int_random = rand.nextInt(upperbound);
        System.out.println(symbol[int_random]);
        String answer = fName[int_random];
        System.out.println("What is this element's full name?");
        System.out.println(" ");
        String user = reader.nextLine();
        
        while (!user.equals(answer)) {
          System.out.println("It is wrong, keep trying");
          user = reader.nextLine();
          
        } 
        if (user.equals(answer) == true) {
          System.out.println(" ");
          System.out.println("Correct");
          System.out.println(" ");
        }
    }
  }
}
}
