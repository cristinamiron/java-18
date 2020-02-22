package homework2;

public class DeviceMain {
    public static void main(String[] args) {

        Device siemens1 = new Siemens();
        siemens1.setManufacturer("Siemens");
        siemens1.setModel("s4");
        Device siemens2 = new Siemens();
        siemens2.setManufacturer("Siemens");
        siemens2.setModel("s10");

        Device samsung1 = new Samsung();
        samsung1.setManufacturer("Samsung");
        samsung1.setModel("SamsungGalaxy6");
        Device samsung2 = new Samsung();
        samsung2.setManufacturer("Samsung");
        samsung2.setModel("SamsungGalaxy6");

        Device phone1 = new SamsungGalaxyS6();

        // nu am inteles cum sa folosesc metodele ca si mai jos si atunci am creat contacte+mesaje + liste corespunzatoare pe care le-am parcurs cu for pentru a avea afisare contact, mesaj, metoda apelare
//        phone1.addContact("c1", 1234567890, "mihai", "madas");
//        phone1.addContact("c2", 0264500203, "radu", "carol");
//        phone1.listContacts();
//        phone1.makeACall();
//        phone1.sendTextMessage();

        Contact c1 = new Contact();
        c1.setFirst_name("mihai");
        c1.setLast_name("madas");
        c1.setPhone_number(1234567890);
        Contact c2 = new Contact();
        c2.setFirst_name("radu");
        c2.setLast_name("carol");
        c2.setPhone_number(0264500203);

        Contact[] listContact = new Contact[2];
        listContact[0] = c1;
        listContact[1] = c2;

        for (Contact contact : listContact) {
            System.out.println("Contact is: " + contact.getFirst_name() + " " + contact.getLast_name() + " " + contact.getPhone_number());
        }
//al doilea numar de telefon nu il afiseaza corect - nu inteleg de ce nu

        Message message1 = new Message();
        message1.setCharacters("Hello!");
        Message message2 = new Message();
        message2.setCharacters("How are you?");
        Message message3 = new Message();

        Message[] listMessage = new Message[2];
        listMessage[0] = message1;
        listMessage[1] = message2;

        message1.sendTextMessage();
        {
            System.out.println("Message is" + " " + message1.getCharacters());
            System.out.println("Message is:" + " " + message2.getCharacters());
            // nu stiu cum sa leg mesajele de contacte ca sa trimit mesajul 1 la contactul 1 cum e in cerinta exercitiului
            // m-am gandit la object containers (maps), doar ca la momentul cand am primit tema nu facusem inca object containers, deci exista o alta metoda...
        }

        phone1.makeACall();// nu stiu cum sa leg metoda de apelare de contactul2 ca in cerinta exercitiului- la fel ca si mai sus;
        phone1.on();
        phone1.sendMessageBattery();
        phone1.makeCallBattery();
    }
}