import org.telegram.telegrambots.api.methods.BotApiMethod;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramWebhookBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

/**
 * Created by 4an70m on 24.02.2018.
 */
public class IdkKevBot extends TelegramWebhookBot {

    public BotApiMethod onWebhookUpdateReceived(Update update) {
        if(update.hasMessage() && update.getMessage().hasText()) {
            String messageText = update.getMessage().getText();
            long chatId = update.getMessage().getChatId();

            SendMessage message = new SendMessage()
                    .setChatId(chatId)
                    .setText(messageText);
            try {
                execute(message);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public String getBotUsername() {
        return BotConfig.botName;
    }

    public String getBotToken() {
        return BotConfig.botToken;
    }

    public String getBotPath() {
        return BotConfig.botPath;
    }
}
