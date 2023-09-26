package com.systechafrica.part2.inheritance;

import java.util.logging.Logger;

import com.systechafrica.part2.inheritance.companysetup.QualiityAssurance;
import com.systechafrica.part2.inheritance.companysetup.SoftwareEngineer;

public class InheritanceDemo {
    private static final Logger LOGGER = Logger.getLogger(InheritanceDemo.class.getName());
    public static void main(String[] args) {
        InheritanceDemo app = new InheritanceDemo();

        app.companysetup();

       /* LOGGER.info("app => " +app.hashCode());
        LOGGER.info("app => " +app.toString());
        LOGGER.info("app => " +app.getClass().getPackageName());*/ 
    }

    public void companysetup(){
        SoftwareEngineer e1 = new SoftwareEngineer("001","Emily","Nakawa","Software Engineer");
        LOGGER.info("SoftwareEngineer => " +e1.toString());

        QualiityAssurance qa = new QualiityAssurance("002","Halkano","Westlands","Software Engineer in Test");
        LOGGER.info("Qualiity Assurance => " +qa.toString());

    }
    /*
     * public void companysetup(){
        SoftwareEngineer e1 = new SoftwareEngineer();
        e1.setEmployeeName("Emily");
        e1.setEmployeeNo("001");
        e1.setEmployeeAddress("Nakawa");
        e1.setTitle("Software Engineer");
        LOGGER.info("SoftwareEngineer => " +e1.toString());

        QualiityAssurance qa = new QualiityAssurance();
        qa.setEmployeeName("Halkano");
        qa.setEmployeeNo("002");
        qa.setEmployeeAddress("Westlands");
        qa.setTitle("Software Engineer in Test");
        LOGGER.info("Qualiity Assurance => " +qa.toString());

    }
     */
}
