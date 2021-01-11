package SimiAlex.com.github.eventapi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Objects;
import java.util.Set;

@Entity
public class Organizer extends SimiAlex.com.github.eventapi.entities.AbstractEntity {

	@Column(name = "ORGANIZER_NAME")
	private String name;

	@OneToMany(mappedBy = "organizer")
	private Set<SimiAlex.com.github.eventapi.entities.Event> events;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<SimiAlex.com.github.eventapi.entities.Event> getEvents() {
		return events;
	}

	public void setEvents(Set<SimiAlex.com.github.eventapi.entities.Event> events) {
		this.events = events;
	}

	@Override
	public boolean equals(Object obj) {
		return Objects.equals(id, ((Organizer) obj).id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	public Long getResourceId() {
		return this.id;
	}

}
