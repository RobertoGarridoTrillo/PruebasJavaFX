package patronesDediseño.IoC.E01_JavaPuro;


public class UsuarioOracle implements IUsuario {

  @Override
  public void setUsuario (int id) {
    System.out.println("Insertando el Id de Oracle " + id);

  }


  @Override
  public void getUsuario () {
    System.out.println("Devolviendo el Id de oracle");

  }


  public void money () {
    int money = 2;
  }


}

