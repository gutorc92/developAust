package models;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Option implements XMLElement {
	
	private int id;
	
	private String text;
	
	private int value;
	
	public Option() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Option(int id, String text, int value) {
		super();
		this.id = id;
		this.text = text;
		this.value = value;
	}



	@Override
	public Element getXMLElement(Document document, Element child) {
		// TODO Auto-generated method stub
		Element element = document.createElement("Option");
		if(child != null) element.appendChild(child);
		addAttrElement(document, element);
		return element;
	}

	@Override
	public void addAttrElement(Document document, Element element) {
		// TODO Auto-generated method stub
		Attr att1 = document.createAttribute("id");
		Attr att2 = document.createAttribute("text");
		Attr att3 = document.createAttribute("value");
		
		att1.setValue(String.valueOf(this.id));
		att2.setValue(this.text);
		att3.setValue(String.valueOf(this.value));
		
		/*
		element.setAttribute("id", String.valueOf(this.id));
		element.setAttribute("text", this.text);
		element.setAttribute("value", String.valueOf(this.value));
		*/
		element.setAttributeNode(att1);
		element.setAttributeNode(att2);
		element.setAttributeNode(att3);
	}
	
	
}
