package com.kim.config;

import com.kim.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean(value="audiVehicle")
    Vehicle vehicle1(){
        var veh = new Vehicle();
        veh.setName("Audi 8");
        return veh;
    }

    @Bean(value="hondaVehicle")
    Vehicle vehicle2(){
        var veh = new Vehicle();
        veh.setName("Honda");
        return veh;
    }
    @Bean("ferrariVehicle")
    Vehicle vehicle3(){
        var veh = new Vehicle();
        veh.setName("Ferrari");
        return veh;
    }

}
