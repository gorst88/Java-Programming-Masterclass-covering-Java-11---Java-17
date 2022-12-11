public class Main {
    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();

        kitchen.setKitchenState(true, true, true);
        kitchen.doKitchenWork();

//        kitchen.getDishWasher().setHasWorkToDo(true);
//        kitchen.getFridge().setHasWorkToDo(true);
//        kitchen.getBrewMaster().setHasWorkToDo(true);
//
//        kitchen.getDishWasher().doDishes();
//        kitchen.getFridge().orderFood();
//        kitchen.getBrewMaster().brewCoffee();
    }
}