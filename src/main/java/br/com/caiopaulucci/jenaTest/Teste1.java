package br.com.caiopaulucci.jenaTest;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;

import org.apache.jena.ontology.OntClass;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntModelSpec;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.util.FileManager;

public class Teste1 {

	public static void main(String[] args) {
		/*// supondo que tenha uma ontologia salva para manipular
		String arquivo = "file:X:/repositorio_ontologias/..../sanduiche.owl";

		// criar um espaco na memoria para uma ontologia, baseada em OWL
		OntModel modelo = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM);

		// usar FileManager para abrir o arquivo
		InputStream in = FileManager.get().open(arquivo);

		// ler o documento, propriamente dito
		modelo.read(new InputStreamReader(in), "");

		// retorna qual linguagem a ontologia usa
		System.out.println(modelo.getProfile());

		// lista as subclasses
		OntClass pessoal = modelo.getOntClass(ontologia + "Pessoal");
		for (Iterator i = pessoal.listSubClasses(); i.hasNext();) {
			OntClass c = (OntClass) i.next();
			System.out.println(c.getLocalName());

		}

		// lista todas as classes da ontologia
		for (Iterator i = modelo.listClasses(); i.hasNext();) {
			System.out.println(i.next());
		}*/
	}

}
