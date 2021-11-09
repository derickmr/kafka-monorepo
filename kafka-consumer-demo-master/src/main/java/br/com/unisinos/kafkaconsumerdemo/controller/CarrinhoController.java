package br.com.unisinos.kafkaconsumerdemo.controller;

import br.com.unisinos.kafkaconsumerdemo.service.CarrinhoService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("carrinhos")
public class CarrinhoController {

    private final CarrinhoService carrinhoService;

    @GetMapping("/{idCarrinho}")
    public ResponseEntity<List<Long>> consultaCarrinho(@PathVariable Long idCarrinho) {
        return ok(carrinhoService.consultaItensCarrinho(idCarrinho));
    }

}