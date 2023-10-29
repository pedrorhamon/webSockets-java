package com.starking.websockets;

/**
 * @author pedroRhamon
 */
public class MensagemProcessada {

	private String origem;
	private String texto;
	private String horario;

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public MensagemProcessada(final String origem, final String texto, final String horario) {
		this.origem = origem;
		this.texto = texto;
		this.horario = horario;
	}
}
