package com.nikita.publisher.repository;

import com.nikita.publisher.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Integer> {
    Publisher findById(long id);
}
