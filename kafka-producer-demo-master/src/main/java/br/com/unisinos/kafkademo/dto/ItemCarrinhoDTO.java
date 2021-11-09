package br.com.unisinos.kafkademo.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ItemCarrinhoDTO {
    private long idCarrinho;
    private long idItem;
    private int quantidade;
}
