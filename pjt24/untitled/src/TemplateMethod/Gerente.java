package TemplateMethod;

public class Gerente extends Funcionario {
    public Gerente() {
    }

    public float calcularSalario() {
        return salario * 1.2F;
    }

    public String getTipo() {
        return "Gerente";
    }
}
