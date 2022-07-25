package employee.management.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

@CrossOrigin
@RestController
@RequestMapping("/testDate")
public class DateTimeController {

//    @PostMapping("/date")
//    public void date(@RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date date) {
//    }
//
//    @PostMapping("/local-date")
//    public void localDate(@RequestParam("localDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate localDate) {
//    }
//
//    @PostMapping("/local-date-time")
//    public void dateTime(@RequestParam("localDateTime") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)LocalDateTime localDateTime) {
//    }

    @GetMapping(params = "date")
    public String localDate(
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd")
            final LocalDate date) {
        return date.toString();
    }

    @GetMapping(params = "time")
    public String localTime(
            @RequestParam @DateTimeFormat(pattern = "HH:mm:ss")
            final LocalTime time) {
        return time.toString();
    }

    @GetMapping(params = "dateTime")
    public String localDateTime(
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
            final LocalDateTime dateTime) {
        return dateTime.toString();
    }
}