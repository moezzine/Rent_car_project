package com.fleetapp.fleetapp.Services;

import com.fleetapp.fleetapp.Repositories.UserRepository;
import com.fleetapp.fleetapp.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BCryptPasswordEncoder encoder;

    public  void save(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        userRepository.save(user);
    }
    public void delete(Integer id) {
        userRepository.deleteById(id);
    }
    public Optional<User> getById(int id) {
        return  userRepository.findById(id);
    }
}
