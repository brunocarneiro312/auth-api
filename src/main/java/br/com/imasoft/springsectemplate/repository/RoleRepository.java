package br.com.imasoft.springsectemplate.repository;

import br.com.imasoft.springsectemplate.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author brunocarneiro
 */
public interface RoleRepository extends JpaRepository<Role, Integer> {

}
