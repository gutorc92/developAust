package test.models;

import static org.junit.Assert.*;

import java.io.PrintWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import models.Option;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class TestOption extends TestXMLElement {

	@Test
	public void testGetXMLElement() {
		Option option = new Option(1, "Sim", 2);
		String test = createXML(option);
		assertEquals(test, "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?><Option id=\"1\" text=\"Sim\" value=\"2\"/>");
		
	}

}
