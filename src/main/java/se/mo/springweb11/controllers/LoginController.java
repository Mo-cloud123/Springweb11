package se.mo.springweb11.controllers;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoginController {

    public void logLoginToS3(String email) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        String today = LocalDate.now().format(DateTimeFormatter.ISO_DATE);
        String logLine = timestamp + " " + email + " logged in\n";

        String filename = "logins/" + today + ".txt";

        try {
            // Hämta nuvarande filinnehåll (valfritt, eller bara lägg till)
            PutObjectRequest put = PutObjectRequest.builder()
                    .bucket("your-bucket-name")
                    .key(filename)
                    .build();

            s3Client.putObject(put, RequestBody.fromString(logLine));
        } catch (Exception e) {
            log.error("Could not write to S3", e);
        }
    }

}


