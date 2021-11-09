package br.com.unisinos.kafkaconsumerdemo.stream;


import br.com.unisinos.kafkaconsumerdemo.dto.ItemCarrinhoDTO;
import br.com.unisinos.kafkaconsumerdemo.service.CarrinhoService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
@EnableBinding(ItemCarrinhoStream.class)
public class ItemCarrinhoConsumerImpl implements ItemCarrinhoConsumer {

    private final CarrinhoService carrinhoService;

    @Override
    @StreamListener("carrinho-compras-v1")
    public void adicionaItemCarrinho(ItemCarrinhoDTO itemCarrinhoDTO) {
        log.debug("Mensagem recebida " + itemCarrinhoDTO);
        carrinhoService.adicionaItemCarrinho(itemCarrinhoDTO.getIdCarrinho(), itemCarrinhoDTO.getIdItem());
    }
}