package codoacodo.vuelosapi.repository;

import codoacodo.vuelosapi.modelo.Vuelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VueloRepository extends JpaRepository<Vuelo, Long> {

}
