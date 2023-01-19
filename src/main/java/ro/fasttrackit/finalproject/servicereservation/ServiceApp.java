package ro.fasttrackit.finalproject.servicereservation;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.fasttrackit.finalproject.servicereservation.model.ReservationType;
import ro.fasttrackit.finalproject.servicereservation.model.entity.Reservation;
import ro.fasttrackit.finalproject.servicereservation.service.repository.ReservationRepository;

import java.util.List;

@SpringBootApplication
public class ServiceApp {

    public static void main( String[] args ){
        SpringApplication.run(ServiceApp.class, args);
    }

    @Bean
    CommandLineRunner asStartUp( ReservationRepository repository ){
        return args -> {
            repository.saveAll(List.of(
                    new Reservation("Nicu Popescu", 120.9, ReservationType.ITP),
                    new Reservation("Alexandra Corina", 30, ReservationType.VULCANIZARE),
                    new Reservation("Gheorghe Ionescu", 550.5, ReservationType.SERVICE)
            ));
        };
    }

}
