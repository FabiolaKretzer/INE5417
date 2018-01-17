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

import excecoes.CpfException;
import excecoes.TelefoneException;
import identificar.Cpf;
import identificar.Telefone;
import pessoa.Funcionario;
import pessoa.Hospede;

public class CadastrarEvento {

  public void Passeio cadastrarPasseio(){
    TextField nome = new TextField(15);
    TextField data = new TextField(8);

    JPanel painel = new JPanel();
    painel.setLayout((LayoutManager)new BoxLayout(painel, BoxLayout.Y_AXIS)); // Y_AXIS- Os componentes estão dispostos verticalmente de cima para baixo.
    painel.add(new Label("Nome:"));
    painel.add(nome);
    painel.add(new Label("Data:"));
    painel.add(data);

    int botao = JOptionPane.showConfirmDialog(null, painel, "Insira asa informações do passeio", JOptionPane.OK_CANCEL_OPTION,
                                              JOptionPane.PLAIN_MESSAGE); //solicita uma confirmação

    String nome1, data1;
    nome1 = nome.getText();
    data1 = data.getText();

    if (botao == JOptionPane.OK_OPTION) {
			return new Passeio(nome, data);
		} else {
			return null;
    }
  }

  public void Quarto cadastrarQuarto(){
    TextField nome = new TextField(15);
    TextField data = new TextField(8);

    JPanel painel = new JPanel();
    painel.setLayout((LayoutManager)new BoxLayout(painel, BoxLayout.Y_AXIS)); // Y_AXIS- Os componentes estão dispostos verticalmente de cima para baixo.
    painel.add(new Label("Nome:"));
    painel.add(nome);
    painel.add(new Label("Data:"));
    painel.add(data);

    int botao = JOptionPane.showConfirmDialog(null, painel, "Insira asa informações do quarto", JOptionPane.OK_CANCEL_OPTION,
                                              JOptionPane.PLAIN_MESSAGE); //solicita uma confirmação

    String nome1, data1;
    nome1 = nome.getText();
    data1 = data.getText();

    if (botao == JOptionPane.OK_OPTION) {
      return new Quarto(nome, data);
    } else {
      return null;
    }
  }
}
