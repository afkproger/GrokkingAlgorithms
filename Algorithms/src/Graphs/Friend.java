package Graphs;

import java.util.Objects;

public class Friend {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Friend friend = (Friend) o;
        return isMangoSeller == friend.isMangoSeller && Objects.equals(name, friend.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isMangoSeller);
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", isMangoSeller=" + isMangoSeller +
                '}';
    }

    private String name;
    private boolean isMangoSeller;

    public Friend(String name, boolean isMangoSeller) {
        this.name = name;
        this.isMangoSeller = isMangoSeller;
    }

    public String getName() {
        return name;
    }

    public boolean isMangoSeller() {
        return isMangoSeller;
    }
}
