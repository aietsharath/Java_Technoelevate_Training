class TestTime{
public static void main(String args[]){
Watch w=new SmartWatch();
SmartWatch sw=new SmartWatch();
w.price=1800;
w.displayTime();
sw.price=19000;
sw.displayTime();
sw.displaypulseRate();
}
}