package xmlExampleDB;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import bean.Child;
import bean.Father;
import bean.Mather;
import bean.Person;
import serv.Serv;


public class MySax extends DefaultHandler {
	
	private Person ent; 
	private Serv serv = new Serv();
	private Mather mama = new Mather();
	private Father papa = new Father();
	private Child child = new Child();
	private Object obj;
	
	
	
	public Mather getMama() {
		return mama;
	}

	public void setMama(Mather mama) {
		this.mama = mama;
	}

	public Father getPapa() {
		return papa;
	}

	public void setPapa(Father papa) {
		this.papa = papa;
	}

	public Person getEnt() {
		return ent;
	}

	public void setEnt(Person ent) {
		this.ent = ent;
	}

	String teg;
	
	public MySax() {
		super();
	}

	@Override 
	public void startDocument() throws SAXException { 
		  System.out.println("Start parse XML..."); 
		}
	
	@Override 
	public void startElement(String namespaceURI, String localName, String qName, Attributes atts) throws SAXException { 
	  teg = qName;
	  switch(teg) {
	  case "mather" : 
		  obj = new Mather();
		  break;
	  case "father" :
		  obj = new Father();
		  break;
	  case "child" : 
		  obj = new Child();
		  break;
	default:
		System.out.println("search :| ");
	  }
	  
	}
	@Override 
	public void characters(char[] ch, int start, int length) throws SAXException { 
	  if (obj instanceof Mather) {
		  if(teg.equals("name")) {
			  mama.setName(new String(ch, start, length).trim());
		  }
		  else if(teg.equals("surname")) {
			  mama.setSurname(new String(ch, start, length).trim());
		  }
		  else if(teg.equals("age")) {
			  mama.setAge(Integer.parseInt(new String(ch, start, length).trim()));
		  }
		  //mama.setAge(Integer.parseInt(new String(ch, start, length).trim()));
		  //mama.setName(new String(ch, start, length).trim());
		  //serv.matherInfo(ch, start, length);
		  //ent.setId(Integer.parseInt(new String(ch, start, length).trim()));   
	  }
	  else if (obj instanceof Father) {
		  if(teg.equals("name")) {
			  papa.setName(new String(ch, start, length).trim());
		  }
		  else if(teg.equals("surname")) {
			  papa.setSurname(new String(ch, start, length).trim());
		  }
		  else if(teg.equals("age")) {
			  papa.setAge(Integer.parseInt(new String(ch, start, length).trim()));
		  }
	  }
	  else if (obj instanceof Child) { 
		  if(teg.equals("name")) {
			  child.setName(new String(ch, start, length).trim());
		  }else if(teg.equals("surname")) {
			  child.setSurname(new String(ch, start, length).trim());
		  }else if(teg.equals("age")) {
			  child.setAge(Integer.parseInt(new String(ch, start, length).trim()));
		  } 
	  }
	  else {
		  System.out.println("idem dalshe! ");
	  }
	  
	}
	@Override 
	public void endElement(String namespaceURI, String localName, String qName) throws SAXException { 
	  teg = ""; 
	}
	
	@Override 
	public void endDocument() { 
	  System.out.println("Stop parse XML..."); 
	}
	
}
