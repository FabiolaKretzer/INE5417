//! Copyright [2017] Fabíola Maria Kretzer

package hotel;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Passeio {

  public Passeio (String nome, String data){
      super(nome, data);
  }

  @Override
  public String toString(){
    return String.format("Serviço","Passeio");
  }
}
