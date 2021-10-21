package com.algaworks.ecommerce.iniciandocomjpa;

import com.algaworks.ecommerce.EntityManagerTest;
import com.algaworks.ecommerce.model.Cliente;
import com.algaworks.ecommerce.model.Produto;
import org.junit.Assert;
import org.junit.Test;

public class PrimeiroCrudTest extends EntityManagerTest {
    @Test
    public void inserirRegistro() {
        Cliente cliente = new Cliente();
        cliente.setId(3);
        cliente.setNome("Edison Martins");

        entityManager.getTransaction().begin();
        entityManager.persist(cliente);
        // entityManager.flush();
        entityManager.getTransaction().commit();

        entityManager.clear();

        Cliente clienteVerificacao = entityManager.find(Cliente.class, cliente.getId());
        Assert.assertNotNull(clienteVerificacao);


    }

    @Test
    public void busarPorIdentificador() {
        Cliente clienteVerificacao = entityManager.find(Cliente.class, 1);
        Assert.assertEquals("Fernando Medeiros", clienteVerificacao.getNome());
    }

    @Test
    public void atualizarRegistro() {
        Cliente cliente = entityManager.find(Cliente.class, 1);
        entityManager.getTransaction().begin();
        cliente.setNome("Arthur Martins");
        // entityManager.flush();
        entityManager.getTransaction().commit();

        entityManager.clear();

        Cliente clienteVerificacao = entityManager.find(Cliente.class, cliente.getId());
        Assert.assertEquals("Arthur Martins", clienteVerificacao.getNome());
    }

    @Test
    public void removerRegistro() {
        Cliente cliente = entityManager.find(Cliente.class, 1);
        entityManager.getTransaction().begin();
        entityManager.remove(cliente);
        entityManager.getTransaction().commit();

        Cliente clienteVerificacao = entityManager.find(Cliente.class, cliente.getId());
        Assert.assertNull(clienteVerificacao);
    }
}
