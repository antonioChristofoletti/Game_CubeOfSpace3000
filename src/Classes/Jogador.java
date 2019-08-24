package Classes;

import conexao.ConexaoBancoCompartilhado;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Jogador
{

  private String nome;

  private int pont1;
  private int pont2;
  private int pont3;
  private int pont4;
  private int status1;
  private int status2;
  private int status3;
  private int status4;
  private int total;

  public int getTotal()
  {
    return total;
  }

  public void setTotal(int total)
  {
    this.total = total;
  }

  private ConexaoBancoCompartilhado conn;

  public Jogador()
  {
    this.conn = new ConexaoBancoCompartilhado();
  }

  public String getNome()
  {
    return nome;
  }

  public void setNome(String Nome)
  {
    this.nome = Nome;
  }

  public int getPont1()
  {
    return pont1;
  }

  public void setPont1(int pont1)
  {
    this.pont1 = pont1;
  }

  public int getPont2()
  {
    return pont2;
  }

  public void setPont2(int pont2)
  {
    this.pont2 = pont2;
  }

  public int getPont3()
  {
    return pont3;
  }

  public void setPont3(int pont3)
  {
    this.pont3 = pont3;
  }

  public int getPont4()
  {
    return pont4;
  }

  public void setPont4(int pont4)
  {
    this.pont4 = pont4;
  }

  public int getStatus1()
  {
    return status1;
  }

  public void setStatus1(int status1)
  {
    this.status1 = status1;
  }

  public int getStatus2()
  {
    return status2;
  }

  public void setStatus2(int status2)
  {
    this.status2 = status2;
  }

  public int getStatus3()
  {
    return status3;
  }

  public void setStatus3(int status3)
  {
    this.status3 = status3;
  }

  public int getStatus4()
  {
    return status4;
  }

  public void setStatus4(int status4)
  {
    this.status4 = status4;
  }

  public boolean inserir()
  {
    String sql = "insert into jogador (nome, pont1, pont2, pont3, pont4,status1, status2, status3, status4) values ('" + this.nome + "' , '" + 0 + "'  , '" + 0 + "'  , '" + 0 + "'  , '" + 0 + "' , '" + 0 + "'  , '" + 0 + "'  , '" + 0 + "'  , '" + 0 + "')";
    return this.conn.executar(sql);
  }

  public List<Jogador> pesquisarNome(String nome)
  {
    List<Jogador> listaJogadoresNome = new ArrayList<>();
    String sql = "select * from jogador where nome like'%" + nome + "%' and status3=0";
    this.conn.consultar(sql);
    ResultSet rs = this.conn.resultSet;

    try
    {
      while (rs.next())
      {
        Jogador c = new Jogador();
        c.setNome(rs.getString("nome"));
        c.setStatus1(rs.getInt("status1"));
        c.setStatus2(rs.getInt("status2"));
        c.setStatus3(rs.getInt("status3"));
        c.setStatus4(rs.getInt("status4"));
        listaJogadoresNome.add(c);
      }
      return listaJogadoresNome;
    } catch (Exception e)
    {
      System.out.println("Erro: " + e.getMessage());
      return null;
    }
  }

  public Integer retornaUltimoCodigoJogador()
  {
    try
    {
      String sql = "show table status like 'jogador'";
      this.conn.consultar(sql);
      this.conn.resultSet.first();
      return (this.conn.resultSet.getInt("Auto_increment"));
    } catch (Exception ex)
    {
      return null;
    }
  }

  public Boolean isNomeExiste()
  {
    try
    {
      String sql = "select count(*) as resultado from jogador where nome='" + this.nome + "'";
      this.conn.consultar(sql);
      this.conn.resultSet.next();
      if (this.conn.resultSet.getInt("resultado") > 0)
      {
        return true;
      } else
      {
        return false;
      }
    } catch (Exception ex)
    {
      return null;
    }
  }

  public List<Jogador> pesquisarVencedor()
  {
    List<Jogador> listaJogadoresNome = new ArrayList<>();
    String sql = "select nome, (pont1 + pont2 + pont3 + pont4) as soma, pont1, pont2, pont3, pont4 from jogador order by soma DESC";
    this.conn.consultar(sql);
    ResultSet rs = this.conn.resultSet;

    try
    {
      while (rs.next())
      {
        if (rs.getInt("soma") != 0)
        {
          Jogador c = new Jogador();
          c.setNome(rs.getString("nome"));
          c.setTotal(rs.getInt("soma"));
          c.setPont1(rs.getInt("pont1"));
          c.setPont2(rs.getInt("pont2"));
          c.setPont3(rs.getInt("pont3"));
          c.setPont4(rs.getInt("pont4"));
          listaJogadoresNome.add(c);
        }

      }
      return listaJogadoresNome;

    } catch (Exception e)
    {
      System.out.println("Erro: " + e.getMessage());
      return null;
    }
  }

  public boolean atualizarStatus(String Nome)
  {
    String sql = "UPDATE jogador SET status3='1' WHERE nome='" + Nome + "'";
    return this.conn.executar(sql);
  }

  public boolean atualizarStatusCubeOfSpace3000(String nome, int pontuacao)
  {
    String sql = "update jogador set status3='" + 1 + "',pont3='" + pontuacao + "' where nome='" + nome + "'";
    System.out.println(sql);
    return (this.conn.executar(sql));
  }
}
