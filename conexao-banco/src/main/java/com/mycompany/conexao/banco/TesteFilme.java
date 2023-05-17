package com.mycompany.conexao.banco;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class TesteFilme {
    public static void main(String[] args) {
        Conexao conexao = new Conexao();
        JdbcTemplate con = conexao.getConnection();
        
        con.execute("drop table if exists filme;");
        
        con.execute("CREATE TABLE filme("
                + "id INT PRIMARY KEY AUTO_INCREMENT,"
                + "nome VARCHAR(45),"
                + "ano_lancamento INT)");
        
        con.update("insert into filme values(null, 'Shrek', 2023)");
        
        String novoFilme = "Her";
        Integer anoLancamento = 2013;
        con.update(String.format("insert into filme values (null, '%s', %d)", novoFilme, anoLancamento));
        
        String novoFilme2 = "JogadorNumero1";
        Integer anoLancamento2 = 2017;
        con.update(String.format("insert into filme values (null, '%s', %d)", novoFilme2, anoLancamento2));
        
        List<Filme> filmes = con.query("select * from filme;", new BeanPropertyRowMapper(Filme.class));
        
        System.out.println(filmes);
    }
}
