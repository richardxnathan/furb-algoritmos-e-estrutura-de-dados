package model.encadeada;

import org.junit.Test;
import static org.junit.Assert.*;

public class FilaListaTest {
    
    @Test
    public void test_01() {
        FilaLista<Integer> fila = new FilaLista();
        
        assertTrue(fila.estaVazia());
    }
    
    @Test
    public void test_02() {
        FilaLista<Integer> fila = new FilaLista();
        
        fila.inserir(10);
        
        assertFalse(fila.estaVazia());
    }
    
    @Test
    public void test_03() {
        FilaLista<Integer> fila = new FilaLista();
        
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        
        assertEquals(10, fila.retirar().intValue());
        assertEquals(20, fila.retirar().intValue());
        assertEquals(30, fila.retirar().intValue());
        assertTrue(fila.estaVazia());
    }
    
    @Test
    public void test_04() {
        FilaLista<Integer> fila = new FilaLista();
        
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        
        assertEquals(10, fila.peek().intValue());
        assertEquals(10, fila.retirar().intValue());
    }
    
    @Test
    public void test_05() {
        FilaLista<Integer> fila = new FilaLista();
        
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        fila.liberar();
        
        assertTrue(fila.estaVazia());;
    }

}
