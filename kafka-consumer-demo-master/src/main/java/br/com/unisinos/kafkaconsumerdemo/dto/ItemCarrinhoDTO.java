package br.com.unisinos.kafkaconsumerdemo.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ItemCarrinhoDTO {
    private long idCarrinho;
    private long idItem;
}
