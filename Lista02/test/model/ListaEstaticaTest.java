/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author richa
 */
public class ListaEstaticaTest {
    
    @Test
    public void test_01() {
        ListaEstatica list = new ListaEstatica();
        
        list.inserir(5);
        list.inserir(10);
        list.inserir(15);
        list.inserir(20);
        
        assertEquals("[5, 10, 15, 20]", list.toString());
    }
    
    @Test
    public void test_02() {
        ListaEstatica list = new ListaEstatica();
        
        list.inserir(5);
        list.inserir(10);
        list.inserir(15);
        list.inserir(20);
        
        assertEquals(4, list.getTamanho());
    }
    
    @Test
    public void test_03() {
        ListaEstatica list = new ListaEstatica();
        
        list.inserir(5);
        list.inserir(10);
        list.inserir(15);
        list.inserir(20);
        
        assertEquals(2, list.buscar(15));
    }
    
    @Test
    public void test_04() {
        ListaEstatica list = new ListaEstatica();
        
        list.inserir(5);
        list.inserir(10);
        list.inserir(15);
        list.inserir(20);
        
        assertEquals(-1, list.buscar(30));
    }
    
    @Test
    public void test_05() {
        ListaEstatica list = new ListaEstatica();
        
        list.inserir(5);
        list.inserir(10);
        list.inserir(15);
        list.inserir(20);
        
        list.retirar(10);
        
        assertEquals(3, list.getTamanho());
    }
    
    @Test
    public void test_06() {
        ListaEstatica list = new ListaEstatica();
        
        list.inserir(1);
        list.inserir(2);
        list.inserir(3);
        list.inserir(4);
        list.inserir(5);
        list.inserir(6);
        list.inserir(7);
        list.inserir(8);
        list.inserir(9);
        list.inserir(10);
        list.inserir(11);
        list.inserir(12);
        list.inserir(13);
        list.inserir(14);
        list.inserir(15);
        
        assertEquals(15, list.getTamanho());
    }
    
    @Test
    public void test_07() {
        ListaEstatica list = new ListaEstatica();
        
        list.inserir(5);
        list.inserir(10);
        list.inserir(15);
        list.inserir(20);
        
        assertEquals(20, list.obterElemento(3));
    }
    
    @Test
    public void test_08() {
        ListaEstatica list = new ListaEstatica();
        
        list.inserir(5);
        list.inserir(10);
        list.inserir(15);
        list.inserir(20);
        
        assertThrows(IndexOutOfBoundsException.class, () -> {list.obterElemento(5);});
    }
    
    @Test
    public void test_09() {
        ListaEstatica list = new ListaEstatica();
        
        list.inserir(5);
        list.inserir(10);
        list.inserir(15);
        list.inserir(20);
        
        list.liberar();
        
        assertTrue(list.estaVazia());
    }
    
    @Test
    public void test_10() {       
        ListaEstatica list = new ListaEstatica();
        
        list.inserir(5);
        list.inserir(10);
        list.inserir(15);
        list.inserir(20);
        list.inverter();
        
        assertEquals("[20, 15, 10, 5]", list.toString());
    }
    
    @Test
    public void test_11() {
        ListaEstatica list = new ListaEstatica();
        
        list.inserir(5);
        list.inserir(10);
        list.inserir(15);
        list.inserir(20);
        list.inserir(25);
        list.inverter();
        
        assertEquals("[25, 20, 15, 10, 5]", list.toString());
    }
    
    
}
