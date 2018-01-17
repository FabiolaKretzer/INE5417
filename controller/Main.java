//! Copyright [2017] Fabíola Maria Kretzer

package main;

import java.util.Scanner;

import pessoa.Pessoa;
import pessoa.Funcionario;
import pessoa.Hospede;
import hotel.Servico;
import hotel.Passeio;
import hotel.Quarto;
import cadastro.CadastrarPessoa;
import cadastro.CadastrarServico;

public class Main{

  public static void main(String []args){
    Scanner scanner = new Scanner(System.in);
    int valor;
    boolean boll = true;

    while(boll){
      System.out.println("Informe a opção:");
	    System.out.println("1 - Cadastrar Hóspede");
	    System.out.println("2 - Cadastrar Funcionário");
	    System.out.println("3 - Cadastrar Passeio");
	    System.out.println("4 - Cadastrar Quarto");
      System.out.println("5 - Reservar Passeio");
      System.out.println("6 - Reservar Quarto");
      System.out.println("7 - Segunda Iteração");
      System.out.println("8 - Segunda Iteração");
	    System.out.println("9 - Sair");
      valor = scanner.nextInt();

        switch(valor){
          case 1:
                Pessoa pes = new CadastrarPessoa().cadastrarHospede();
                System.out.println(pes.toString());
                break;
          case 2:
                Pessoa pes = new CadastrarPessoa().cadastrarFuncionario();
                System.out.println(pes.toString());
                break;
          case 3:
                Servico ser = new CadastrarServico().cadastrarPasseio();
                System.out.println(ser.toString());
                break;
          case 4:
                Servico ser = new CadastrarServico().cadastrarQuarto();
                System.out.println(ser.toString());
                break;
          case 5:
                break;
          case 6:
                break;
          case 7:
                break;
          case 8:
                break;
          case 9:
                bool = false;
                break;
          case default:
                System.out.println("Inválido");
                break;
        }
        valor.nextLine();
    }
  }
}
