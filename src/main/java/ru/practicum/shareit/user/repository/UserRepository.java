package ru.practicum.shareit.user.repository;

import ru.practicum.shareit.user.dto.UserDto;
import ru.practicum.shareit.user.model.User;

import java.util.List;

public interface UserRepository {
    User add(User user);

    User update(User user);

    void delete(long id);

    User getById(long id);

    List<User> getAll();

    boolean checkEmail(UserDto userDto);
}
