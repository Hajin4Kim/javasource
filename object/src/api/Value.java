package api;

// extends Object 기본 상태
public class Value {
    int value;

    public Value(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        //TODO: 주소비교 대신 값 비교로 "재정의"함 @Override
        Value other = (Value) obj;
        if (value != other.value)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Value [value=" + value + "]";
    }

    
    
}
