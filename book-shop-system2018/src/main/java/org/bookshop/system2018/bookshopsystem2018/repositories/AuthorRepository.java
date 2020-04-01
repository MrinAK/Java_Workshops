package org.bookshop.system2018.bookshopsystem2018.repositories;

import org.bookshop.system2018.bookshopsystem2018.model.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

}
