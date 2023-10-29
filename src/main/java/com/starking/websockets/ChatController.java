package com.starking.websockets;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * @author pedroRhamon
 */

@Controller
public class ChatController {

	@MessageMapping("/chat")
	@SendTo("/topico/mensagens")
	public MensagemProcessada send(final Mensagem mensagem) throws Exception {
		final String time = new SimpleDateFormat("HH:mm").format(new Date());
		return new MensagemProcessada(mensagem.getOrigem(), mensagem.getTexto(), time);
	}

}
