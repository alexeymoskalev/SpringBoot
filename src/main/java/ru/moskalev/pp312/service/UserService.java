package ru.moskalev.pp312.service;


import ru.moskalev.pp312.model.User;

import java.util.List;

public interface UserService {
    List<User> usersList();

    User getUser(long id);

    void adduser(User user);

    void delete(long id);

    void update(User user);
}