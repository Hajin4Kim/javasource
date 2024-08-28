package modifier;

public class Card {
    final int NUMBER;
    final String KIND;

    static int width = 100;
    static int height = 150;

    // ERROR: The blank final field KIND may not have been initialized
    Card(String kind, int num){ //TODO: 초기화를 직접 하거나, 값을 줘야함
        this.NUMBER = 0;
        this.KIND = "";

    }
    Card(){
        this("HEART", 2);

    }

    @Override
    public String toString() {
        // return super.toString();
        return KIND + " " + NUMBER;
    }

}
