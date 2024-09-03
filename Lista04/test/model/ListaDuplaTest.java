package model;

import static junit.framework.Assert.*;
import org.junit.Test;

public class ListaDuplaTest {
    
    @Test
    public void test_01() {
        ListaDupla lista = new ListaDupla();
        
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        assertEquals("20, 15, 10, 5", lista.toString());
    }
    
    @Test
    public void test_02() {
        ListaDupla lista = new ListaDupla();
        
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        assertEquals(20, lista.buscar(20).getInfo());
    }
    
    @Test
    public void test_03() {
        ListaDupla lista = new ListaDupla();
        
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        assertEquals(10, lista.buscar(10).getInfo());
    }
    
    @Test
    public void test_04() {
        ListaDupla lista = new ListaDupla();
        
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        lista.retirar(20);
        
        assertEquals("15, 10, 5", lista.toString());
    }
    
    @Test
    public void test_05() {
        ListaDupla lista = new ListaDupla();
        
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        lista.retirar(10);
        
        assertEquals("20, 15, 5", lista.toString());
    }
    
    @Test
    public void test_06() {
        ListaDupla lista = new ListaDupla();
        
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        lista.retirar(5);
        
        assertEquals("20, 15, 10", lista.toString());
    }
    
    @Test
    public void test_07() {
        ListaDupla lista = new ListaDupla();
        
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        
        NoListaDupla no5 = lista.buscar(5);
        NoListaDupla no10 = lista.buscar(10);
        NoListaDupla no15 = lista.buscar(15);
        NoListaDupla no20 = lista.buscar(20);
        
        lista.liberar();
        
        assertNull(no5.getAnterior());
        assertNull(no5.getProximo());
        assertNull(no10.getAnterior());
        assertNull(no10.getProximo());
        assertNull(no15.getAnterior());
        assertNull(no15.getProximo());
        assertNull(no20.getAnterior());
        assertNull(no20.getProximo());
        
    }
    
}
