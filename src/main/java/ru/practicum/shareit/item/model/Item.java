package ru.practicum.shareit.item.model;

import lombok.Builder;
import lombok.Data;
import ru.practicum.shareit.request.ItemRequest;
import ru.practicum.shareit.user.model.User;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PositiveOrZero;

/**
 * TODO Sprint add-controllers.
 */
@Data
@Builder
public class Item {
    @PositiveOrZero
    private long id;
    private User owner;
    @NotBlank(message = "Имя не должно быть пустым.")
    private String name;
    @NotBlank(message = "Описание не должно быть пустым.")
    private String description;
    private boolean available;
    private ItemRequest request;
}
