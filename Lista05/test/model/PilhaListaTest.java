package model;

import org.junit.Test;
import static org.junit.Assert.*;


public class PilhaListaTest {
    
    @Test
    public void test_01() {
        PilhaLista pilha = new PilhaLista();

        assertTrue(pilha.estaVazia());
    }
    
    @Test
    public void test_02() {
        PilhaLista pilha = new PilhaLista();
        
        pilha.push(10);

        assertFalse(pilha.estaVazia());
    }
    
    @Test
    public void test_03() {
        PilhaLista pilha = new PilhaLista();
        
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        assertEquals(30, pilha.pop());
        assertEquals(20, pilha.pop());
        assertEquals(10, pilha.pop());
        assertTrue(pilha.estaVazia());
    }
    
    @Test
    public void test_04() {
        PilhaLista pilha = new PilhaLista();
        
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        assertEquals(30, pilha.peek());
        assertEquals(30, pilha.pop());
    }
    
    @Test
    public void test_05() {
        PilhaLista pilha = new PilhaLista();
        
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.liberar();
        
        assertTrue(pilha.estaVazia());
    }
    
}
