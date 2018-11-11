package edu.dcccd.lesson10;

public class HelloRestControllerTests {
    @Test
    public void greetWithoutName() {
        ResponseEntity<Greeting> entity = template.getForEntity("/rest", Greeting.class);
        assertEquals(HttpStatus.OK, entity.getStatusCode());
        assertEquals(MediaType.APPLICATION_JSON_UTF8, entity.getHeaders().getContentType());
        Greeting response = entity.getBody();
        assertEquals("Hello, World!", response.getGreeting());
    }
    @Test
    public void greetWithName() {
        Greeting response = template.getForObject("/rest?name=Spring Boot", Greeting.class);
        assertEquals("Hello, Spring Boot!", response.getGreeting());




    }



