package model;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArvoreBinariaTest {
    
    @Test
    public void test_01() {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
        
        assertTrue(arvore.estaVazia());
    }
    
    @Test
    public void test_02() {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
        NoArvoreBinaria no = new NoArvoreBinaria(5);
        
        arvore.setRaiz(no);
        
        assertFalse(arvore.estaVazia());
    }
    
    @Test
    public void test_03() {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
        
        NoArvoreBinaria no6 = new NoArvoreBinaria(6);
        NoArvoreBinaria no5 = new NoArvoreBinaria(5);
        NoArvoreBinaria no4 = new NoArvoreBinaria(4);
        NoArvoreBinaria no3 = new NoArvoreBinaria(3, no5, no6);
        NoArvoreBinaria no2 = new NoArvoreBinaria(2, null, no4);
        NoArvoreBinaria no = new NoArvoreBinaria(1, no2, no3);
        
        arvore.setRaiz(no);

        assertEquals("<1<2<><4<><>>><3<5<><>><6<><>>>>", arvore.toString());
    }
    
    @Test
    public void test_04() {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
        
        NoArvoreBinaria no6 = new NoArvoreBinaria(6);
        NoArvoreBinaria no5 = new NoArvoreBinaria(5);
        NoArvoreBinaria no4 = new NoArvoreBinaria(4);
        NoArvoreBinaria no3 = new NoArvoreBinaria(3, no5, no6);
        NoArvoreBinaria no2 = new NoArvoreBinaria(2, null, no4);
        NoArvoreBinaria no = new NoArvoreBinaria(1, no2, no3);
        
        arvore.setRaiz(no);

        assertTrue(arvore.pertence(1));
    }
    
    @Test
    public void test_05() {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
        
        NoArvoreBinaria no6 = new NoArvoreBinaria(6);
        NoArvoreBinaria no5 = new NoArvoreBinaria(5);
        NoArvoreBinaria no4 = new NoArvoreBinaria(4);
        NoArvoreBinaria no3 = new NoArvoreBinaria(3, no5, no6);
        NoArvoreBinaria no2 = new NoArvoreBinaria(2, null, no4);
        NoArvoreBinaria no = new NoArvoreBinaria(1, no2, no3);
        
        arvore.setRaiz(no);

        assertTrue(arvore.pertence(3));
    }
    
    @Test
    public void test_06() {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
        
        NoArvoreBinaria no6 = new NoArvoreBinaria(6);
        NoArvoreBinaria no5 = new NoArvoreBinaria(5);
        NoArvoreBinaria no4 = new NoArvoreBinaria(4);
        NoArvoreBinaria no3 = new NoArvoreBinaria(3, no5, no6);
        NoArvoreBinaria no2 = new NoArvoreBinaria(2, null, no4);
        NoArvoreBinaria no = new NoArvoreBinaria(1, no2, no3);
        
        arvore.setRaiz(no);

        assertTrue(arvore.pertence(6));
    }
    
    @Test
    public void test_07() {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
        
        NoArvoreBinaria no6 = new NoArvoreBinaria(6);
        NoArvoreBinaria no5 = new NoArvoreBinaria(5);
        NoArvoreBinaria no4 = new NoArvoreBinaria(4);
        NoArvoreBinaria no3 = new NoArvoreBinaria(3, no5, no6);
        NoArvoreBinaria no2 = new NoArvoreBinaria(2, null, no4);
        NoArvoreBinaria no = new NoArvoreBinaria(1, no2, no3);
        
        arvore.setRaiz(no);

        assertFalse(arvore.pertence(10));
    }
    
    @Test
    public void test_08() {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
        
        NoArvoreBinaria no6 = new NoArvoreBinaria(6);
        NoArvoreBinaria no5 = new NoArvoreBinaria(5);
        NoArvoreBinaria no4 = new NoArvoreBinaria(4);
        NoArvoreBinaria no3 = new NoArvoreBinaria(3, no5, no6);
        NoArvoreBinaria no2 = new NoArvoreBinaria(2, null, no4);
        NoArvoreBinaria no = new NoArvoreBinaria(1, no2, no3);
        
        arvore.setRaiz(no);

        //assertEquals(6, arvore.contarNos());
        assertFalse(arvore.isDegenerada());
    }
    
    @Test
    public void test_09() {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
        
        NoArvoreBinaria no4 = new NoArvoreBinaria(4);
        NoArvoreBinaria no3 = new NoArvoreBinaria(3, no4, null);
        NoArvoreBinaria no2 = new NoArvoreBinaria(2, no3, null);
        NoArvoreBinaria no = new NoArvoreBinaria(1, no2, null);
        
        arvore.setRaiz(no);

        assertTrue(arvore.isDegenerada());
    }
    
}
