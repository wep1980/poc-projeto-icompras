package io.github.cursodsousa.icompras.pedidos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class PedidosApplication {

//	@Bean
	public CommandLineRunner commandLineRunner(KafkaTemplate<String, String> template){
		return args -> template.send("icompras.pedidos-pagos", "dados", "outra mensagem");
	}

	public static void main(String[] args) {
		SpringApplication.run(PedidosApplication.class, args);
	}

}
