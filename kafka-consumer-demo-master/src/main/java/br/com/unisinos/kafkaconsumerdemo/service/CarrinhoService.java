package br.com.unisinos.kafkaconsumerdemo.service;

import java.util.List;

public interface CarrinhoService {
    List<Long> consultaItensCarrinho(Long idCarrinho);
    void adicionaItemCarrinho(Long idCarrinho, Long idItem);
}
