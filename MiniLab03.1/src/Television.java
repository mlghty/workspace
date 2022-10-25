/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

class Television {

    public static int instanceCount = 0;

    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;

    private String brand;
    private static int volume;

    public Television() {
        instanceCount++;
    }

    public Television(String brand, int volume) {
        setBrand(brand);
        setVolume(volume);
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String toString() {
        return "Television: brand=" + getBrand() + ", volume=" + getVolume();
    }
}