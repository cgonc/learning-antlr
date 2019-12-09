package com.poc.chapter_08_part03;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

import com.poc.chapter_08_part02.JsonToXmlImpl;

public class CymbolCallGraphTest {

	public static void main(String[] args) throws URISyntaxException {
		URL resource = JsonToXmlImpl.class.getClassLoader().getResource("TestCallGraph.CymbolCallGraph");
		assert resource != null;
		File file = Paths.get(resource.toURI()).toFile();

	}

}
