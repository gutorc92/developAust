package models;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Question implements XMLElement {
	
	private int id;
	
	private String text;
	
	private List<Option> options;

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Question(int id, String text) {
		super();
		this.id = id;
		this.text = text;
		this.options = new ArrayList<>();
	}

	public Question(int id, String text, List<Option> options) {
		super();
		this.id = id;
		this.text = text;
		this.options = options;
	}

	@Override
	public Element getXMLElement(Document document, Element child) {
		// TODO Auto-generated method stub
		Element element = document.createElement("Question");
		if(child != null) element.appendChild(child);
		for(int i = 0; i < this.options.size(); i++){
			XMLElement elem = this.options.get(i);
			element.appendChild(elem.getXMLElement(document, null));
		}
		addAttrElement(document, element);
		return element;
	}

	@Override
	public void addAttrElement(Document document, Element element) {
		// TODO Auto-generated method stub
		element.setAttribute("id", String.valueOf(this.id));
		element.setAttribute("text", this.text);
	}
	
	
}
