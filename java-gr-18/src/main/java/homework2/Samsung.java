package homework2;

public class Samsung extends Device implements Phone{
    private final int IMEI = 18446545;

    private String model;

    public String getModel() {
        return model;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void addContact(String s, int phone_number, String first_name, String last_name) {

    }

    @Override
    public void listContacts() {

    }

}
