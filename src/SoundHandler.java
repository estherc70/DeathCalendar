import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class SoundHandler {
    public static void RunMusic(String filePath) {
        try {
            File audioFile = new File(filePath);
            AudioInputStream originalStream = AudioSystem.getAudioInputStream(audioFile);

            // Get the format of the original stream
            AudioFormat baseFormat = originalStream.getFormat();

            // Define a target format (16-bit, PCM_SIGNED, stereo or mono depending on original)
            AudioFormat targetFormat = new AudioFormat(
                    AudioFormat.Encoding.PCM_SIGNED,
                    baseFormat.getSampleRate(),
                    16,
                    baseFormat.getChannels(),
                    baseFormat.getChannels() * 2,
                    baseFormat.getSampleRate(),
                    false // little endian
            );

            // Convert if needed
            AudioInputStream convertedStream = AudioSystem.getAudioInputStream(targetFormat, originalStream);

            Clip clip = AudioSystem.getClip();
            clip.open(convertedStream);
            clip.loop(0); // play once, change to loop(Clip.LOOP_CONTINUOUSLY) if needed

        } catch (UnsupportedAudioFileException | IOException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            System.err.println("Audio line unavailable: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}

