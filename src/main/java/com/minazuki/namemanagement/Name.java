package com.minazuki.namemanagement;

public class Name { private int id;
    private String name;

    public Name(int id, String name) {
        this.id = id; // idフィールドに正しい値を代入する必要があります
        this.name = name; // nameフィールドに正しい値を代入する必要があります
    }

    public String getName() {
        return name; // getNameメソッドの戻り値を正しいように修正します
    }

    public int getId() {
        return id;
    }
}


