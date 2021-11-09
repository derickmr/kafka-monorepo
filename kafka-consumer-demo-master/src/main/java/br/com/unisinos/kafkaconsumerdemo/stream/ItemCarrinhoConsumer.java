package br.com.unisinos.kafkaconsumerdemo.stream;


import br.com.unisinos.kafkaconsumerdemo.dto.ItemCarrinhoDTO;

public interface ItemCarrinhoConsumer {
    void adicionaItemCarrinho(ItemCarrinhoDTO itemCarrinhoDTO);
}

