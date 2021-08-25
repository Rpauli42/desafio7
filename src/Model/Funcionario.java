package Model;

public class Funcionario {

    private Integer id;
    private String nome;
    private String cpf;
    private Double salario;

    public Funcionario(Integer id, String nome, String cpf, Double salario) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public Funcionario(){

    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getSalario() {
        return salario;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
