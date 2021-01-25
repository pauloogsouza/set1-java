package model.entities;

import java.util.Date;
import java.util.Objects;

public class UserLog implements Comparable<UserLog> {

    private String name;
    private Date date;

    public UserLog(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    // Equals and Hashcode - Only necessary for HashSet and LinkedHashSet
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserLog userLog = (UserLog) o;
        return Objects.equals(name, userLog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    //Necessary for TreeSet
    @Override
    public int compareTo(UserLog o) {
        return name.toUpperCase().compareTo(o.getName().toUpperCase());
    }
}
