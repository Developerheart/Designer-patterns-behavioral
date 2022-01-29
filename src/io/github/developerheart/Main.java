package io.github.developerheart;

import io.github.developerheart.entidades.INSS;
import io.github.developerheart.entidades.Orcamento;
import io.github.developerheart.patterns.strategy.ICMS;
import io.github.developerheart.patterns.strategy.Imposto;
import io.github.developerheart.ultils.CalculadoraDeImpostos;

import javax.print.DocFlavor;
import java.math.BigDecimal;

import static io.github.developerheart.enums.TipoImposto.*;

public class Main {

    public static void main(String[] args) {
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        io.github.developerheart.entidades.INSS inss = new INSS(new BigDecimal("100"), new BigDecimal("0.10"));
        System.out.println(calculadoraDeImpostos.resultado(inss));
        System.out.println(calculadoraDeImpostos.calcular(new Orcamento(new BigDecimal("1000")), new ICMS()));

        Orcamento orcamentoJaneiro =  new Orcamento(new BigDecimal("100"));
        System.out.println(calculadoraDeImpostos.calcular(orcamentoJaneiro, new ICMS()));


    }
}
