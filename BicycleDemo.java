class bicycleDemo{
  public static void main(String[] args)
  {
    Bicycle bike1 = new Bicycle();
    Bicycle bike2 = new Bicycle();
    
    bike1.changecadence(50);
    bike1.speedup(10);
    bike1.changegear(2);
    bike1.printStates();
    
    bike2.changecadence(50);
    bike2.speedup(10);
    bike2.changegear(2);
    bike2.changecadence(40);
    bike2.speedup(10);
    bike2.changegear(3);
    bike2.printStates();
    }
}