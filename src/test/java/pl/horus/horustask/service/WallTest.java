package pl.horus.horustask.service;

import org.junit.jupiter.api.Test;
import pl.horus.horustask.model.Block;
import pl.horus.horustask.model.WallBlock;
import pl.horus.horustask.service.Wall;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class WallTest {

    List<Block> blocks = List.of(
            new WallBlock("Różowy", "Gips"),
            new WallBlock("Niebieski", "Cegła"),
            new WallBlock("Czarny", "Beton"),
            new WallBlock("Czerwony", "Beton"),
            new WallBlock("Szary", "Beton")
    );

    @Test
    public void testFindBlockByColor() {
        //Given
        Wall wall = new Wall(blocks);
        //When
        Optional<Block> resultFind = wall.findBlockByColor("Czarny");
        //Then
        assertTrue(resultFind.isPresent());
    }

    @Test
    public void testFindBlockByColorIsNull() {
        //Given
        Wall wall = new Wall(blocks);
        //When
        Optional<Block> resultFind = wall.findBlockByColor("Pomarańczowy");
        //Then
        assertFalse(resultFind.isPresent());
    }

    @Test
    public void testFindBlockByMaterial() {
        //Given
        Wall wall = new Wall(blocks);
        //When
        List<Block> returnListBlockByMaterial = wall.findBlockByMaterial("Beton");
        //Then
        assertEquals(3, returnListBlockByMaterial.size());
    }

    @Test
    public void testCount() {
        //Given
        Wall wall = new Wall(blocks);
        //When
        Integer resultCount = wall.count();
        //Then
        assertEquals(5, resultCount);
    }
}
