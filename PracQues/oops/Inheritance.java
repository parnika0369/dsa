class Car{
    String name;
    String year;
    String type;
    public Car(String name,String year,String type){
      this.name = name;
      this.year = year;
      this.type = type;
    }
    void start(){
      System.out.println("engine start");
    }
    void stop(){
      System.out.println("enigine stop");
    }
  }
  class BrandedCar extends Car{
    String brandName;
    String audio;
    public BrandedCar(String name,String year,String type,String brandName,
    String audio){
      super(name,year,type);
      this.brandName = brandName;
      this.audio = audio;
    }
    void playAudio(){
      System.out.println("play audio");
      audio+=1;
      System.out.println(audio);
    }
  }
  class EVCar extends BrandedCar{
    String lifetime;
    String battery;
    public EVCar(String name,String year,String type,String brandName,
    String audio,String lifetime,String battery){
      super(name,year,type,brandName,audio);
      this.lifetime=lifetime;
      this.battery=battery;
    }
  
    void charge(){
      System.out.println("charge");
    }
  }
  public class Inheritance
  {
    public static void main(String[] args){
  
      EVCar ev = new EVCar("abc","ahdggd","sjdj","dhfj","jfh","jkhfh","kfdh");
      System.out.println(ev.audio);
      ev.playAudio();
      System.out.println(ev.audio);
    }
  }