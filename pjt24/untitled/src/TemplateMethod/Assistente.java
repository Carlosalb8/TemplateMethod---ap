package TemplateMethod;

public class Assistente extends Funcionario {
    public Assistente() {
    }

    public float calcularSalario() {
        return salario * 1.1F;
    }

    public String getTipo() {
        return "Assistente";
    }
}
