import org.junit.jupiter.api.Test;
import org.simplejavamail.api.email.Email;
import org.simplejavamail.email.EmailBuilder;

public class TestSimpleJavaMail {
    @Test
    public void testMail() {
        final Email email = EmailBuilder.startingBlank()
                .from("lollypop", "lolly.pop@pretzelfun.com")
                .to("C. Cane", "candycane@candyshop.org")
                .cc("C. Bo <chocobo@candyshop.org>")
                .withSubject("hey")
                .withPlainText("We should meet up! ;)")
                .buildEmail();
    }
}
