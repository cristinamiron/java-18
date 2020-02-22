package homework2;

public abstract class Device implements Phone {
    private String manufacturer;
    private String model;
    private String color;
    private String material;

    private final int IMEI = 799816856;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel(String s4) {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    private int batteryLife;
    public static final int BATERRYLIFEMAXHOURS = 10;
    public static final int BATTERYLIFEMINHOURS = 0;
    private int step = 1;


    public void on() {
        System.out.println("battery life is:" + BATERRYLIFEMAXHOURS);
        this.batteryLife = BATERRYLIFEMAXHOURS;
    }

    public void off() {
        System.out.println("battery life is:" + BATTERYLIFEMINHOURS);
        this.batteryLife = BATTERYLIFEMINHOURS;
    }

    public abstract void addContact(String s, int phone_number, String first_name, String last_name);

    public abstract void listContacts();

    public void sendMessageBattery() {
        if (batteryLife > BATTERYLIFEMINHOURS) {
            batteryLife = batteryLife - step;
            System.out.println("when sending a message, the battery life becomes:" + batteryLife);
        } else {
            System.out.println("cannot send message, not enough battery.");
        }
    }

    public void makeCallBattery() {
        if (batteryLife > BATTERYLIFEMINHOURS) {
            batteryLife = batteryLife - (step * 2);
            System.out.println("when calling, the battery life becomes:" + batteryLife);
        } else {
            System.out.println("cannot call, not enough battery.");
        }
    }

    @Override
    public void createNewContact() {

    }

    @Override
    public void seeExistingContact() {

    }

    @Override
    public void sendTextMessage() {

    }

    @Override
    public void seeAllMessagesFromASpecificContact() {

    }

    @Override
    public void makeACall() {

    }

    @Override
    public void seeAllCallHistory() {

    }
}