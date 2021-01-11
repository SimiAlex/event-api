package SimiAlex.com.github.eventapi.repos;

import SimiAlex.com.github.eventapi.entities.Venue;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface VenueRepository extends PagingAndSortingRepository<Venue, Long>
{
    
}
