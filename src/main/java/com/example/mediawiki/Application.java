package com.example.mediawiki;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.mediawiki.io.MediaWikiImporter;

@SpringBootApplication
public class Application {
	private static Logger LOG = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		LOG.info("Stack Exchange Importer");

		SpringApplication app = new SpringApplication(Application.class);
		app.setWebEnvironment(false);
		ConfigurableApplicationContext ctx = app.run(args);

		MediaWikiImporter importer = ctx.getBean(MediaWikiImporter.class);
		try {
			importer.execute();
		} catch (XMLStreamException | JAXBException e) {
			e.printStackTrace();
		}
	}
}
