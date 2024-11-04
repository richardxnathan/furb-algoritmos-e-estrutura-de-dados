package model;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArvoreTest {

    @Test
    public void test_01() {
        NoArvore<Integer> no10 = new NoArvore(10);
        NoArvore<Integer> no9 = new NoArvore(9);
        no9.setProximo(no10);
        NoArvore<Integer> no4 = new NoArvore(4);
        no4.setPrimeiro(no9);

        NoArvore<Integer> no8 = new NoArvore(8);
        NoArvore<Integer> no3 = new NoArvore(3);
        no3.setPrimeiro(no8);

        NoArvore<Integer> no7 = new NoArvore(7);
        NoArvore<Integer> no6 = new NoArvore(6);
        no6.setProximo(no7);
        NoArvore<Integer> no5 = new NoArvore(5);
        no5.setProximo(no6);
        NoArvore<Integer> no2 = new NoArvore(2);
        no2.setPrimeiro(no5);
        no3.setProximo(no4);
        no2.setProximo(no3);

        NoArvore<Integer> no1 = new NoArvore(1);
        no1.setPrimeiro(no2);

        Arvore<Integer> arvore = new Arvore<>();
        arvore.setRaiz(no1);

        assertEquals("<1<2<5><6><7>><3<8>><4<9><10>>>", arvore.toString());
    }

    @Test
    public void test_02() {
        NoArvore<Integer> no10 = new NoArvore(10);
        NoArvore<Integer> no9 = new NoArvore(9);
        no9.setProximo(no10);
        NoArvore<Integer> no4 = new NoArvore(4);
        no4.setPrimeiro(no9);

        NoArvore<Integer> no8 = new NoArvore(8);
        NoArvore<Integer> no3 = new NoArvore(3);
        no3.setPrimeiro(no8);

        NoArvore<Integer> no7 = new NoArvore(7);
        NoArvore<Integer> no6 = new NoArvore(6);
        no6.setProximo(no7);
        NoArvore<Integer> no5 = new NoArvore(5);
        no5.setProximo(no6);
        NoArvore<Integer> no2 = new NoArvore(2);
        no2.setPrimeiro(no5);
        no3.setProximo(no4);
        no2.setProximo(no3);

        NoArvore<Integer> no1 = new NoArvore(1);
        no1.setPrimeiro(no2);

        Arvore<Integer> arvore = new Arvore<>();
        arvore.setRaiz(no1);

        assertTrue(arvore.pertence(1));
        assertTrue(arvore.pertence(2));
        assertTrue(arvore.pertence(3));
        assertTrue(arvore.pertence(4));
        assertTrue(arvore.pertence(5));
        assertTrue(arvore.pertence(6));
        assertTrue(arvore.pertence(7));
        assertTrue(arvore.pertence(8));
        assertTrue(arvore.pertence(9));
        assertTrue(arvore.pertence(10)); 
    }

    @Test
    public void test_03() {
        NoArvore<Integer> no10 = new NoArvore(10);
        NoArvore<Integer> no9 = new NoArvore(9);
        no9.setProximo(no10);
        NoArvore<Integer> no4 = new NoArvore(4);
        no4.setPrimeiro(no9);

        NoArvore<Integer> no8 = new NoArvore(8);
        NoArvore<Integer> no3 = new NoArvore(3);
        no3.setPrimeiro(no8);

        NoArvore<Integer> no7 = new NoArvore(7);
        NoArvore<Integer> no6 = new NoArvore(6);
        no6.setProximo(no7);
        NoArvore<Integer> no5 = new NoArvore(5);
        no5.setProximo(no6);
        NoArvore<Integer> no2 = new NoArvore(2);
        no2.setPrimeiro(no5);
        no3.setProximo(no4);
        no2.setProximo(no3);

        NoArvore<Integer> no1 = new NoArvore(1);
        no1.setPrimeiro(no2);

        Arvore<Integer> arvore = new Arvore<>();
        arvore.setRaiz(no1);

        assertFalse(arvore.pertence(55));
    }

    @Test
    public void test_04() {

        NoArvore<Integer> no10 = new NoArvore(10);
        NoArvore<Integer> no9 = new NoArvore(9);
        no9.setProximo(no10);
        NoArvore<Integer> no4 = new NoArvore(4);
        no4.setPrimeiro(no9);

        NoArvore<Integer> no8 = new NoArvore(8);
        NoArvore<Integer> no3 = new NoArvore(3);
        no3.setPrimeiro(no8);

        NoArvore<Integer> no7 = new NoArvore(7);
        NoArvore<Integer> no6 = new NoArvore(6);
        no6.setProximo(no7);
        NoArvore<Integer> no5 = new NoArvore(5);
        no5.setProximo(no6);
        NoArvore<Integer> no2 = new NoArvore(2);
        no2.setPrimeiro(no5);
        no3.setProximo(no4);
        no2.setProximo(no3);

        NoArvore<Integer> no1 = new NoArvore(1);
        no1.setPrimeiro(no2);

        Arvore<Integer> arvore = new Arvore<>();
        arvore.setRaiz(no1);

        int total = arvore.contarNos();

        assertEquals(10, total);
    }
    
    @Test
    public void test_05() {
        NoArvore<Integer> no10 = new NoArvore(10);
        NoArvore<Integer> no9 = new NoArvore(9);
        no9.setPrimeiro(no10);
        NoArvore<Integer> no8 = new NoArvore(8);
        no8.setProximo(no9);
        NoArvore<Integer> no7 = new NoArvore(7);
        no7.setPrimeiro(no8);
        NoArvore<Integer> no6 = new NoArvore(6);
        no6.setProximo(no7);
        NoArvore<Integer> no4 = new NoArvore(4);
        NoArvore<Integer> no3 = new NoArvore(3);
        no3.setPrimeiro(no4);
        NoArvore<Integer> no5 = new NoArvore(5);
        no3.setProximo(no5);
        NoArvore<Integer> no2 = new NoArvore(2);
        no2.setPrimeiro(no3);
        no2.setProximo(no6);
        NoArvore<Integer> no1 = new NoArvore(1);
        no1.setPrimeiro(no2);

        Arvore<Integer> arvore = new Arvore<>();
        arvore.setRaiz(no1);

        int total = arvore.contarNos();
        
        assertEquals(total, arvore.contarNos());
        assertTrue(arvore.pertence(1));
        assertTrue(arvore.pertence(2));
        assertTrue(arvore.pertence(3));
        assertTrue(arvore.pertence(4));
        assertTrue(arvore.pertence(5));
        assertTrue(arvore.pertence(6));
        assertTrue(arvore.pertence(7));
        assertTrue(arvore.pertence(8));
        assertTrue(arvore.pertence(9));
        assertTrue(arvore.pertence(10)); 
        assertEquals("<1<2<3<4>><5>><6><7<8><9<10>>>>", arvore.toString());
    }
        @Test
    public void test_06() {
        NoArvore<Integer> no10 = new NoArvore(10);
        NoArvore<Integer> no9 = new NoArvore(9);
        no9.setPrimeiro(no10);
        NoArvore<Integer> no8 = new NoArvore(8);
        no8.setProximo(no9);
        NoArvore<Integer> no7 = new NoArvore(7);
        no7.setPrimeiro(no8);
        NoArvore<Integer> no6 = new NoArvore(6);
        no6.setProximo(no7);
        NoArvore<Integer> no4 = new NoArvore(4);
        NoArvore<Integer> no3 = new NoArvore(3);
        no3.setPrimeiro(no4);
        NoArvore<Integer> no5 = new NoArvore(5);
        no3.setProximo(no5);
        NoArvore<Integer> no2 = new NoArvore(2);
        no2.setPrimeiro(no3);
        no2.setProximo(no6);
        NoArvore<Integer> no1 = new NoArvore(1);
        no1.setPrimeiro(no2);

        Arvore<Integer> arvore = new Arvore<>();
        arvore.setRaiz(no1);
        
        assertEquals(5, arvore.contarFolhas());
    }
    
    @Test
    public void test_07() {

        NoArvore<Integer> no10 = new NoArvore(10);
        NoArvore<Integer> no9 = new NoArvore(9);
        no9.setProximo(no10);
        NoArvore<Integer> no4 = new NoArvore(4);
        no4.setPrimeiro(no9);

        NoArvore<Integer> no8 = new NoArvore(8);
        NoArvore<Integer> no3 = new NoArvore(3);
        no3.setPrimeiro(no8);

        NoArvore<Integer> no7 = new NoArvore(7);
        NoArvore<Integer> no6 = new NoArvore(6);
        no6.setProximo(no7);
        NoArvore<Integer> no5 = new NoArvore(5);
        no5.setProximo(no6);
        NoArvore<Integer> no2 = new NoArvore(2);
        no2.setPrimeiro(no5);
        no3.setProximo(no4);
        no2.setProximo(no3);

        NoArvore<Integer> no1 = new NoArvore(1);
        no1.setPrimeiro(no2);

        Arvore<Integer> arvore = new Arvore<>();
        arvore.setRaiz(no1);

        int total = arvore.contarFolhas();

        assertEquals(6, total);
    }
}
