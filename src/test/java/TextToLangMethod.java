import com.github.pemistahl.lingua.api.*;

import static com.github.pemistahl.lingua.api.Language.*;

public class TextToLangMethod {

    public static String getLanguage(String text) {

        LanguageDetector detector = LanguageDetectorBuilder
                .fromLanguages(ENGLISH, FRENCH, GERMAN, SPANISH, TURKISH)
                .withMinimumRelativeDistance(0.1).build();

        Language detectedLanguage = detector.detectLanguageOf(text);

        return detectedLanguage.name();
    }
}
