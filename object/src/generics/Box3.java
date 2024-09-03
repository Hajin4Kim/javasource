package generics;

import java.util.ArrayList;

//TODO: Generic Class 로 변경 : <T>

public class Box3<T> {
    
    ArrayList<T> list = new ArrayList<>();
    
    void add(T item){
        list.add(item);
    }

    T get(int i){
        return list.get(i);
    }
    ArrayList<T> getList(){
        return list;
    }
    int size(){
        return list.size();
    }
    @Override
    public String toString() {
        return list.toString();
    }
    
    
    
}
