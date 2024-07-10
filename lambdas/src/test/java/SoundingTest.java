import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import SoudPack.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SoundingTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testCatSound() {
        Cat cat = new Cat();
        cat.sound();
        assertEquals("meow\n", outContent.toString());
    }

    @Test
    public void testDogSound() {
        Dog dog = new Dog();
        dog.sound();
        assertEquals("woof\n", outContent.toString());
    }

    @Test
    public void testCowSound() {
        Cow cow = new Cow();
        cow.sound();
        assertEquals("moo\n", outContent.toString());
    }

    @Test
    public void testAnonymousClassSound() {
        Sounding anonymousSound = new Sounding() {
            @Override
            public void sound() {
                System.out.println("quack");
            }
        };
        anonymousSound.sound();
        assertEquals("quack\n", outContent.toString());
    }

    @Test
    public void testLambdaSound() {
        Sounding lambdaSound = () -> System.out.println("chirp");
        lambdaSound.sound();
        assertEquals("chirp\n", outContent.toString());
    }

    @Test
    public void testInstanceMethodReferenceSound() {
        NotSoundingClass notSoundingInstance = new NotSoundingClass();
        Sounding instanceMethodRefSound = notSoundingInstance::instanceSound;
        instanceMethodRefSound.sound();
        assertEquals("beep\n", outContent.toString());
    }

    @Test
    public void testStaticMethodReferenceSound() {
        Sounding staticMethodRefSound = NotSoundingClass::staticSound;
        staticMethodRefSound.sound();
        assertEquals("buzz\n", outContent.toString());
    }

    @Test
    public void testListOfSounds() {
        List<Sounding> sounds = new ArrayList<>();
        sounds.add(new Cat());
        sounds.add(new Dog());
        sounds.add(new Cow());
        sounds.add(new Sounding() {
            @Override
            public void sound() {
                System.out.println("quack");
            }
        });
        sounds.add(() -> System.out.println("chirp"));
        NotSoundingClass notSoundingInstance = new NotSoundingClass();
        sounds.add(notSoundingInstance::instanceSound);
        sounds.add(NotSoundingClass::staticSound);

        sounds.forEach(Sounding::sound);

        String expectedOutput = "meow\nwoof\nmoo\nquack\nchirp\nbeep\nbuzz\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}
