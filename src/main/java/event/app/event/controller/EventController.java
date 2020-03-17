package event.app.event.controller;

import event.app.event.Event;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/get-out/events")
@Slf4j
public class EventController {

  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public List<Event> getAllEvents() {
    log.info("EM: Get events");
    List<Event> events = new ArrayList<>();
    events.add(Event.builder().id(1L).title("''Aventuri cu dl. Goe'' | Ateneul National din Iasi").build());
    events.add(Event.builder().id(2L).title("Luna Francofoniei la Iasi").build());
    events.add(Event.builder().id(3L).title("Expoziţie de fotografie „Amintiri despre Cernobîl”").build());

    return events;
  }
}
