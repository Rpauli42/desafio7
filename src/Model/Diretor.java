package Model;

public class Diretor {

    private Integer id;
    private String nome;
    private String cpf;
    private Double salario;
    private Double bonus;

    public Diretor(Integer id, String nome, String cpf, Double salario, Double bonus) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.bonus = bonus;
    }
    public Diretor(){

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

    public Double getBonus() {
        return bonus;
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

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }
}
