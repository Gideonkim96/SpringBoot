package com.kim.main;

import com.kim.beans.Vehicle;
import com.kim.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example4 {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Primary Vehicle name from Spring Context is: " + vehicle.getName());

        System.out.println("----------------");

        Vehicle veh1 = context.getBean("audiVehicle",Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh1.getName());

        Vehicle veh2 = context.getBean("hondaVehicle",Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh2.getName());

        Vehicle veh3 = context.getBean("ferrariVehicle",Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh3.getName());
    }
}
