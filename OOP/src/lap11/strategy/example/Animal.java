package lap11.strategy.example;

public class Animal {
    private SoundStrategy soundStrategy;

    public Animal() {

    }

    public void setSoundStrategy(SoundStrategy soundStrategy) {
        this.soundStrategy = soundStrategy;
    }

    public void soundStrategy() {
        this.soundStrategy.sound();
    }
}
