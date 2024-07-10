package SoudPack;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Sounding> sounds = new ArrayList<>();

        sounds.add(new Cat());
        sounds.add(new Dog());
        sounds.add(new Cow());

        for (Sounding sound : sounds) {
            sound.sound();
        }

        sounds.add(new Sounding() {
            @Override
            public void sound() {
                System.out.println("quack");
            }
        });

        for (Sounding sound : sounds) {
            sound.sound();
        }

        sounds.add(() -> System.out.println("chirp"));

        for (Sounding sound : sounds) {
            sound.sound();
        }

        NotSoundingClass notSoundingInstance = new NotSoundingClass();
        sounds.add(notSoundingInstance::instanceSound);
        sounds.add(NotSoundingClass::staticSound);

        for (Sounding sound : sounds) {
            sound.sound();
        }

        sounds.forEach(Sounding::sound);
    }
}
