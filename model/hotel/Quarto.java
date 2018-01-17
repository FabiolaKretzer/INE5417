//! Copyright [2017] Fabíola Maria Kretzer

package hotel;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Quarto extends Servico {

  public Quarto (String nome, String data){
      super(nome, funcionario, data);
  }

  @Override
  public String toString(){
    return String.format("Serviço","Quarto");
  }
}
