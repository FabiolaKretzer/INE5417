//! Copyright [2017] Fabíola Maria Kretzer

package cadastro;

import java.awt.LayoutManager; //gerenciador de layout

import javax.swing.BoxLayout; //posiciona componentes na vertical ou horizontal
import javax.swing.ButtonGroup; //é utilizado para manter um relacionamento logico e agrupar botões
import javax.swing.JLabel; //rotulos com labels e imagens
import javax.swing.JOptionPane; // facilita a tarefa de exibir diálogos padronizados que solicitem algum valor ao usuário ou que exibam alguma informação
import javax.swing.JPanel;//painel
import javax.swing.JRadioButton; //utilizado para representar valores mutualmente exclusivos
import javax.swing.JTextField; //representa uma caixa onde o usuário pode informar várias linhas de texto

import identificar.Cpf;
import identificar.Telefone;
import pessoa.Funcionario;
import pessoa.Hospede;

public class CadastrarPessoa{

  public static Funcionario cadastrarFuncionario(){
    TextField nome = new TextField(15);
    TextField cpf = new TextField(11);
    TextField telefone = new TextField(9);

    JPanel painel = new JPanel();
    painel.setLayout((LayoutManager)new BoxLayout(painel, BoxLayout.Y_AXIS)); // Y_AXIS- Os componentes estão dispostos verticalmente de cima para baixo.
    painel.add(new Label("Nome:"));
    painel.add(nome);
    painel.add(new Label("CPF:"));
    painel.add(cpf);
    painel.add(new Label("Telefone:"));
    painel.add(telefone);

    int botao = JOptionPane.showConfirmDialog(null, painel, "Funcionário: Insira seus dados", JOptionPane.OK_CANCEL_OPTION,
                                              JOptionPane.PLAIN_MESSAGE); //solicita uma confirmação

    String nome1, cpf1, telefone1;
    nome1 = nome.getText();
    cpf1 = cpf1.getText();
    telefone1 = telefone.getText();

    if(botao = JOptionPane.OK_OPTION) { //se OK foi escolhido
		  return new Funcionario(nome1, cpf1, telefone1);
	  } else {
        return null;
    }
  }

  public static Hospede cadastrarHospede(){
    TextField nome = new TextField(15);
    TextField cpf = new TextField(11);
    TextField telefone = new TextField(9);

    JPanel painel = new JPanel();
    painel.setLayout((LayoutManager)new BoxLayout(painel, BoxLayout.Y_AXIS)); // Y_AXIS- Os componentes estão dispostos verticalmente de cima para baixo.
    painel.add(new Label("Nome:"));
    painel.add(nome);
    painel.add(new Label("CPF:"));
    painel.add(cpf);
    painel.add(new Label("Telefone:"));
    painel.add(telefone);

    int botao = JOptionPane.showConfirmDialog(null, painel, "Hóspede: Insira seus dados", JOptionPane.OK_CANCEL_OPTION,
                                              JOptionPane.PLAIN_MESSAGE); //solicita uma confirmação

    String nome1, cpf1, telefone1;
    nome1 = nome.getText();
    cpf1 = cpf1.getText();
    telefone1 = telefone1.getText();

    if(botao = JOptionPane.OK_OPTION) { //se OK foi escolhido
		  return new Funcionario(nome1, cpf1, telefone1);
	  } else {
        return null;
    }
}
