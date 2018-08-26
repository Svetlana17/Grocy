package com.example.user.myapplication;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;

@Entity

class Grocery {
    


    @Id(autoincrement = true)
    private Long id;

    @NotNull
    private String name;
    private int quantity;

    @Generated(hash = 1887005558)
    public Grocery(Long id, @NotNull String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    @Generated(hash = 986816186)
    public Grocery() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public void setName(String name) {
        this.name = name;
    }
}
