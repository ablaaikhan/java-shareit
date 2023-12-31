package ru.practicum.shareit.user.model;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PositiveOrZero;

/**
 * TODO Sprint add-controllers.
 */
@Data
@Builder
public class User {
    @PositiveOrZero
    private Long id;
    @NotBlank(message = "Имя не должно быть пустым.")
    private String name;
    @Email(message = "Введён не email.")
    @NotBlank(message = "Email не должно быть пустым.")
    private String email;

}
