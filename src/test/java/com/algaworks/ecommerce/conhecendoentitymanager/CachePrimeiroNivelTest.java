package com.algaworks.ecommerce.conhecendoentitymanager;

import com.algaworks.ecommerce.EntityManagerTest;
import com.algaworks.ecommerce.model.Produto;
import org.junit.Test;

public class CachePrimeiroNivelTest extends EntityManagerTest {
    @Test
    public void verificarCache() {
        Produto produto = entityManager.find(Produto.class, 1);
        System.out.println(produto.getNome());

        System.out.println("------------------------------");

//        entityManager.close();
//        entityManager = entityManagerFactory.createEntityManager();

        produto.setNome("Copo 3d");
        Produto produtoResgatado = entityManager.find(Produto.class, produto.getId());
        System.out.println(produtoResgatado.getNome());
        System.out.println("------------------------------");

        entityManager.detach(produto);
        Produto produtoResgatado2 = entityManager.find(Produto.class, produto.getId());
        System.out.println(produtoResgatado2.getNome());


    }
}
