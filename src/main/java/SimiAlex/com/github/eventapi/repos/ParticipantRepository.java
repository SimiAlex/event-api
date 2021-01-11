package SimiAlex.com.github.eventapi.repos;

import SimiAlex.com.github.eventapi.entities.Participant;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ParticipantRepository extends PagingAndSortingRepository<Participant, Long>
{
    
}
