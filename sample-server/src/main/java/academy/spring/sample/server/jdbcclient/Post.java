package academy.spring.sample.server.jdbcclient;

import java.time.LocalDate;

public record Post(String id, String title, String slug, LocalDate date, int timeToRead, String tags) {

}