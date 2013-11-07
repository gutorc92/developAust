package models;



import org.w3c.dom.Document;
import org.w3c.dom.Element;

public interface XMLElement {
	
	public Element getXMLElement(Document document, Element child);
	
	public void addAttrElement(Document document,Element element);
	
}
