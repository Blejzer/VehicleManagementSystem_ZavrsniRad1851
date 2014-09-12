package ba.fit.vms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ba.fit.vms.pojo.Lokacija;

@Repository
@Transactional(readOnly = true)
public interface KilometrazaRepository extends JpaRepository<Lokacija, Long> {

}