package model;

import model.vetor.FilaVetor;
import exception.FilaCheiaException;
import exception.FilaVaziaException;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class FilaVetorTest {

    @Test
    public void test_01() {
        FilaVetor fila = new FilaVetor<>(0);

        assertTrue(fila.estaVazia());
    }

    @Test
    public void test_02() {
        FilaVetor fila = new FilaVetor<>(5);

        fila.inserir(10);

        assertFalse(fila.estaVazia());
    }

    @Test
    public void test_03() {
        FilaVetor fila = new FilaVetor<>(10);

        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);

        assertEquals(10, fila.retirar());
        assertEquals(20, fila.retirar());
        assertEquals(30, fila.retirar());
        assertTrue(fila.estaVazia());
    }

    @Test
    public void test_04() {
        FilaVetor fila = new FilaVetor<>(3);

        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);

        assertThrows(FilaCheiaException.class, () -> {
            fila.inserir(40);
        });
    }

    @Test
    public void test_05() {
        FilaVetor fila = new FilaVetor<>(0);

        assertThrows(FilaVaziaException.class, () -> {
            fila.retirar();
        });
    }

    @Test
    public void test_6() {
        FilaVetor fila = new FilaVetor<>(5);

        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);

        assertEquals(10, fila.peek());
        assertEquals(10, fila.retirar());
    }
    
    @Test
    public void test_7() {
        FilaVetor fila = new FilaVetor<>(5);

        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        fila.liberar();

        assertTrue(fila.estaVazia());
    }

    @Test
    public void test_8() {
        FilaVetor fila = new FilaVetor<>(5);

        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);

        FilaVetor fila2 = new FilaVetor<>(3);

        fila2.inserir(40);
        fila2.inserir(50);

        FilaVetor f3 = fila.criarFilaConcatenada(fila2);

        assertEquals("10,20,30,40,50", f3.toString());
        assertEquals("10,20,30", fila.toString());
        assertEquals("40,50", fila2.toString());
    }
    
    @Test
    public void test_9() {
        FilaVetor fila = new FilaVetor<>(10);

        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        fila.inserir("A");
        fila.inserir("B");
        fila.inserir("C");
        fila.inserir("D");

        fila.retirar();
        fila.retirar();
        fila.retirar();

        fila.encolher();

        assertEquals("A,B,C,D", fila.toString());

    }

}
