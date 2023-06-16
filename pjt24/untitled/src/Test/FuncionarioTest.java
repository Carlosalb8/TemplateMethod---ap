package Test;

import TemplateMethod.Assistente;
import TemplateMethod.Gerente;
import org.junit.Test;

import static org.junit.Assert.*;

public class FuncionarioTest {

    @Test
    public void testCalcularSalarioGerente() {
        Gerente gerente = new Gerente();
        gerente.setNome("João");
        gerente.setCodigo(1);
        gerente.setSalario(5000.0f);
        float salarioCalculado = gerente.calcularSalario();
        assertEquals(6000.0f, salarioCalculado, 0.01);
    }

    @Test
    public void testCalcularSalarioAssistente() {
        Assistente assistente = new Assistente();
        assistente.setNome("Maria");
        assistente.setCodigo(2);
        assistente.setSalario(3000.0f);
        float salarioCalculado = assistente.calcularSalario();
        assertEquals(3300.0f, salarioCalculado, 0.01);
    }

    @Test
    public void testGetInfoGerente() {
        Gerente gerente = new Gerente();
        gerente.setNome("João");
        gerente.setCodigo(1);
        gerente.setSalario(5000.0f);
        String info = gerente.getInfo();
        assertEquals("Gerente{codigo=1, nome='João', salario=5000.0}", info);
    }

    @Test
    public void testGetInfoAssistente() {
        Assistente assistente = new Assistente();
        assistente.setNome("Maria");
        assistente.setCodigo(2);
        assistente.setSalario(3000.0f);
        String info = assistente.getInfo();
        assertEquals("Assistente{codigo=2, nome='Maria', salario=3000.0}", info);
    }
}
