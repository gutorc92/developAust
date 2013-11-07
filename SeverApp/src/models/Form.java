package models;

import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Form implements XMLElement {
	
	private int id;
	
	private String name;
	
	private List<Question> questions;

	
	
	public Form(int id, String name, List<Question> questions) {
		super();
		this.id = id;
		this.name = name;
		this.questions = questions;
	}

	public Form(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.questions = new ArrayList<Question>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	@Override
	public Element getXMLElement(Document document, Element child) {
		// TODO Auto-generated method stub
		Element element = document.createElement("form");
		addAttrElement(document, element);
		if(child != null) element.appendChild(child);
		for(int i = 0; i < this.questions.size(); i++){
			XMLElement elem = this.questions.get(i);
			element.appendChild(elem.getXMLElement(document, null));
		}
		return element;
	}

	@Override
	public void addAttrElement(Document document,Element element) {
		// TODO Auto-generated method stub
		Attr att1 = document.createAttribute("id");
		Attr att2 = document.createAttribute("name");
		
		att1.setValue(String.valueOf(this.id));
		att2.setValue(this.name);
		
		element.setAttributeNode(att1);
		element.setAttributeNode(att2);
	}
	
	

	
	
	
}
