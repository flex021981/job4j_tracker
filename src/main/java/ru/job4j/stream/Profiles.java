package ru.job4j.stream;

import java.util.List;
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

    }

    public List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .map(pr -> pr.getAddress())
                .collect(Collectors.toList());
    }
}
