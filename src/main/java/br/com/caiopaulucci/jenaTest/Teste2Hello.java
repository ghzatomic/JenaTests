package br.com.caiopaulucci.jenaTest;

import org.apache.jena.datatypes.xsd.XSDDatatype;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;

public class Teste2Hello {

	public static void main(String[] args) {
		Model m = ModelFactory.createDefaultModel();
		String ns = "http://example.com/test/";
		
		Resource r = m.createResource(ns+"r");
		Property p = m.createProperty(ns+"p");
		
		r.addProperty(p, "aloooo mundao !",XSDDatatype.XSDstring);
		
		m.write(System.out,"Turtle");
		
	}
	
}
