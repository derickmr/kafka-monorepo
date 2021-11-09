package br.com.unisinos.kafkademo.stream;

import br.com.unisinos.kafkademo.dto.ItemCarrinhoDTO;
import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@EnableBinding(IItemCarrinhoStream.class)
public class ItemCarrinhoProducerImpl implements IItemCarrinhoProducer {
    private final IItemCarrinhoStream itemCarrinhoStream;
    private final Gson gson;

    public void adicionaItemCarrinho(ItemCarrinhoDTO itemCarrinhoDTO) {
        itemCarrinhoStream.output()
                .send(getMessage(itemCarrinhoDTO));
    }

    private Message<String> getMessage(ItemCarrinhoDTO itemCarrinhoDTO) {
        return MessageBuilder.withPayload(gson.toJson(itemCarrinhoDTO)).build();
    }

}
