package generics;

//TODO: Generic Class 로 변경 : <T>

public class Box2<T> {
    
    T item;

    public void setItem(T item) {
        this.item = item;
    }
    public T getItem() {
        return item;
    }
}
