

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

/**
 * A classe de teste TesteGrafo.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */
public class TesteGrafo
{
    /**
     * Construtor default para a classe de teste TesteGrafo
     */
    public TesteGrafo()
    {
    }

    /**
     * Define a 'fixture' do teste.
     *
     * Chamado antes de cada método de caso de teste.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Desfaz a 'fixture' do teste.
     *
     * Chamado após cada método de teste de caso.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public static void main(String[] args)
    {
        Grafo exemplo = new Grafo(4);
        exemplo.addAresta(0,1);
        exemplo.addAresta(0,4);
        exemplo.addAresta(1,2);
        exemplo.addAresta(1,3);
        exemplo.addAresta(1,4);
        exemplo.addAresta(2,3);
        exemplo.addAresta(3,4);
        
        System.out.println("0 e 1 sao vizinhos: " + exemplo.Vizinhos(0, 1)); // true
        System.out.println("0 e 3 sao vizinhos: " + exemplo.Vizinhos(0, 3)); // false
         
    }
}

