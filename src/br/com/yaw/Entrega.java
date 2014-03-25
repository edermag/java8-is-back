package br.com.yaw;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

/**
 * Bean utilizado na palestra sobre Java 8 - Java Is Back
 * 
 * @author eder.magalhaes
 */
public class Entrega implements CriterioPontualidade {
	
	private String produto;
	
	private Double valor;
	
	private String endereco;
	
	private LocalDateTime previsao;
	
	private LocalDateTime realizacao;
	
	public Entrega (){}
	
	public Entrega (String produto, Double valor, LocalDateTime previsao) {
		this.produto = produto;
		this.valor = valor;
		this.previsao = previsao;
	}

	public String getProduto() {
		return produto;
	}
	
	public void setProduto(String produto) {
		this.produto = produto;
	}
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public LocalDateTime getPrevisao() {
		return previsao;
	}

	public void setPrevisao(LocalDateTime previsao) {
		this.previsao = previsao;
	}

	public Double getValor() {
		return valor;
	}
	
	@Override
	public LocalDateTime getRealizacao() {
		return realizacao;
	}
	
	public void setRealizacao(LocalDateTime realizacao) {
		this.realizacao = realizacao;
	}
	
	@Override
	public String toString() {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String produto = Optional.ofNullable(this.produto).orElse("não informado...");
		String endereco = Optional.ofNullable(this.endereco).orElse("não informado...");
		String previsao = this.previsao != null ? fmt.format(this.previsao) : "";
		String realizacao = this.realizacao != null ? fmt.format(this.realizacao) : "";
		
		return String.format("Produto: %s [Previsão: %s / %s] [Endereço: %s]", produto, previsao, realizacao, endereco);
	}
	
}
