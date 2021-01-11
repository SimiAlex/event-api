package SimiAlex.com.github.eventapi.repos;


import SimiAlex.com.github.eventapi.entities.Event;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EventRepository extends PagingAndSortingRepository<Event, Long>
{
    
}
