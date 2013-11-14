package test.models;

import static org.junit.Assert.*;

import java.util.ArrayList;

import models.Form;
import models.Question;

import org.junit.Test;

public class TestForm extends TestXMLElement {

	@Test
	public void testGetXMLElement() {
		Form form = new Form(1, "Primeiro teste.");
		String test = createXML(form);
		assertEquals(test, "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?><form id=\"1\" name=\"Primeiro teste.\"/>");
	}
	
	@Test
	public void testGetXMLElementQuestion() {
		Question question = new Question(1, "Voce gosta de Android?");
		Question question2 = new Question(2, "Voce gosta de Android de verdade?");
		ArrayList list = new ArrayList<>();
		list.add(question); list.add(question2);
		Form form = new Form(1, "Primeiro teste.",list);
		String test = createXML(form);
		assertEquals(test,"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?><form id=\"1\" name=\"Primeiro teste.\"><Question id=\"1\" text=\"Voce gosta de Android?\"/><Question id=\"2\" text=\"Voce gosta de Android de verdade?\"/></form>" );
	}

}
