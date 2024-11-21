package org.example;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/daysToNewYear")
    public String getDaysToNewYear() {
        // Current date
        DateTime now = new DateTime();

        // Start of next year
        DateTime nextYear = new DateTime(now.getYear() + 1, 1, 1, 0, 0);

        // Calculate remaining days
        int daysRemaining = Days.daysBetween(now.withTimeAtStartOfDay(), nextYear).getDays();

        return "<html><body><h1>Days Remaining to New Year: " + daysRemaining + "</h1></body></html>";
    }
}