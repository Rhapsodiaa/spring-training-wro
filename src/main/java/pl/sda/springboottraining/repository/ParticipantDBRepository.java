package pl.sda.springboottraining.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import pl.sda.springboottraining.repository.model.Participant;

import java.util.List;

@Repository
public interface ParticipantDBRepository extends PagingAndSortingRepository<Participant, Integer> {

    List<Participant> findAll();
    Page<Participant> findByFirstName(String firstName, Pageable pageable);
    List<Participant> findByEmailAndFirstName(String email, String firstName, Sort sort);
}
