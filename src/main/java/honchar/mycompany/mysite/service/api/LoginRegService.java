package honchar.mycompany.mysite.service.api;

import honchar.mycompany.mysite.domain.User;

public interface LoginRegService {
    User loginUser(String email, String pass);
    User checkEmail(String email);
    void regUser(String email, String pass, String repPas, String keyword);
}
