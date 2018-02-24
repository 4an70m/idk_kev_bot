import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;

/**
 * Created by 4an70m on 24.02.2018.
 */
public class Main {

    public static void main(String[] args) {
        ApiContextInitializer.init();
        TelegramBotsApi botsApi = new TelegramBotsApi();
        try {
            botsApi.registerBot(new IdkKevBot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

}
