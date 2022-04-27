package pl.horus.horustask.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BlockTest {

    private Block block;

    @Test
    public void testGetColor() {
        //Given
        Block block = new WallBlock("Czarny", "Beton");
        //When
        String resultGetColor = block.getColor();
        //Then
        assertEquals("Czarny", resultGetColor);
    }

    @Test
    public void testGetMaterial() {
        //Given
        Block block = new WallBlock("Czarny", "Beton");
        //When
        String resultGetMaterial = block.getMaterial();
        //Then
        assertEquals("Beton", resultGetMaterial);
    }
}
