import javax.sound.midi.*;

public class MusicTest {
    public void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("시퀀스 성공");
        } catch (MidiUnavailableException e) {
            System.out.println("Bummer");
        }
    }

    public static void main(String[] args) {
        MusicTest mt = new MusicTest();
        mt.play();
    }
}
