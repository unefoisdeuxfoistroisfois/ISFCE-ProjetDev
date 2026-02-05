import lombok.Data;

@Data
public class Brol {

  private String nom; //c'est celui qui va recevoir nom (String nom)
  private boolean ok = true;

  public Brol(String nom){
    this.nom = nom;
  }

  public static void main(String[] args) {
    Brol objet1;
    Brol objet2;

    objet1 = new Brol("Bradley");
    objet2 = new Brol("Bradley");

    System.out.println(objet1);
    System.out.println(objet2);
    System.out.println("objet1 = objet2 "+ objet1.equals(objet2));
    System.out.println("b1 même objet "+ (objet1 == objet2)); // savoir si les adresse son egaux

  }
}