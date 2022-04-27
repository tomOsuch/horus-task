package pl.horus.horustask.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class WallBlock implements Block {

    private final String color;
    private final String material;
}
