package honchar.mycompany.mysite.service.impl;

import honchar.mycompany.mysite.domain.User;
import honchar.mycompany.mysite.jpa.UserRepository;
import honchar.mycompany.mysite.service.api.LoginRegService;
import org.springframework.stereotype.Service;

@Service
public class DbLoginRegService implements LoginRegService {

    private final UserRepository userRepository;

    public DbLoginRegService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User loginUser(String email, String pass) {
        email = email.trim();
        User user = checkEmail(email) != null ? checkEmail(email) : null;

        if (user == null)
            return null;
        if (!user.getPassword().equals(pass))
            return null;
        System.out.println("login: " + email + "  " + pass);
        return user;
    }

    @Override
    public User checkEmail(String email) {
        return userRepository.findByEmail(email) != null ? userRepository.findByEmail(email) : null;
    }



    @Override
    public void regUser(String email, String pass, String repPas, String keyword) {
        if (checkEmail(email) != null)
            return;
        System.out.println("Email is used");
        if (!pass.equals(repPas))
            return;
        System.out.println("Passwords is different");

        userRepository.save(new User().builder()
                .email(email)
                .password(pass)
                .keyword(keyword)
                .build());
        System.out.println("save completed");
    }


}
