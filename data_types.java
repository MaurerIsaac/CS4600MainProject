import java.util.LinkedList;
class integer {
    public int value;
    public String name;
    public integer(int value, String name) {
        this.value = value;
        this.name = name;
    }
    int add(integer other) {
        this.value += other.value;
        return this.value;
    }
    int subtract(integer other) {
        this.value -= other.value;
        return this.value;
    }
    int multiply(integer other) {
        this.value *= other.value;
        return this.value;
    }
    int divide(integer other) {
        this.value /= other.value;
        return this.value;
    }
    int modulus(integer other) {
        this.value %= other.value;
        return this.value;
    }
    int addfloat(float_point other) {
        this.value += (int)other.value;
        return this.value;
    }
    int subtractfloat(float_point other) {
        this.value -= (int)other.value;
        return this.value;
    }   
    int multiplyfloat(float_point other) {
        this.value *= (int)other.value;
        return this.value;
    }
    int dividefloat(float_point other) {
        this.value /= (int)other.value;
        return this.value;
    }
    float toFloat() {
        return (float)this.value;
    }
}
class float_point {
    public float value;
    public String name;
    public float_point(float value, String name) {
        this.value = value;
        this.name = name;
    }
    float add(float_point other) {
        return this.value + other.value;
    }
    float subtract(float_point other) {
        return this.value - other.value;
    }
    float multiply(float_point other) {
        return this.value * other.value;
    }
    float divide(float_point other) {
        return this.value / other.value;
    }
    float addinteger(integer other) {
        return this.value + other.value;
    }
    float subtractinteger(integer other) {
        return this.value - other.value;
    }   
    float multiplyinteger(integer other) {
        return this.value * other.value;
    }
    float divideinteger(integer other) {
        return this.value / other.value;
    }
    int toInteger() {
        return (int)this.value;
    }
}
class structure {
    public LinkedList<Object> members;
    public String name;
    public structure(String name) {
        this.name = name;
        this.members = new LinkedList<Object>();
    }
    void addMember(Object member) {
        this.members.add(member);
    }
    Object getMemberbyName (String name) {
        for (Object member : members) {
            if (member instanceof integer && ((integer) member).name.equals(name)) {
                return member;
            } else if (member instanceof float_point && ((float_point) member).name.equals(name)) {
                return member;
            }
        }
        return null;
    }
}