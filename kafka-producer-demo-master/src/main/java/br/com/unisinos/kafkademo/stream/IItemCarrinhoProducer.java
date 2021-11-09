package br.com.unisinos.kafkademo.stream;

import br.com.unisinos.kafkademo.dto.ItemCarrinhoDTO;

public interface IItemCarrinhoProducer {
    void adicionaItemCarrinho(ItemCarrinhoDTO itemCarrinhoDTO);
}

