package patronesDediseño.IoC.E01_JavaPuro;


public class App {

  public static void main (String[] args) {

    UsuarioFactory usrOracle = new UsuarioFactory(new UsuarioOracle());
    UsuarioFactory usrMongo = new UsuarioFactory(new UsuarioMongo());

    usrOracle.getUsuario();

    usrOracle.setUsuario(1);
    
    usrMongo.getUsuario();

    usrMongo.setUsuario(1);

  }


}

