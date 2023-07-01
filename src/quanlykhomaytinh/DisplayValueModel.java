package quanlykhomaytinh;

public class DisplayValueModel {

    public Object displayMember;
    public Object valueMember;

    public DisplayValueModel(Object display, Object value) {
        displayMember = display;
        valueMember = value;
    }

    @Override
    public String toString() {
        return displayMember.toString();
    }
}
