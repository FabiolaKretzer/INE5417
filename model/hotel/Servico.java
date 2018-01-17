//! Copyright [2017] Fabíola Maria Kretzer

package hotel;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public abstract class Servico {

  private String nome;
  private String data;
  private List<Funcionario> = new ArrayList<>();

  public Servico (String nome, String data){
    this.nome = nome;
    this.data = data;
  }

  @Override
  public String toString(){
    return String.format("Passeio(nome=%s, data=%s)", nome, data);
  }
}
