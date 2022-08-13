package io.pragra.jpareview.server;

import io.pragra.jpareview.entity.User;
import io.pragra.jpareview.exceptions.BadUserArgumentException;
import io.pragra.jpareview.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepo userRepo;

    public User CreateUser(User user){
        if (user.getFirstName() == null) {
            throw new BadUserArgumentException("First name cannot be null");
        }

    }
}
