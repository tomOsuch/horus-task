package pl.horus.horustask.model;

public interface Block {

    default public String getColor() {
        return this.getColor();
    }
    default public String getMaterial() {
        return this.getMaterial();
    }
}
