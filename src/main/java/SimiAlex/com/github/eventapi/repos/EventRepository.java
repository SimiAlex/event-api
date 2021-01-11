package SimiAlex.com.github.eventapi.repos;

import SimiAlex.com.github.eventapi.entities.Event;

import java.time.ZoneId;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface EventRepository extends PagingAndSortingRepository<Event, Long>
{
    Page<Event> findByName(@Param("name")String name, Pageable pageable);
    Page<Event> findByNameAndZoneId(@Param("name")String name,@Param("zoneId")ZoneId zoneId, Pageable pageable);
}
