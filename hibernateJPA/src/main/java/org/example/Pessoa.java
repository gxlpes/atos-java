package org.example;

import java.io.Serial;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

// define a entidade que será a tabela no banco de dados
@Entity
public class Pessoa implements Serializable {

    // Serializable dá a capacidade da classe produzir um formato em que os dados do objeto sejam usados de forma externa ao código
    // em geral, ele é persistido em alguma forma de armazenamento temporário ou permanente

    @Serial
    private static final long serialVersionUID = 1L;

    // uso de @id para identificação de chave primária no banco de dados
    // @GeneratedValue quando a geração da chave primária deve ser do próprio banco de dados

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String nome;
    String email;
    String cargo;

    public Pessoa(Integer id, String nome, String email, String cargo) {
        super();
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cargo = cargo;
    }

    public Pessoa () {

    }

    @Override
    public String toString() {
        return "Pessoa [id=" + id + ", nome=" + nome + ", email=" + email + ", cargo=" + cargo + "]";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}