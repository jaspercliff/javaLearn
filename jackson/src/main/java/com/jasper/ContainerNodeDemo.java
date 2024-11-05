package com.jasper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

/**
 * @version 1.0
 * @Author jasper
 * @Date 2024-09-14
 */
public class ContainerNodeDemo {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode objectNode = mapper.createObjectNode();
        objectNode.put("name", "Jasper");
        objectNode.put("age", 18);
        System.out.println(objectNode);
        ArrayNode arrayNode = mapper.createArrayNode();
        arrayNode.add("Java");
        arrayNode.add("Python");
        System.out.println(arrayNode);
    }
}
