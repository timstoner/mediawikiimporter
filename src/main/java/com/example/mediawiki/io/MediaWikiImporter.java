package com.example.mediawiki.io;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.events.XMLEvent;
import javax.xml.transform.stream.StreamSource;

import org.mediawiki.xml.export_0.PageType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.example.mediawiki.repo.PageRepository;
import com.example.mediawiki.repo.RevisionRepository;
import com.example.mediawiki.repo.TextRepository;

@Component
public class MediaWikiImporter {
	private static Logger LOG = LoggerFactory.getLogger(MediaWikiImporter.class);

	@Value("${file}")
	private String filePath;

	@Autowired
	private PageRepository pageRepo;

	@Autowired
	private TextRepository textRepo;

	@Autowired
	private RevisionRepository revRepo;

	public void execute() throws XMLStreamException, JAXBException {
		XMLInputFactory xif = XMLInputFactory.newFactory();
		StreamSource xml = new StreamSource(filePath);
		XMLStreamReader xsr = xif.createXMLStreamReader(xml);
		// xsr.nextTag();

		JAXBContext jc = JAXBContext.newInstance(PageType.class);
		Unmarshaller unmarshaller = jc.createUnmarshaller();

		int counter = 0;

		while (xsr.hasNext()) {
			if (xsr.next() == XMLEvent.START_ELEMENT) {

				if (xsr.getLocalName().equals("page")) {

					JAXBElement<PageType> jb = unmarshaller.unmarshal(xsr, PageType.class);
					counter++;
					// PageType pageType = jb.getValue();
					// LOG.info(jb.getValue().getTitle());

					// counter++;

					if (counter % 10000 == 0) {
						LOG.info("page counter: " + counter);
					}
				}
			}
		}

		LOG.info("page counter: " + counter);
		xsr.close();

	}
}
