package event.app.event;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Event {

  private Long id;
  private String title;
}
