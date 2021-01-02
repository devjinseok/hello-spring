package hello.hellospring.controller;

public class MemberForm {
    private String name;

    public String getNames() {
        return name;
    }
    public void setNames(String name) {
        System.out.println("여기왔다" + name);
        this.name = name;
    }
}
