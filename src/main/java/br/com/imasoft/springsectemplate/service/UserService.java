package br.com.imasoft.springsectemplate.service;

import br.com.imasoft.springsectemplate.model.User;

/**
 * @author brunocarneiro
 */
public interface UserService extends CrudService<User> {

    User findByName(String username) throws Exception;

    User findUserByEmail(String email) throws Exception;

}
