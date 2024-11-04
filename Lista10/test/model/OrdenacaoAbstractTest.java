package model;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class OrdenacaoAbstractTest {
    
    @Test
    public void test_01() {
        OrdenacaoBolha<Integer> bolha = new OrdenacaoBolha<>();
        
        Integer[] vetor = {70,2,88,15,90,30};
        
        bolha.setInfo(vetor);
        bolha.ordenar();
        
        Integer[] vetorOrdenado = {2,15,30,70,88,90};
        
        Assert.assertArrayEquals(vetorOrdenado, bolha.getInfo());
        assertEquals("[2,15,30,70,88,90]", bolha.toString());
    }
    
    @Test
    public void test_02() {
        OrdenacaoBolhaOtimizada<Integer> bolha = new OrdenacaoBolhaOtimizada<>();
        
        Integer[] vetor = {70,2,88,15,90,30};
        
        bolha.setInfo(vetor);
        bolha.ordenar();
        
        Integer[] vetorOrdenado = {2,15,30,70,88,90};
        
        Assert.assertArrayEquals(vetorOrdenado, bolha.getInfo());
        assertEquals("[2,15,30,70,88,90]", bolha.toString());
    }
    
}
