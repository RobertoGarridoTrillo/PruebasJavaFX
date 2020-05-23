package patronesDediseño.IoC.E01_JavaPuro;


public class UsuarioMongo implements IUsuario {

  @Override
  public void setUsuario (int id) {
    System.out.println("Insertando el Id de Mongo "+ id);

  }


  @Override
  public void getUsuario () {
    System.out.println("Devolviendo el Id de Mongo");

  }


}

