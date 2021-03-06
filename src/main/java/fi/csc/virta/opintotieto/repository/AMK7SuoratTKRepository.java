package fi.csc.virta.opintotieto.repository;

import fi.csc.virta.opintotieto.entity.AMK7SuoratTK;
import fi.csc.virta.opintotieto.entity.AMKSuoratTKId;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface AMK7SuoratTKRepository extends OpintotietoRepository<AMK7SuoratTK, AMKSuoratTKId> {

    @Override
    @Query(value = "select t from AMK7SuoratTK t")
    Stream<AMK7SuoratTK> streamAll();
}
