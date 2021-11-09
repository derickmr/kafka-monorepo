package br.com.unisinos.kafkademo.stream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface IItemCarrinhoStream {

    @Output("carrinho-compras-v1")
    MessageChannel output();
}

