package ro.fasttrackit.finalproject.servicereservation.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.finalproject.servicereservation.model.entity.Reservation;

public interface ReservationRepository extends JpaRepository <Reservation, Integer>{
}
