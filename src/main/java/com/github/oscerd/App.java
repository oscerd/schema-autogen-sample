package com.github.oscerd;

import org.zendesk.client.v2.model.Ticket;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kjetland.jackson.jsonSchema.JsonSchemaGenerator;

public class App 
{
    public static void main( String[] args ) throws JsonProcessingException
    {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonSchemaGenerator jsonSchemaGenerator = new JsonSchemaGenerator(objectMapper);

        JsonNode jsonSchema = jsonSchemaGenerator.generateJsonSchema(Ticket.class);
        
        String jsonSchemaAsString = objectMapper.writeValueAsString(jsonSchema);
        System.err.println(jsonSchemaAsString);
    }
}
