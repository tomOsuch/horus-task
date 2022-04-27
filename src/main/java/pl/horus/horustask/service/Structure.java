package pl.horus.horustask.service;

import pl.horus.horustask.model.Block;

import java.util.List;
import java.util.Optional;

public interface Structure {

    Optional<Block> findBlockByColor(String color);
    List<Block> findBlockByMaterial(String material);
    int count();
}
