package db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity // irá criar uma tabela com o mesmo nome da classe
public class Aluno implements Serializable {
    private static final long serialVersionUID = 1;
    // irá criar os atributos da tabela baseados nos atributos da classe
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String cpf;
    private String nome;
    private String email;
    private String estado;
    private String cidade;
    private Integer ano;
    private Integer semestre;

    public Aluno() {

    }

    public Aluno(Integer id, String cpf, String nome, String email, String estado, String cidade, Integer ano, Integer semestre) {
        super();
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.estado = estado;
        this.cidade = cidade;
        this.ano = ano;
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "Alunos{" +
                "id=" + id +
                ", cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", estado='" + estado + '\'' +
                ", cidade='" + cidade + '\'' +
                ", ano='" + ano + '\'' +
                ", semestre='" + semestre + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public int getSemestre() {
        return semestre;
    }
}