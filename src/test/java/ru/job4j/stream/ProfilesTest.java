package ru.job4j.stream;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ProfilesTest {
    private List<Profile> profL = new ArrayList<>();

    @Before
    public void setUp() {
        profL.add(new Profile("Moscow", "Tulskaya", 12, 123));
        profL.add(new Profile("Tula", "Tulskaya", 12, 123));
        profL.add(new Profile("Orel", "Tulskaya", 12, 123));
        profL.add(new Profile("Tambov", "Tulskaya", 12, 123));
        profL.add(new Profile("Moscow", "Tulskaya", 12, 123));
    }

    @Test
    public void getAddressFromProfile() {
        List<Address> rsl = new Profiles().collect(profL);
        List<Address> expected = Arrays.asList(
                new Address("Moscow", "Tulskaya", 12, 123),
                new Address("Orel", "Tulskaya", 12, 123),
                new Address("Tambov", "Tulskaya", 12, 123),
                new Address("Tula", "Tulskaya", 12, 123)
        );
        assertThat(rsl, is(expected));
    }
}