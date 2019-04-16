public class MyCar extends Car {
   static String vladelec;
   boolean iCanride = false;

   public MyCar(){ //конструктор
      this (MyCar.vladelec);
      System.out.println("Завершение работ без параметра");
      System.out.println("******************************");

   }
   public MyCar(String vladelec){ //общий конструктор
      super("ВАЗ","Аурус",2019,"Черный");
      System.out.println(" ыполнение общего кода");
      MyCar.vladelec="Arina";
      System.out.println("Производитель : " + manufacturer);
      System.out.println("Модель : " + model);
      System.out.println("Год выпуска : " + yearOfManufacture);
      System.out.println("Цвет : " + color);
      System.out.println( "Владелец : " + this.vladelec);

   }
   public MyCar(boolean i){
      this ( MyCar.vladelec);
      iCanride=i;
      if (iCanride){
         System.out.println("Могу прокатить - садись");

      } else{
         System.out.println("Я не катаю : ( ");
      }
   }

}




























































































