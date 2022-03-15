package com.example.filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class AtividadeFilter {

    public static void main(String[] args) {

        Produto p1 = new Produto("Belo mundo, onde você está? ", 19.99, 0.3, 0);
        Produto p2 = new Produto("Devoradores de estrelas ", 19.99, 0.3, 0);

        List<Produto> produtos = Arrays.asList(p1, p2);

        Predicate<Produto> promocao = p -> p.desconto >= 0.3;
        Function<Produto, String> propagandaPromocional =
                p -> "Só hoje " + p.nome + "por R$ " + p.preco;

        produtos.stream()
                .filter(promocao)
                .map(propagandaPromocional)
                .forEach(System.out::println);



    }
}
