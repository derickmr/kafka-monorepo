package br.com.unisinos.kafkademo.controller;

import br.com.unisinos.kafkademo.dto.ItemCarrinhoDTO;
import br.com.unisinos.kafkademo.stream.IItemCarrinhoProducer;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.ACCEPTED;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("carrinho")
public class CarrinhoController {

    private final IItemCarrinhoProducer itemCarrinhoProducer;

    @PostMapping("/item")
    @ResponseStatus(ACCEPTED)
    public void adicionaItem(@RequestBody ItemCarrinhoDTO itemCarrinhoDTO) {
        log.debug("Enviando item para o carrinho " + itemCarrinhoDTO);
        itemCarrinhoProducer.adicionaItemCarrinho(itemCarrinhoDTO);
    }

}
