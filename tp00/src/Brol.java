package tp00;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@AllArgsConstructor // pour plusiers args
@Builder // Une nouvelle maniere de construire
@Slf4j // pour les log

public class Brol {

  private String nom; //c'est celui qui va recevoir nom (String nom)
  private boolean ok = true;

  public Brol(String nom){
    this(nom, true);
  }

  public static void main(String[] args){
    log.info("Lancemetn de la methode main");
    Brol  objet1;
    Brol  objet3;
    Brol  objet4;

    objet1 = new Brol("Bradley");
    objet3 = new Brol("Super", false);

    objet4 = Brol.builder().ok(false).nom("Builder").build();

    System.out.println(objet1);
    System.out.println(objet3);
    System.out.println(objet4);

    System.out.println(new Brol("Brad"));
    log.info("Fin du programme");
  }
}