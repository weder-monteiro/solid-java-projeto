package br.com.alura.rh.service;

import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajusteService {

    void validar(Funcionario funcionario, BigDecimal aumento);

}
