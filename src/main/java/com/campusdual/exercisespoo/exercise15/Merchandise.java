package com.campusdual.exercisespoo.exercise15;

public abstract class Merchandise {

    protected String name;
    protected String uniqueId;
    protected String ResponsiblieId;
    protected int zone;
    protected String area;
    protected String shelf;
    protected int quantity;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniqueId() {
        return this.uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getResponsiblieId() {
        return this.ResponsiblieId;
    }

    public void setResponsiblieId(String responsiblieId) {
        this.ResponsiblieId = responsiblieId;
    }

    public int getZone() {
        return this.zone;
    }

    public void setZone(int zone) {
        this.zone = zone;
    }

    public String getArea() {
        return this.area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getShelf() {
        return this.shelf;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Merchandise(String name, String uniqueId, String responsiblieId) {
        this.name = name;
        this.uniqueId = uniqueId;
        ResponsiblieId = responsiblieId;
    }

    public Merchandise(String name, String uniqueId, String responsiblieId, int zone, String area, String shelf, int quantity) {
        this.name = name;
        this.uniqueId = uniqueId;
        ResponsiblieId = responsiblieId;
        this.zone = zone;
        this.area = area;
        this.shelf = shelf;
        this.quantity = quantity;
    }
    public String getLocation(){
        StringBuilder builder = new StringBuilder();
        builder.append("Z - ");
        builder.append(this.getZone());
        builder.append(" A - ");
        builder.append(this.getArea());
        builder.append(" E - ");
        builder.append(this.getShelf());

        return builder.toString();
    }

    public abstract Object getSpecificData();

}