package pl.horus.horustask.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import pl.horus.horustask.model.CompositeBlock;
import pl.horus.horustask.model.Block;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
public class Wall implements Structure, CompositeBlock {

    private List<Block> blocks;

    @Override
    public Optional<Block> findBlockByColor(String color) {

        for (Block block : blocks) {
            if (block.getColor().equalsIgnoreCase(color)) {
                return Optional.of(block);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Block> findBlockByMaterial(String material) {
        return blocks.stream()
                .filter(m -> m.getMaterial().equalsIgnoreCase(material))
                .collect(Collectors.toList());
    }

    @Override
    public int count() {
        return blocks.size();
    }
}
