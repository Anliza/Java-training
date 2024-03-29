package com.systechafrica.part2.polymorphism;

import com.systechafrica.part2.inheritance.companysetup.DatabaseEngineer;
import com.systechafrica.part2.inheritance.companysetup.Employee;
import com.systechafrica.part2.inheritance.companysetup.QualiityAssurance;
import com.systechafrica.part2.inheritance.companysetup.SoftwareEngineer;
import com.systechafrica.part2.inheritance.protectedaccessmodifier.nomenclature.genus.Genus;
import com.systechafrica.part2.inheritance.protectedaccessmodifier.nomenclature.kingdom.Kingdom;
import com.systechafrica.part2.inheritance.protectedaccessmodifier.nomenclature.species.Species;

public class PolyMorphismDemo {
     public static void main(String[] args) {

        Employee james = new QualiityAssurance("001", "James",
                "047", "Quality Assurance Chief Engineer");

        Employee ivy = new SoftwareEngineer("002", "Ivy",
                "035", "Senior Software Engineer");

        Employee lenna = new DatabaseEngineer("003", "Lenna",
                "035", "Senior Database Engineer");

        System.out.println(james);
        System.out.println(ivy);
        System.out.println(lenna);


        Kingdom species = new Species();
        System.out.println(species.sampleMethod2());// Only takes methods of the Kindom class. Super class
        Kingdom genus = new Genus();
        System.out.println(genus.sampleMethod2());

    }
}
