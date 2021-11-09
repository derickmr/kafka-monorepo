package br.com.unisinos.kafkaconsumerdemo.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.google.common.collect.Lists.newArrayList;
import static java.util.Optional.ofNullable;

@Service
public class CarrinhoServiceImpl implements CarrinhoService {

    private final Map<Long, List<Long>> carrinhosDeCompra = new HashMap<>();

    @Override
    public List<Long> consultaItensCarrinho(Long idCarrinho) {
        return carrinhosDeCompra.get(idCarrinho);
    }

    @Override
    public void adicionaItemCarrinho(Long idCarrinho, Long idItem) {
        ofNullable(carrinhosDeCompra.get(idCarrinho))
                .ifPresentOrElse(carrinho -> carrinho.add(idItem),
                        () -> carrinhosDeCompra.put(idCarrinho, newArrayList(idItem)));
    }
}
