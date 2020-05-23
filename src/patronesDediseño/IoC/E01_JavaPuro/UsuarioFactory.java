package patronesDediseño.IoC.E01_JavaPuro;


public class UsuarioFactory {

  IUsuario usr;


  public UsuarioFactory (IUsuario usr) {
    this.usr = usr;
  }


  public void setUsuario (int id) {
    usr.setUsuario(id);
  }


  public void getUsuario () {
    usr.getUsuario();
  }


}

