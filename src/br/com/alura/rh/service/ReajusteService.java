package br.com.alura.rh.service;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.util.List;

public class ReajusteService {

    private List<ValidacaoReajusteService> validacoes;

    public ReajusteService(List<ValidacaoReajusteService> validacoes) {
        this.validacoes = validacoes;
    }

    public void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento) {
        this.validacoes.forEach(v -> v.validar(funcionario, aumento));

        funcionario.atualizarSalario(funcionario.getDadosPessoais().getSalario().add(aumento));
    }

}
