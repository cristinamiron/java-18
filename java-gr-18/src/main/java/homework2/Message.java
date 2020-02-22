package homework2;

public class Message extends Contact implements Phone {
    private String characters;

    public void createMessage() {
        if (characters.length() > 500) {
            System.out.println("Maximum number of characters exceeded.Please create new message");
        }
    }

    public String getCharacters() {
        return characters;
    }

    public void setCharacters(String characters) {
        this.characters = characters;
    }

    @Override
    public void sendTextMessage() {


    }

    @Override
    public void seeAllMessagesFromASpecificContact() {

    }
}
