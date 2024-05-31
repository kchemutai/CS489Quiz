package miu.edu.cse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import miu.edu.cse.model.Contact;
import miu.edu.cse.model.EmailAddress;
import miu.edu.cse.model.Label;
import miu.edu.cse.model.Phone;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Contact> contacts = List.of(
                new Contact("David", "Sanger", "Argos LLC", "Sales Manager",
                        List.of(
                                new Phone("240-133-0011", new Label("Home")),
                                new Phone("240-112-0123", new Label("Mobile"))
                        ),
                        List.of(
                                new EmailAddress("dave.sang@gmail.com", new Label("Home")),
                                new EmailAddress("dsanger@argos.com", new Label("Work"))
                        )),
                new Contact("Carlos", "Jimenez", "Zappos", "Director", null, null),
                new Contact("Ali", "Gafar", "BMI Services", "HR Manager",
                        List.of(new Phone("412-116-9988", new Label("Work"))),
                        List.of(new EmailAddress("ali@bmi.com", new Label("Work"))))
        );

        List<Contact> sortedContacts = contacts.stream().sorted(Comparator.comparing(Contact::getLastName)).toList();

       printContactsInJson(sortedContacts);
    }

    private static  void printContactsInJson(List<Contact> contacts){
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        try {
            // Convert list of employees to JSON string
            String jsonString = objectMapper.writeValueAsString(contacts);
            // Print the JSON string
            System.out.println(jsonString);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}