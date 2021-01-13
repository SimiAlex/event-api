package SimiAlex.com.github.eventapi.entities.projections;

import java.time.ZonedDateTime;

import org.springframework.data.rest.core.config.Projection;

import SimiAlex.com.github.eventapi.entities.Event;

@Projection(name = "partial",types = {Event.class})
public interface PartialEventProjection {
    
    String getName();
    ZonedDateTime getStartTime();
    ZonedDateTime getEndTime();
}

