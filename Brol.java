import lombok.Data;

@Data
public class Brol {

  private String nom; //c'est celui qui va recevoir nom (String nom)
  private boolean ok;

  public Brol(String nom) {
    //this va etre utilisé dans tout notre class
    this.nom = nom;
    this.ok = true;
  }

  public boolean equals(Object objrecu){

    // 1. Si c'est le même objet en mémoire
    if (this == objrecu) return true;

    // 2. Si obj est null ou pas de la même classe
    if (objrecu == null || getClass() != objrecu.getClass()) return false;

    // 3. Cast en Brol
    Brol other = (Brol) objrecu;

    // 4. Comparer les attributs importants
    return nom.equals(other.nom);
  }

  public static void main(String[] args) {
    Brol objet1 = new Brol("Bradley");
    Brol objet2 = new Brol("Bradley");

    System.out.println(objet1);
    System.out.println(objet2);
    System.out.println("objet1 = objet2 "+ objet1.equals(objet2));
    System.out.println("b1 même objet "+ (objet1 == objet2)); // savoir si les adresse son egaux

  }
}
