package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
public class EventCategory {

    @Id
    @GeneratedValue
    private int id;

    @Size(min=3, message="name has to be 3 characters long.")
    private String name;

    public EventCategory(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EventCategory that = (EventCategory) o;
        return id == that.id && name.equals(that.name);
    }

    @Override
    public String toString() {
        return "EventCategory{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public EventCategory(@Size(min=3, message="name has to be 3 characters long.") String name) {

        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
