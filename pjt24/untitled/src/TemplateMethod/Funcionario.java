package TemplateMethod;

public abstract class Funcionario {
    private int codigo;
    protected String nome;
    protected float salario;

    public Funcionario() {
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public abstract float calcularSalario();

    public String getTipo() {
        return "Funcionario";
    }

    public String getInfo() {
        return getTipo() + "{codigo=" + codigo + ", nome='" + nome + "', salario=" + salario + "}";
    }
}




