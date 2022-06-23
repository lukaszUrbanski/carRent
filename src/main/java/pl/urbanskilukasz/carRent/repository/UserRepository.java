package pl.urbanskilukasz.carRent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.urbanskilukasz.carRent.model.user.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long > {
}
