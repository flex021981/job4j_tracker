package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Profiles {
    public class Profile {
        private Address address;

        public Address getAddress() {
            return address;
        }
    }

    public class Address {
        private String city;
        private String street;
        private int home;
        private int apartment;

        public String getCity() {
            return city;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Address address = (Address) o;
            return home == address.home
                    && apartment == address.apartment
                    && Objects.equals(city, address.city)
                    && Objects.equals(street, address.street);
        }

        @Override
        public int hashCode() {
            return Objects.hash(city, street, home, apartment);
        }
    }

    public List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .map(pr -> pr.getAddress())
                .sorted(Comparator.comparing(address -> address.getCity()))
                .distinct()
                .collect(Collectors.toList());
    }
}
