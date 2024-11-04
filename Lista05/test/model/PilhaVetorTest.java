package model;

import exception.PilhaCheiaException;
import exception.PilhaVaziaException;
import org.junit.Test;
import static org.junit.Assert.*;


public class PilhaVetorTest {
    
    @Test
    public void test_01() {
        PilhaVetor pilha = new PilhaVetor(10);

        assertTrue(pilha.estaVazia());
    }
    
    @Test
    public void test_02() {
        PilhaVetor pilha = new PilhaVetor(5);
        
        pilha.push(5);

        assertFalse(pilha.estaVazia());
    }
    
    @Test
    public void test_03() {
        PilhaVetor pilha = new PilhaVetor(10);
        
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
        PilhaVetor pilha = new PilhaVetor(3);
        
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        assertThrows(PilhaCheiaException.class, () -> {pilha.push(40);});
    }
    
    @Test
    public void test_05() {
        PilhaVetor pilha = new PilhaVetor(0);

        assertThrows(PilhaVaziaException.class, () -> {pilha.pop();});
    }
    
    @Test
    public void test_06() {
        PilhaVetor pilha = new PilhaVetor(5);
        
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        assertEquals(30, pilha.peek());
    }
    
    @Test
    public void test_07() {
        PilhaVetor pilha = new PilhaVetor(5);
        
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.liberar();

        assertTrue(pilha.estaVazia());
    }
    
   @Test
    public void test_08() {
        PilhaVetor pilha = new PilhaVetor(5);
        
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        
        PilhaVetor pilha2 = new PilhaVetor(5);
        
        pilha2.push(40);
        pilha2.push(50);
        
        pilha.concatenar(pilha2);

        assertEquals("50,40,30,20,10", pilha.toString());
    }
    
}
