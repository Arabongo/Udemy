public class Car {
    //nelle classi il nome con la maiuscola
    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertibile;
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    // public void setMake(String make {
    // if(make == null) make = "Unknown";
    // String lowercaseMake = make.toLowerCase();
    //switch (lovercaseMake)  {
    //    case "holden" , "porche" , "tesla" -> this.make = make;
    //    default -> {
    //        this.make = "Unsupported";
    //    }
    //  }
    //}
    // in questo caso stiamo mettendo delle restrizioni al setMake nel caso volessimo che solo tre marche fossero accettate
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getDoors() {
        return doors;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }
    public boolean isConvertibile() {
        return convertibile;
    }
    public void setConvertibile(boolean convertibile) {
        this.convertibile = convertibile;
    }
    public void toStringDescribe(){
        System.out.println( doors + "-Door" +
                color + " " +
                make + " " +
                model + " " +
                (convertibile ? "Convertibile" : " "));
    }
}
