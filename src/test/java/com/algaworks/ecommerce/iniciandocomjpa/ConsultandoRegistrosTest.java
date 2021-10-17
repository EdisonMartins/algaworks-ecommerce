package com.algaworks.ecommerce.iniciandocomjpa;

import com.algaworks.ecommerce.EntityManagerTest;
import com.algaworks.ecommerce.model.Favorito;
import com.algaworks.ecommerce.model.Produto;
import org.junit.*;

public class ConsultandoRegistrosTest extends EntityManagerTest {


    @Test
    public void busarPorIdentificador() {
        Produto produto = entityManager.find(Produto.class, 1);
//        Produto produto = entityManager.getReference(Produto.class, 1);
        Assert.assertNotNull(produto);
        Assert.assertEquals("Kindle", produto.getNome());
    }

    @Test
    public void atualizarAReferencia() {
        Produto produto = entityManager.find(Produto.class, 1);
        produto.setNome("Microfone Samson");
        entityManager.refresh(produto);
        Assert.assertEquals("Kindle", produto.getNome());
    }

    @Test
    public void salvaFavorito() {
        Produto produto = entityManager.getReference(Produto.class, 1);
        Favorito favorito = new Favorito();
        favorito.setProduto(produto);
        entityManager.getTransaction().begin();
        entityManager.persist(favorito);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
