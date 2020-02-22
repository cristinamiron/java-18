package homework2;

public class Siemens extends Device implements Phone {
    private final int IMEI = 78658575;
    private String model;

    public String getModel(String s4) {
        return model;
    }

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
