package pl.horus.horustask.model;

import pl.horus.horustask.model.Block;

import java.util.List;

public interface CompositeBlock extends Block {
    List<Block> getBlocks();
}
