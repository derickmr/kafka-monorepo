package br.com.unisinos.kafkaconsumerdemo.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface ItemCarrinhoStream {

    @Input("carrinho-compras-v1")
    SubscribableChannel input();
}

