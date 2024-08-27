package model;

import org.junit.Test;
import static org.junit.Assert.*;

public class ListaEncadeadaTest {
    
    @Test
    public void test_01() {
        ListaEncadeada lista = new ListaEncadeada();
        
        assertTrue(lista.estaVazia());
    }
    
    @Test
    public void test_02() {
        ListaEncadeada lista = new ListaEncadeada();
        
        lista.inserir(5);
        
        assertFalse(lista.estaVazia());
    }
    
    @Test
    public void test_03() {
        ListaEncadeada lista = new ListaEncadeada();
        
        lista.inserir(5);
        
        assertNotNull(lista.getPrimeiro());
        assertEquals(5, lista.getPrimeiro().getInfo());
        assertNull(lista.getPrimeiro().getProximo());
    }
    
    @Test
    public void test_04() {
        ListaEncadeada lista = new ListaEncadeada();
        
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        
        assertEquals(3, lista.obterComprimento());
        assertEquals(15, lista.obterNo(0).getInfo());
        assertEquals(10, lista.obterNo(1).getInfo());
        assertEquals(5, lista.obterNo(2).getInfo());
    }
    
    @Test
    public void test_05() {
        ListaEncadeada lista = new ListaEncadeada();
        
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        assertEquals(20, lista.buscar(20).getInfo());
    }
    
    @Test
    public void test_06() {
        ListaEncadeada lista = new ListaEncadeada();
        
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        assertEquals(15, lista.buscar(15).getInfo());
    }
    
    @Test
    public void test_07() {
        ListaEncadeada lista = new ListaEncadeada();
        
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        assertNull(lista.buscar(50));
    }
    
    @Test
    public void test_08() {
        ListaEncadeada lista = new ListaEncadeada();
        
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        lista.retirar(20);
        
        assertNull(lista.buscar(20));
    }
    
    @Test
    public void test_09() {
        ListaEncadeada lista = new ListaEncadeada();
        
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        lista.retirar(15);
        
        assertNull(lista.buscar(15));
    }
    
    @Test
    public void test_10() {
        ListaEncadeada lista = new ListaEncadeada();
        
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        assertEquals(20, lista.obterNo(0).getInfo());
    }
    
    @Test
    public void test_11() {
        ListaEncadeada lista = new ListaEncadeada();
        
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        assertEquals(5, lista.obterNo(3).getInfo());
    }
    
    @Test
    public void test_12() {
        ListaEncadeada lista = new ListaEncadeada();
        
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        assertThrows(IndexOutOfBoundsException.class, () -> {lista.obterNo(10);});
    }
    
    @Test
    public void test_13() {
        ListaEncadeada lista = new ListaEncadeada();
        
        assertEquals(0, lista.obterComprimento());
    }
    
    @Test
    public void test_14() {
        ListaEncadeada lista = new ListaEncadeada();
        
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        assertEquals(4, lista.obterComprimento());
    }
    
}
