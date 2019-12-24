package cz.sam.march.utils;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.StringReader;

public class StreamedDocument {

    public static Document Create(String resourcePath) {

        InputStream stream = StreamedDocument.class.getClassLoader().getResourceAsStream(resourcePath);

        if(stream == null) {
            try {
                stream = new FileInputStream(resourcePath);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        try {
            String xml = "";
            while(stream.available() > 0) {
                xml += (char)stream.read();
                //System.out.print((char)stream.read());
            }
            stream.close();

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            return builder.parse(new InputSource(new StringReader(xml)));
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }

}