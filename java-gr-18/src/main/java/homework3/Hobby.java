package homework3;

public class Hobby  {
    private String hobbyName;
    private int hobbyFrequency;
    private String hobbyLocation;

    public Hobby(String hobbyName, int hobbyFrequency, String hobbyLocation) {
        this.hobbyName = hobbyName;
        this.hobbyFrequency = hobbyFrequency;
        this.hobbyLocation = hobbyLocation;
    }

    public String getHobbyName() {
        return hobbyName;
    }

    public void setHobbyName(String hobbyName) {
        this.hobbyName = hobbyName;
    }

    public int getHobbyFrequency() {
        return hobbyFrequency;
    }

    public void setHobbyFrequency(int hobbyFrequency) {
        this.hobbyFrequency = hobbyFrequency;
    }

    public String getHobbyLocation() {
        return hobbyLocation;
    }

    public void setHobbyLocation(String hobbyLocation) {
        this.hobbyLocation = hobbyLocation;
    }


    }
    //
//    public static void main(String[] args) {
//
//        HashMap<String, String> Hobbies = new HashMap<String, String>();
//
//        Hobbies.put("swimimg", "Romania");
//        Hobbies.put("hyking", "Greece");
//        Hobbies.put("reading", "Romania");
//        Hobbies.put("cycling", "France");
//        System.out.println(Hobbies);
//
//    }
//



