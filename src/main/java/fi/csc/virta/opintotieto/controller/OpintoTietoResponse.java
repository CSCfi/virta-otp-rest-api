package fi.csc.virta.opintotieto.controller;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;
import fi.csc.virta.opintotieto.entity.AMK7SuoratTK;
import fi.csc.virta.opintotieto.repository.OpintotietoRepository;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletResponse;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.stream.Stream;

public class OpintoTietoResponse<T, E extends Serializable> {

    private EntityManager entityManager;

    public OpintoTietoResponse(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void streamJSON(OpintotietoRepository<T, E> repository, HttpServletResponse response) {
        response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
        try (Stream<T> entityStream = repository.streamAll()) {
            OutputStream out = response.getOutputStream();
            ObjectMapper objectMapper = Jackson2ObjectMapperBuilder.json().build();
            JsonGenerator jsonGenerator = objectMapper.getFactory().createGenerator(out);
            jsonGenerator.writeStartArray();
            entityStream.forEach(entity -> {
                try {
                    objectMapper.writeValue(jsonGenerator, entity);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                entityManager.detach(entity);
            });
            jsonGenerator.writeEndArray();
            jsonGenerator.flush();
        } catch (IOException e) {
            throw new RuntimeException("Exception occurred while exporting results", e);
        }
    }

    public void streamXML(OpintotietoRepository<T, E> repository, HttpServletResponse response) {
        response.setContentType(MediaType.APPLICATION_XML_VALUE);
        try (Stream<T> entityStream = repository.streamAll()) {
            OutputStream out = response.getOutputStream();
            XmlMapper objectMapper = Jackson2ObjectMapperBuilder.xml().build();
            ToXmlGenerator xmlGenerator = objectMapper.getFactory().createGenerator(out);
            XMLStreamWriter writer = xmlGenerator.getStaxWriter();
            writer.writeStartDocument();
            writer.writeStartElement("Result");
            entityStream.forEach(entity -> {
                try {
                    objectMapper.writeValue(writer, entity);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                entityManager.detach(entity);
            });
            writer.writeEndElement();
            writer.writeEndDocument();
        } catch (IOException | XMLStreamException e) {
            throw new RuntimeException("Exception occurred while exporting results", e);
        }
    }
}
