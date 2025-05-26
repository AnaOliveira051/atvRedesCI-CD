package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AtvRedesCiCdApplication {

	public static void main(String[] args) {

		mensageController mensagem = new mensageController();

		mensagem.exibirMensagem();

	}

}
