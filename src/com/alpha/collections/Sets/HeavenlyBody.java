package com.alpha.collections.Sets;

import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {

    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon(HeavenlyBody moon) {
        return this.satellites.add(moon);

    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("obj.getClass() is " + this.getClass());

        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }

        String objName = ((HeavenlyBody) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode called");  //this will display for every Object in Main file that uses getName()
        return this.name.hashCode() + 57;   //return hashCode() plus number 57 to differentiate
    }
}



//SETS and HASHSETS

//Most important thing that distinguishes Sets from other Collections is that Sets cannot contain duplicates
//Can use Sets to Iterate or check if something exists, but cannot get/retrieve anything from Sets
//Sets operations are really fast

//HashSet - returns values out of order
//LinkedHashSet - returns values in order
//Tree set returns values in Alphabetical order


// HashSet equals() and hashCode() examples
// Objects that are equal should return equals of true have same hashCode() to be put
//in the same Object Collection together
