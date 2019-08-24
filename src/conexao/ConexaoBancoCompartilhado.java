package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConexaoBancoCompartilhado
{

  final private String driver = "com.mysql.jdbc.Driver"; // informa a qual banco de dados vou conectar
  final private String URL = "jdbc:mysql://localhost:3306/bancosemanatecnocientifica"; // informa onde está o banco
  final private String usuario = "root";   // usuario
  final private String senha = "root"; // senha
  private static Connection conexao; // é uma classe, que serve para administrar.
  public Statement stmte; //
  public ResultSet resultSet; // armazena o resultado do select
  static boolean isConectado = false, result;

  public void conectar()
  {
    if (!isConectado)
    {
      //System.out.println("Não tem conexão criada");
      isConectado = true;
      try
      {
        Class.forName(driver);
        conexao = DriverManager.getConnection(URL, usuario, senha);
      }
      catch (ClassNotFoundException e)
      {
        isConectado = false;
        JOptionPane.showMessageDialog(null, "Driver não Encontrado.");
      }
      catch (SQLException e)
      {
        isConectado = false;
        JOptionPane.showMessageDialog(null, "Fonte de Dados não Encontrada.");
        System.out.println(e);
      }
    }
    else
    {
      //System.out.println("Tem conexão criada");
    }
  }

  public void desconectar()
  {
    if (!isConectado)
    {
      try
      {
        conexao.close();
        isConectado = false;
      }
      catch (SQLException erro)
      {
        JOptionPane.showMessageDialog(null, "Erro ao Desconectar." + erro);
      }
    }
  }

  public boolean executar(String sql)
  {
    if (!isConectado)
    {
      conectar();
    }
    result = true;

    try
    {
      stmte = conexao.createStatement();
      stmte.executeUpdate(sql);
    }
    catch (SQLException erro)
    {
      if (1451 == erro.getErrorCode())
      {
        JOptionPane.showMessageDialog(null, "Tais Dados não Podem Ser Removidos, Visto que, os Mesmos São Dependentes em Outras Tabelas de Dados.");
        result = false;
      }
      else
      {
        JOptionPane.showMessageDialog(null, "Erro na Inserção dos Dados." + erro);
        result = false;
      }

    }
    desconectar();
    return result;
  }

  public void consultar(String sql)
  {
    if (!isConectado)
    {
      conectar();
    }
    try
    {
      stmte = conexao.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
      resultSet = stmte.executeQuery(sql);
    }
    catch (SQLException erro)
    {
      JOptionPane.showMessageDialog(null, "Erro ao Tentar Consultar os Dados." + erro);
    }
  }
}
