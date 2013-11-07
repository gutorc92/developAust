package test.models;

import static org.junit.Assert.*;

import java.util.ArrayList;

import models.Option;
import models.Question;

import org.junit.Test;

public class TestQuestion extends TestXMLElement {

	@Test
	public void testGetXMLElement() {
		Question question = new Question(1, "Voce gosta de Android?");
		String test = createXML(question);
	}
	
	@Test
	public void testGetXMLElementOptions(){
		Option option = new Option(1, "Sim", 1);
		Option option2 = new Option(2, "Não", 2);
		ArrayList list = new ArrayList<>();
		list.add(option);
		list.add(option2);
		Question question = new Question(1, "Voce gosta de Android?",list);
		String test = createXML(question);
	}

}
