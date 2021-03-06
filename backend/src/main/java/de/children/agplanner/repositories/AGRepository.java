package de.children.agplanner.repositories;


import de.children.agplanner.model.AG;
import de.children.agplanner.model.Kind;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AGRepository extends JpaRepository<AG, Integer> {

    @Query("select groesse from AG")
    List<Integer> findGroesse();

}
