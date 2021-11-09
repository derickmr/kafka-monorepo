package br.com.unisinos.kafkaconsumerdemo.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ItemDTO {
    private Long idItem;
    private int quantidade;
}
