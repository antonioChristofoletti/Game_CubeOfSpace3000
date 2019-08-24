package Classes;

import conexao.ConexaoBancoJogo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class Score {

    protected Integer codigo;
    protected String nome;
    protected Date tempoDecorido;
    protected Integer CubosPegos;
    protected Date data;
    protected Integer pontuacaoFinal;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getTempoDecorido() {
        return tempoDecorido;
    }

    public void setTempoDecorido(Date tempoDecorido) {
        this.tempoDecorido = tempoDecorido;
    }

    public Integer getCubosPegos() {
        return CubosPegos;
    }

    public void setCubosPegos(Integer CubosPegos) {
        this.CubosPegos = CubosPegos;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Integer getPontuacaoFinal() {
        return pontuacaoFinal;
    }

    public void setPontuacaoFinal(Integer pontuacaoFinal) {
        this.pontuacaoFinal = pontuacaoFinal;
    }

    public static ArrayList<Score> retornaScore() throws SQLException {
        ConexaoBancoJogo c = new ConexaoBancoJogo();
        c.conectar();
        String sql = "select * from score order by pontuacaoFinal desc";
        c.consultar(sql);
        ResultSet rs = c.resultSet;
        ArrayList<Score> listaScore = new ArrayList<>();
        while (rs.next()) {
            Score s = new Score();
            s.setCodigo(rs.getInt("codigo"));
            s.setCubosPegos(rs.getInt("CubosPegos"));
            s.setData(rs.getTimestamp("data"));
            s.setNome(rs.getString("nome"));
            s.setPontuacaoFinal(rs.getInt("pontuacaoFinal"));
            s.setTempoDecorido(rs.getTimestamp("tempoDecorido"));
            listaScore.add(s);
        }
        return listaScore;
    }
}