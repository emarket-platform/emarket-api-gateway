package com.gmail.alexei28.emarket.api.gateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmarketApiGatewayApplication {

  private static final Logger logger = LoggerFactory.getLogger(EmarketApiGatewayApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(EmarketApiGatewayApplication.class, args);

    logger.info(
        """

        ===== Application started successfully! =====
        Java version: {} | Java vendor: {}
        """,
        System.getProperty("java.version"),
        System.getProperty("java.vendor"));
  }
}
