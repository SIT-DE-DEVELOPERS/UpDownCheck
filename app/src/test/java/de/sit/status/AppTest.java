/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package de.sit.status;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.net.MalformedURLException;

import org.junit.jupiter.api.Test;

import de.sit.status.model.Status;

class AppTest {

    String[] args = { "token", "apikey", "watchservice", "command", "hostname", "upopows" };

    @Test
    void testGetStatus() throws MalformedURLException, IOException {
        // Arrange
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("config.properties");
        Properties prop = new Properties();
        prop.load(inputStream);
        String token = prop.getProperty("token");
        String apikey = prop.getProperty("apikey");
        String updownIoRestUrl = "https://updown.io/api/checks/" + token;

        // Act
        Status[] statuses = App.getStatus(updownIoRestUrl, apikey);

        // Assert
        assertNotNull(statuses);
        assertTrue(statuses.length > 0);
    }

    @Test
    void testGetHostName() {
        assertNotNull(App.getHostName(), "Return of getHostName() is not null");
        assertNotEquals("", App.getHostName(), "Return of getHostName() is not an empty string");
    }
}
