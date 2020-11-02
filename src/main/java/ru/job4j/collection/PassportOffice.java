package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class PassportOffice {
    private Map<String, Citizen> citizens = new HashMap<>();

    public boolean add(Citizen citizen) {
        boolean rsl = false;
        if (!citizens.containsValue(citizen)) {
            citizens.put(citizen.getPassport(), citizen);
            rsl = true;
        }
        return rsl;
    }

    public Citizen get(String passport) {
        Citizen rsl = null;
        for (Citizen citizen : citizens.values()) {
            if (citizen.getPassport().contains(passport)) {
                rsl = citizen;
            }
        }
        return rsl;
    }
}
