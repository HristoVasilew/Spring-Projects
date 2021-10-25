package bg.softUni.mobilelele.repository;

import bg.softUni.mobilelele.model.entity.UserRoleEntity;
import bg.softUni.mobilelele.model.entity.enums.UserRoleEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRoleEntity, Long> {

    UserRoleEntity findByRole(UserRoleEnum role);

}

