package ru.gubern.tacocloud.repository;

import ru.gubern.tacocloud.tacos.Ingredient;

import java.util.Optional;

public interface IngredientRepository {
    Iterable<Ingredient> findAll();
    Optional<Ingredient> findById(String id);

    Ingredient save(Ingredient ingredient);
}
