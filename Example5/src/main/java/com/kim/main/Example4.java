package com.kim.main;

import com.kim.beans.Vehicle;
import com.kim.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example4 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Component Vehicle name from Spring Context is: " + vehicle.getName());
        vehicle.printHello();
    }
}
