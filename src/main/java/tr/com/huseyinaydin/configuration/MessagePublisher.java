package tr.com.huseyinaydin.configuration;

/**
 * 
 @author Huseyin_Aydin
 @since 1994
 @category Spring Boot Redis
 * 
 */

public interface MessagePublisher {
    void publish(String message);
}
