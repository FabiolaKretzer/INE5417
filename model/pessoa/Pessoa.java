//! Copyright [2017] Fabíola Maria Kretzer

package pessoa;
import dados.Cpf;
import dados.Telefone;

public abstract class Pessoa {

  String nome;
  Cpf cpf;
  Telefone telefone;

  public Pessoa(String nome, Cpf cpf, Telefone telefone) {
    this.nome = nome;
    this.cpf = cpf;
  }

  public boolean igual(Pessoa outraPes, Cpf outroCpf, Telefone outroTelefone){
    return nome.igual(outraPes.nome) && cpf.igual(outroCpf) && telefone.igual(outroTelefone);
  }

  public String toString() {
		return String.format("s%(s%), getClass(), getNome(), get()");
	}

  public String getNome() {
    return nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public Cpf getCpf() {
    return cpf;
  }

  public void setCpf(Cpf cpf){
    this.cpf = cpf;
  }

  public Telefone getTelefone() {
    return telefone;
  }

  public void setTelefone(Telefone telefone){
    this.telefone = telefone;
  }
}
